package dev.justinf.conjugation.gui;

import dev.justinf.conjugation.VerbConjugationApp;
import dev.justinf.conjugation.gui.listener.RootDocumentListener;
import dev.justinf.conjugation.gui.listener.SelectionRadioListener;

import javax.swing.*;

public class VerbConjugationWindow {

    private VerbConjugationApp app;

    /* Components */
    private JPanel frame;
    private JPanel rootPanel;
    private JLabel rootLabel;
    private JTextField rootTextField;
    private JPanel selectionPanel;
    private JRadioButton umRadio;
    private JRadioButton magRadio;
    private JRadioButton maRadio;
    private JPanel rootLabelPanel;
    private JPanel verbTypeLabelPanel;
    private JLabel verbTypeLabel;
    private JPanel resultLabelPanel;
    private JLabel resultLabel;
    private JLabel neutralLabel;
    private JLabel pastLabel;
    private JLabel presentLabel;
    private JLabel futureLabel;
    private JTextField neutralTextField;
    private JTextField pastTextField;
    private JTextField presentTextField;
    private JTextField futureTextField;
    private JPanel resultPanel;

    public VerbConjugationWindow(VerbConjugationApp app) {
        this.app = app;
        rootTextField.getDocument().addDocumentListener(new RootDocumentListener(app));
        umRadio.addActionListener(new SelectionRadioListener(app, rootTextField, umRadio));
        magRadio.addActionListener(new SelectionRadioListener(app, rootTextField, magRadio));
        maRadio.addActionListener(new SelectionRadioListener(app, rootTextField, maRadio));
    }

    public JPanel getFrame() {
        return frame;
    }

    public JRadioButton getUmRadio() {
        return umRadio;
    }

    public JRadioButton getMagRadio() {
        return magRadio;
    }

    public JRadioButton getMaRadio() {
        return maRadio;
    }

    public JTextField getNeutralTextField() {
        return neutralTextField;
    }

    public JTextField getPastTextField() {
        return pastTextField;
    }

    public JTextField getPresentTextField() {
        return presentTextField;
    }

    public JTextField getFutureTextField() {
        return futureTextField;
    }
}
