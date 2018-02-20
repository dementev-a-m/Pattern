package structural.flyweight.trees;

import java.awt.*;

/**
 * Created by adementev on 20.02.2018.
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics graphics){
        type.draw(graphics,x,y);
    }
}
