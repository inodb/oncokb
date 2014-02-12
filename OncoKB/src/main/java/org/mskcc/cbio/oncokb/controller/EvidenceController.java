/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mskcc.cbio.oncokb.controller;

import java.util.Collections;
import java.util.List;
import org.mskcc.cbio.oncokb.bo.EvidenceBo;
import org.mskcc.cbio.oncokb.bo.GeneBo;
import org.mskcc.cbio.oncokb.model.Evidence;
import org.mskcc.cbio.oncokb.model.Gene;
import org.mskcc.cbio.oncokb.util.ApplicationContextSingleton;
import org.springframework.context.ApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author jgao
 */
@Controller
public class EvidenceController {
    
    @RequestMapping(value="/evidence.json")
    public @ResponseBody List<Evidence> getAlteration(
            @RequestParam(value="entrez_gene_id", required=false) Integer entrezGeneId,
            @RequestParam(value="hugo_symbol", required=false) String hugoSymbol) {
        
        ApplicationContext applicationContext = ApplicationContextSingleton.getApplicationContext();
        
        GeneBo geneBo = GeneBo.class.cast(applicationContext.getBean("geneBo"));
        
        Gene gene = null; 
        if (entrezGeneId!=null) {
            gene = geneBo.findGeneByEntrezGeneId(entrezGeneId);
        }
        
        if (hugoSymbol!=null) {
            gene = geneBo.findGeneByHugoSymbol(hugoSymbol);
        }
        
        if (gene == null) {
            return Collections.emptyList();
        }
        
        EvidenceBo evidenceBo = EvidenceBo.class.cast(applicationContext.getBean("evidenceBo"));
        
        return evidenceBo.findEvidencesByGene(gene.getEntrezGeneId());
    }
}