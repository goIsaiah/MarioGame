package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInputs implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // System.out.println("A key is pressed.");
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                System.out.println("It's W");
                break;
        }
    }
}
