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
    private JPanel explanationLabelPanel;
    private JPanel explanationPanel;
    private JScrollPane explanationScrollWrapper;
    private JTextArea explanationTextArea;
    private JLabel explanationLabel;

    public VerbConjugationWindow(VerbConjugationApp app) {
        this.app = app;
        rootTextField.getDocument().addDocumentListener(new RootDocumentListener(app));
        umRadio.addActionListener(new SelectionRadioListener(app, rootTextField, umRadio));
        magRadio.addActionListener(new SelectionRadioListener(app, rootTextField, magRadio));
        maRadio.addActionListener(new SelectionRadioListener(app, rootTextField, maRadio));
    }

    public void updateExplanationArea(String text) {
        String oldText = explanationTextArea.getText();
        if (text.equalsIgnoreCase(oldText)) return; // If the explanation is the same, do nothing

        explanationTextArea.setText(text);
        new Thread(() -> {
            try {
                Thread.sleep(10);
            } catch (Exception ignored) {
                return;
            }

            // We can now assume that the text is changed, so we need to reset the scrollbar position
            JScrollBar vertBar = explanationScrollWrapper.getVerticalScrollBar();
            vertBar.setValue(vertBar.getMinimum());
        }).start();
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

    public JTextArea getExplanationTextArea() {
        return explanationTextArea;
    }
}
