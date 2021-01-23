package dev.justinf.conjugation.type;

import dev.justinf.conjugation.locale.VCLocale;

public class ConjugationMa implements Conjugation {

    @Override
    public String neutral(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        return "ma" + root;
    }

    @Override
    public String past(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        return "na" + root;
    }

    @Override
    public String present(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        if (rootIndex == 0) {
            return "na" + root.charAt(0) + root;
        } else {
            return "na" + root.substring(0, 2) + root;
        }
    }

    @Override
    public String future(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        if (rootIndex == 0) {
            return "ma" + root.charAt(0) + root;
        } else {
            return "ma" + root.substring(0, 2) + root;
        }
    }

    @Override
    public String explanation(String root) {
        if (rootIndex(root) == -1) {
            return VCLocale.EXPLANATION_INVALID_ROOT.msg();
        } else {
            return VCLocale.EXPLANATION_MA.msg();
        }
    }
}