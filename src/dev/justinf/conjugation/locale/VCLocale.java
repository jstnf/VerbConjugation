package dev.justinf.conjugation.locale;

public enum VCLocale {

    INVALID_ROOT("<invalid root>"),
    EXPLANATION_INVALID_ROOT("Enter a valid root to view the\n" +
            "verb conjugation rule explanation."),
    EXPLANATION_UM("um verbs:\n" +
            "\n" +
            "Neu.: Add \"um\" before the first vowel of the root\n" +
            "Per.: Add \"um\" before the first vowel of the root\n" +
            "Imp.: Add \"um\" before the first vowel of the root, follow with repeat first syllable of root\n" +
            "Kon.: Repeat first syllable of root\n"),
    EXPLANATION_MAG("mag verbs:\n" +
            "\n" +
            "Neu.: Add \"mag\" before the root\n" +
            "Per.: Add \"nag\" before the root\n" +
            "Imp.: Add \"nag\" before the root, repeat first syllable of root\n" +
            "Kon.: Add \"mag\" before the root, repeat first syllable of root\n"),
    EXPLANATION_MAG_VOWEL_FIRST("mag verbs:\n" +
            "EXCEPTION: Because the root begins with a vowel,\n" +
            "add a - after the mag prefix.\n" +
            "\n" +
            "Neu.: Add \"mag-\" before the root\n" +
            "Per.: Add \"nag-\" before the root\n" +
            "Imp.: Add \"nag-\" before the root, repeat first syllable of root\n" +
            "Kon.: Add \"mag-\" before the root, repeat first syllable of root\n"),
    EXPLANATION_MA("ma verbs:\n" +
            "\n" +
            "Neu.: Add \"ma\" before the root\n" +
            "Per.: Add \"na\" before the root\n" +
            "Imp.: Add \"na\" before the root, repeat first syllable of root\n" +
            "Kon.: Add \"ma\" before the root, repeat first syllable of root\n"),
    TEST("test");

    private String msg;

    VCLocale(String msg) {
        this.msg = msg;
    }

    public String msg() {
        return msg;
    }

    public String args(String... args) {
        // TODO
        return msg;
    }
}