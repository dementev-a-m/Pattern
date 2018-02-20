package behavioural.command.command;

import behavioural.command.editor.Editor;

/**
 * Created by Антон Дементьев on 17.02.2018.
 */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (super.getEditor().getClipboard().isEmpty())
            return false;

        backup();
        super.getEditor().getTextArea().append(super.getEditor().getClipboard());
        return true;

    }
}
