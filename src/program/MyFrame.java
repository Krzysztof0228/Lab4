package program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MyFrame extends JFrame{

    JFrame frame;

    public MyFrame(String title) {
        super(title);
        frame=new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 600);
        this.getContentPane().setBackground(new Color(210,210,210));
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);

        JButton runningButton = new JButton("Running Button");
        runningButton.setBounds(200, 100, 120, 60);
        runningButton.addActionListener(e->runningButtonGame(frame));
        runningButton.setVisible(true);
        this.add(runningButton);

        JButton drawingButton = new JButton("Draw");
        drawingButton.setBounds(200, 200, 120, 60);
        drawingButton.addActionListener(e->drawingCanvas(frame));
        drawingButton.setVisible(true);
        this.add(drawingButton);
    }


    public void runningButtonGame(JFrame frame) {
        frame.dispose();
        JFrame runFrame = new JFrame();
        runFrame.setTitle("Running Button");
        runFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        runFrame.setSize(1000,600);
        runFrame.getContentPane().setBackground(new Color(200,200,200));
        runFrame.setLayout(null);
        runFrame.setResizable(false);
        runFrame.setVisible(true);

        JButton runButton = new JButton("Catch me");
        runButton.setBounds(240,110,100,40);
        runButton.setBackground(new Color(120,90,220));
        runButton.setVisible(true);
        runButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    Random random = new Random();

                    if(e.getX() > 20){
                        runButton.setLocation(random.nextInt(800), random.nextInt(400));
                    }

                    if(e.getY() > 20){
                        runButton.setLocation(random.nextInt(800), random.nextInt(400));
                    }
            }
        });

        runFrame.add(runButton);
    }

    private void drawingCanvas(JFrame frame) {
        frame.dispose();
        JFrame drawFrame = new JFrame();
        drawFrame.setTitle("Drawing Canvas");
        drawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawFrame.setSize(800,500);
        drawFrame.getContentPane().setBackground(new Color(200,200,200));
        drawFrame.setResizable(false);
        drawFrame.setVisible(true);

        DrawingCanvas canvas = new DrawingCanvas();
        drawFrame.add(canvas);
        drawFrame.setVisible(true);
    }

    public void start() {
        setVisible(true);
    }
}
