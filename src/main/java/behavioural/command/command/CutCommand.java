package behavioural.command.command;

import behavioural.command.editor.Editor;

import javax.swing.*;

/**
 * Created by Антон Дементьев on 17.02.2018.
 */
public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (super.getEditor().getTextArea().getSelectedText().isEmpty()) return false;
        backup();
        String source = super.getEditor().getTextArea().getText();
        super.getEditor().setClipboard(super.getEditor().getTextArea().getSelectedText());
        super.getEditor().getTextArea().setText(cutString(source, super.getEditor().getClipboard()));
        return false;
    }

    private String cutString(String source, String clipboard) {
        String start = source.substring(0, super.getEditor().getTextArea().getSelectionStart());
        String end = source.substring(super.getEditor().getTextArea().getSelectionEnd(), source.length());
        return start + end;
    }
}
