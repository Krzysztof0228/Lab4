package program;

import java.awt.*;

public class Rectangle {
    private int x;
    private int y;

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void rectangleShape(Graphics2D g2d){
        g2d.fillRect(x, y, 30, 20);
    }
}
