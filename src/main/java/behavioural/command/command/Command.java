package behavioural.command.command;

import behavioural.command.editor.Editor;

/**
 * Created by Антон Дементьев on 17.02.2018.
 */
public  abstract class Command {
    private Editor editor;
    protected String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public Editor getEditor() {
        return editor;
    }

    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    protected void backup(){
        backup = editor.getTextArea().getText();
    }

    public void undo(){
        editor.getTextArea().setText(backup);
    }

    public abstract boolean execute();

}
