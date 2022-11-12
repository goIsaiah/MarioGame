package main;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    public GamePanel() {
        addKeyListener(new inputs.KeyboardInputs());
        addMouseListener(null);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100, 100, 200, 50);
    }
}
