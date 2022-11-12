package main;
import inputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;

    public GamePanel() {
        mouseInputs = new MouseInputs();
        addKeyListener(new inputs.KeyboardInputs());
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100, 100, 200, 50);
    }
}
