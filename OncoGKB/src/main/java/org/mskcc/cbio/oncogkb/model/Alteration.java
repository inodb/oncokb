package org.mskcc.cbio.oncogkb.model;
// Generated Dec 18, 2013 3:43:05 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Alteration generated by hbm2java
 */
public class Alteration  implements java.io.Serializable {


     private Integer alterationId;
     private Gene gene;
     private String alteration;
     private String type;
     private Set<DrugSensitivityEvidence> drugSensitivityEvidences = new HashSet<DrugSensitivityEvidence>(0);
     private Set<AlterationActivityEvidence> alterationActivityEvidences = new HashSet<AlterationActivityEvidence>(0);

    public Alteration() {
    }

	
    public Alteration(Gene gene, String alteration, String type) {
        this.gene = gene;
        this.alteration = alteration;
        this.type = type;
    }
    public Alteration(Gene gene, String alteration, String type, Set<DrugSensitivityEvidence> drugSensitivityEvidences, Set<AlterationActivityEvidence> alterationActivityEvidences) {
       this.gene = gene;
       this.alteration = alteration;
       this.type = type;
       this.drugSensitivityEvidences = drugSensitivityEvidences;
       this.alterationActivityEvidences = alterationActivityEvidences;
    }
   
    public Integer getAlterationId() {
        return this.alterationId;
    }
    
    public void setAlterationId(Integer alterationId) {
        this.alterationId = alterationId;
    }
    public Gene getGene() {
        return this.gene;
    }
    
    public void setGene(Gene gene) {
        this.gene = gene;
    }
    public String getAlteration() {
        return this.alteration;
    }
    
    public void setAlteration(String alteration) {
        this.alteration = alteration;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set<DrugSensitivityEvidence> getDrugSensitivityEvidences() {
        return this.drugSensitivityEvidences;
    }
    
    public void setDrugSensitivityEvidences(Set<DrugSensitivityEvidence> drugSensitivityEvidences) {
        this.drugSensitivityEvidences = drugSensitivityEvidences;
    }
    public Set<AlterationActivityEvidence> getAlterationActivityEvidences() {
        return this.alterationActivityEvidences;
    }
    
    public void setAlterationActivityEvidences(Set<AlterationActivityEvidence> alterationActivityEvidences) {
        this.alterationActivityEvidences = alterationActivityEvidences;
    }




}

