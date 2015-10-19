// Chapter 5 Question 27

// ________________________________________________

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  // ________________________________________________j
  private final Color skyColor = Color.CYAN;
  public Rainbow()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();
    int xcenter = width/2;
    int ycenter = (height/4)*3;
    int largeRadius = width/4;
    double smallRadius = height/4;
    int midRadius = (int)Math.sqrt((double)smallRadius*largeRadius);
    int skyRadius = -(2*midRadius-2*(int)smallRadius-largeRadius)/2;

    g.setColor(Color.RED);
    g.fillArc((xcenter-largeRadius), (height-largeRadius), largeRadius*2, largeRadius*2, 0, 180);
    
    g.setColor(Color.GREEN);
    g.fillArc((xcenter-midRadius), (height-midRadius), midRadius*2, midRadius*2, 0, 180);

    g.setColor(Color.MAGENTA);
    g.fillArc((xcenter-(int)smallRadius), (int)(height-smallRadius), (int)smallRadius*2, (int)smallRadius*2, 0, 180);
    
    g.setColor(skyColor);;
    g.fillArc(xcenter-skyRadius, height-skyRadius, skyRadius*2,skyRadius*2, 0, 180);
    
    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    // ________________________________________________

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    // ________________________________________________

    // Draw the sky-color semicircle:
    // ________________________________________________
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
