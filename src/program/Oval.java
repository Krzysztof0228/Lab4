package program;

import java.awt.*;

public class Oval {
    private int x;
    private int y;

    public Oval(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void ovalShape(Graphics2D g2d){
        g2d.fillOval(x, y, 30, 20);
    }
}
