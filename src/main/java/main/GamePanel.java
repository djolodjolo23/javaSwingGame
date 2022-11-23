package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GamePanel extends JPanel{

  private MouseInputs mouseInputs;
  private int xDelta = 100, yDelta = 100;

  public GamePanel() {
    mouseInputs = new MouseInputs(this);
    addKeyListener(new KeyboardInputs(this));
    addMouseListener(mouseInputs);
    addMouseMotionListener(mouseInputs);
  }

  public void changeXDelta(int value) {
    this.xDelta += value;
    repaint();
  }

  public void changeYDelta(int value) {
    this.yDelta += value;
    repaint();
  }

  public void setRectPosition(int x, int y) {
    this.xDelta = x;
    this.yDelta = y;
    repaint();
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
    g.fillRect(xDelta, yDelta, 200, 50);

  }

}
