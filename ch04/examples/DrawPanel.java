// Fig. 4.18: DrawPanel.java
// Using drawLine to connect the corners of a panel.
//
// Java How To Program, 9th Ed. (Deitel) Page 135
//
// Ray Santos
// October 6, 2014

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
   // draws an X from the corners of the panel
   public void paintComponent( Graphics g )
   {
      // call paintComponent to ensure the panel displays correctly
      super.paintComponent( g );

      int width = getWidth();
      int height = getHeight();

      // draw a line from the upper-left to the lower-right
      g.drawLine( 0, 0, width, height );

      // draw a line from the lower-left to the upper-right
      g.drawLine( 0, height, width, 0 );
   }
}
