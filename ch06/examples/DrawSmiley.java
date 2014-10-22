// Fig. 6.11: DrawSmiley.java
// Demonstrates filled shapes.
//
// Java How to Program, 9th Ed. (Deitel) Page 225
//
// Ray Santos
// October 21, 2014

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawSmiley extends JPanel
{
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      // draw the face
      g.setColor( Color.YELLOW );
      g.fillOval( 10, 10, 200, 200 );

      // draw the eyes
      g.setColor( Color.BLACK );
      g.fillOval( 55, 65, 30, 30 );
      g.fillOval( 135, 65, 30, 30 );

      // draw the mouth
      g.fillOval( 50, 110, 120, 60 ); // mouth is a black oval

      // "touch up" the mouth into a smile
      g.setColor( Color.YELLOW );
      g.fillRect( 50,110, 120, 30 ); // makes the top half of mouth yellow to match face
      g.fillOval( 50, 120, 120, 40 ); // draws a smaller yellow oval over mouth to make the smile
   }
}
