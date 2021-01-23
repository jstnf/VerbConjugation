package dev.justinf.conjugation;

import dev.justinf.conjugation.gui.VerbConjugationWindow;
import dev.justinf.conjugation.locale.VCLocale;
import dev.justinf.conjugation.type.Conjugation;
import dev.justinf.conjugation.type.ConjugationMa;
import dev.justinf.conjugation.type.ConjugationMag;
import dev.justinf.conjugation.type.ConjugationUm;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class VerbConjugationApp {

    private final Map<JRadioButton, Conjugation> conjugationMap;

    private Conjugation conjugation;
    private VerbConjugationWindow window;

    public VerbConjugationApp() {
        window = new VerbConjugationWindow(this);
        conjugationMap = new HashMap<>();

        conjugation = new ConjugationUm(); // Default selected conjugation
        conjugationMap.put(window.getUmRadio(), conjugation);
        conjugationMap.put(window.getMagRadio(), new ConjugationMag());
        conjugationMap.put(window.getMaRadio(), new ConjugationMa());
    }

    public void start() {
        JFrame frame = new JFrame("Filipino Verb Conjugation");
        frame.setContentPane(window.getFrame());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void update(String root) {
        int rootIndex = conjugation.rootIndex(root);
        window.updateExplanationArea(conjugation.explanation(root));
        if (rootIndex == -1) {
            window.getNeutralTextField().setText(VCLocale.INVALID_ROOT.msg());
            window.getPastTextField().setText(VCLocale.INVALID_ROOT.msg());
            window.getPresentTextField().setText(VCLocale.INVALID_ROOT.msg());
            window.getFutureTextField().setText(VCLocale.INVALID_ROOT.msg());
        } else {
            window.getNeutralTextField().setText(conjugation.neutral(root));
            window.getPastTextField().setText(conjugation.past(root));
            window.getPresentTextField().setText(conjugation.present(root));
            window.getFutureTextField().setText(conjugation.future(root));
        }
    }

    public void setConjugation(JRadioButton radioButton) {
        conjugation = conjugationMap.get(radioButton);
    }

    public Conjugation getConjugation() {
        return conjugation;
    }
}