package dev.justinf.conjugation.type;

import dev.justinf.conjugation.locale.VCLocale;

public class ConjugationMag implements Conjugation {

    @Override
    public String neutral(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        if (rootIndex == 0) {
            return "mag-" + root;
        } else {
            return "mag" + root;
        }
    }

    @Override
    public String past(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        if (rootIndex == 0) {
            return "nag-" + root;
        } else {
            return "nag" + root;
        }
    }

    @Override
    public String present(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        if (rootIndex == 0) {
            return "nag-" + root.charAt(0) + root;
        } else {
            return "nag" + root.substring(0, 2) + root;
        }
    }

    @Override
    public String future(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        if (rootIndex == 0) {
            return "mag-" + root.charAt(0) + root;
        } else {
            return "mag" + root.substring(0, 2) + root;
        }
    }

    @Override
    public String explanation(String root) {
        switch (rootIndex(root)) {
            case 0:
                return VCLocale.EXPLANATION_MAG_VOWEL_FIRST.msg();
            case 1:
                return VCLocale.EXPLANATION_MAG.msg();
            default:
                return VCLocale.EXPLANATION_INVALID_ROOT.msg();
        }
    }
}