package behavioural.command.editor;

import behavioural.command.command.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Антон Дементьев on 17.02.2018.
 */
public class Editor {
    private JTextArea textArea;
    private String clipboard;
    private CommandHistory history = new CommandHistory();


    public void init() {
        JFrame frame = new JFrame("Notepad");
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        panel.add(textArea);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton copy = new JButton("Copy");
        JButton cut = new JButton("Cut");
        JButton past = new JButton("Past");
        JButton undo = new JButton("Undo");
        final Editor editor = this;
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutCommand(editor));
            }
        });
        past.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteCommand(editor));
            }
        });
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });
        buttons.add(copy);
        buttons.add(cut);
        buttons.add(past);
        buttons.add(undo);
        panel.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    private void executeCommand(Command command) {
        if (command.execute())
            history.push(command);
    }

    private void undo() {
        if (history.isEmoty()) return;
        Command command = history.pop();
        if (command != null)
            command.undo();

    }

    public JTextArea getTextArea() {
        return textArea;
    }


    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }
}
