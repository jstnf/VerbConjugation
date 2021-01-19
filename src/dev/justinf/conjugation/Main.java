package dev.justinf.conjugation;

import javax.swing.*;

public class Main {

    public static void main(String[] cheese) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException |
                ClassNotFoundException |
                InstantiationException |
                IllegalAccessException e) {
            e.printStackTrace();
            return;
        }

        VerbConjugationApp app = new VerbConjugationApp();
        app.start();
    }
}