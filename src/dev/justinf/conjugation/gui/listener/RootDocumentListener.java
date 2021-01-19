package dev.justinf.conjugation.gui.listener;

import dev.justinf.conjugation.VerbConjugationApp;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class RootDocumentListener implements DocumentListener {

    private final VerbConjugationApp app;

    public RootDocumentListener(VerbConjugationApp app) {
        this.app = app;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        update(e.getDocument());
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        update(e.getDocument());
    }

    @Override
    public void changedUpdate(DocumentEvent e) { }

    private void update(Document doc) {
        try {
            app.update(doc.getText(0, doc.getLength()));
        } catch (BadLocationException ignored) { }
    }
}