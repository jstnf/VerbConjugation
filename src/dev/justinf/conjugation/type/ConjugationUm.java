package dev.justinf.conjugation.type;

public class ConjugationUm implements Conjugation {

    @Override
    public String neutral(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        if (rootIndex == 0) {
            return "um" + root;
        } else {
            return root.charAt(0) + "um" + root.substring(1);
        }
    }

    @Override
    public String past(String root) {
        return neutral(root);
    }

    @Override
    public String present(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        /**
         * rootIndex @ 0:
         * first letter is vowel
         * um + repeat vowel + root
         *
         * rootIndex @ 1:
         * second letter is vowel
         * first letter + um + second letter + root
         */

        if (rootIndex == 0) {
            return "um" + root.charAt(0) + root;
        } else {
            return root.charAt(0) + "um" + root.charAt(1) + root;
        }
    }

    @Override
    public String future(String root) {
        int rootIndex = rootIndex(root);
        if (rootIndex == -1) return null;

        /**
         * rootIndex @ 0:
         * first letter is vowel
         * vowel + root
         *
         * rootIndex @ 1:
         * second letter is vowel
         * first two letters + root
         */

        if (rootIndex == 0) {
            return root.charAt(0) + root;
        } else {
            return root.substring(0, 2) + root;
        }
    }
}
