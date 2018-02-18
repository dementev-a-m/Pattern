package behavioural.command.command;

import behavioural.command.editor.Editor;

/**
 * Created by Антон Дементьев on 17.02.2018.
 */
public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        super.getEditor().setClipboard(super.getEditor().getTextArea().getSelectedText());
        return false;
    }
}
