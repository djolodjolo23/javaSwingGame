package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import main.GamePanel;

public class KeyboardInputs implements KeyListener {



  private boolean[] keys;
  public boolean up, down, left, right;

  private GamePanel gamePanel;

  public KeyboardInputs(GamePanel gamePanel) {
    this.gamePanel = gamePanel;
    keys = new boolean[256];
  }

  public void update() {
    up = keys[KeyEvent.VK_W];
    down = keys[KeyEvent.VK_S];
    left = keys[KeyEvent.VK_A];
    right = keys[KeyEvent.VK_D];
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }

  @Override
  public void keyPressed(KeyEvent e) {
    switch (e.getKeyCode()) {
      case KeyEvent.VK_W -> gamePanel.changeYDelta(-5);
      case KeyEvent.VK_S -> gamePanel.changeYDelta(5);
      case KeyEvent.VK_A -> gamePanel.changeXDelta(-5);
      case KeyEvent.VK_D -> gamePanel.changeXDelta(5);
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    keys[e.getKeyCode()] = false;
  }

}


