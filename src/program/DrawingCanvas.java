package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingCanvas extends JPanel {
    Oval oval;
    Rectangle rectangle;
    char whichShape;

    DrawingCanvas(){
        this.setBackground(new Color(210,210,210));
        this.setBounds(0,0,800,500);
        this.setFocusable(true);
        this.setOpaque(true);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if(e.getKeyCode()==KeyEvent.VK_O){
                    whichShape='o';
                }

                if(e.getKeyCode()==KeyEvent.VK_R){
                    whichShape='r';
                }
            }
        });

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);

                if(whichShape=='o'){
                    oval=new Oval(e.getX(), e.getY());
                    repaint();
                }

                if(whichShape=='r'){
                    rectangle=new Rectangle(e.getX(), e.getY());
                    repaint();
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);

        Graphics2D graphics2D = (Graphics2D) graphics.create();
        if(whichShape=='o'){
            graphics2D.setColor(new Color(200,30,30));
            oval.ovalShape(graphics2D);
        }

        if(whichShape=='r'){
            graphics2D.setColor(new Color(50,10,180));
            rectangle.rectangleShape(graphics2D);
        }
    }
}
