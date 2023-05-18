package main;
import inputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 100;
    private int yDelta = 100;

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new inputs.KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta (int value) {
        this.xDelta += value;
    }

    public void changeYDelta (int value) {
        this.yDelta += value;
    }

    public void setRectPos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(xDelta, yDelta, 200, 50);
        repaint();
    }
}
