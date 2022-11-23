package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel{

  public GamePanel() {
    addKeyListener(new KeyboardInputs());
    addMouseListener(new MouseInputs());

  }

  /**
   * This method is called by the Swing framework when the panel needs to be
   * redrawn. This is where we will draw our game.
   *
   * @param g the <code>Graphics</code> object to protect
   */
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    //g.drawRect(100, 100, 200, 50);
    g.fillRect(100, 100, 200, 50);

  }

}
