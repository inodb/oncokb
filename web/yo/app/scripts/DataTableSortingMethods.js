/**
 * @author Hongxin Zhang on 11/28/16.
 */

jQuery.extend(jQuery.fn.dataTableExt.oSort, {
    'num-html-pre': function(a) {
        var x = jQuery(a).text();
        return parseFloat(x);
    },

    'num-html-asc': function(a, b) {
        return a - b;
    },

    'num-html-desc': function(a, b) {
        return b - a;
    }
});
