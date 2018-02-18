package behavioural.command.command;

import java.util.Stack;

/**
 * Created by Антон Дементьев on 17.02.2018.
 */
public class CommandHistory {
    private final Stack<Command> history = new Stack<>();


    public void push(Command command){
        history.push(command);
    }

    public Command pop(){
        return history.pop();
    }

    public boolean isEmoty(){
        return history.isEmpty();
    }

}
