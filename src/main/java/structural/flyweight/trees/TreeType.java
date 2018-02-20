package structural.flyweight.trees;

import java.awt.*;

/**
 * Created by adementev on 20.02.2018.
 */
public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics graphics, int x, int y) {
        graphics.setColor(Color.black);
        graphics.fillRect(x - 1, y, 3, 5);
        graphics.setColor(color);
        graphics.fillOval(x - 5, y - 10, 10, 10);
    }
}
