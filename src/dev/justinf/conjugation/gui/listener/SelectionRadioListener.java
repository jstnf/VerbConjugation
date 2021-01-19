package dev.justinf.conjugation.gui.listener;

import dev.justinf.conjugation.VerbConjugationApp;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionRadioListener implements ActionListener {

    private final VerbConjugationApp app;
    private final JTextField rootTextField;
    private final JRadioButton button;

    public SelectionRadioListener(VerbConjugationApp app, JTextField rootTextField, JRadioButton button) {
        this.app = app;
        this.rootTextField = rootTextField;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        app.setConjugation(button);
        Document d = rootTextField.getDocument();
        try {
            app.update(d.getText(0, d.getLength()));
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
}