package main;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

  public GameWindow() {
    setTitle("Game");
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    // this is the correct spot for setVisible(true)
    // needs to be at the bottom.
    setVisible(true);
  }

  public static void main(String[] args) {
    new GameWindow();
  }
}


