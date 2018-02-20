package structural.composite.shapes;

import java.awt.*;

/**
 * Created by adementev on 13.02.2018.
 */
public interface Shape {
    int getX();

    int getY();

    int getWidth();

    int getHeight();

    void move(int x, int y);

    Boolean isInsideBounds(int x, int y);

    void select();

    void unSelect();

    Boolean isSelected();

    void paint(Graphics graphics);
}
