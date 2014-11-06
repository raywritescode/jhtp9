// Fig. 7.25: DrawRainbow.java
// Demonstrates using colors in an array.
//
// Java How to Program, 9th Ed. (Deitel) Page 287
//
// Ray Santos
// November 5, 2014

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel
{
   private final static Color VIOLET = new Color( 128, 0, 128 );
   private final static Color INDIGO = new Color( 75, 0, 130 );

   // colors to use in the rainbow, starting from the innermost.
   // The two white entries result in an empty arc in the center.
   private Color[] colors =
      { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
        Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

   public DrawRainbow()
   {
      setBackground( Color.WHITE );
   }

   // draws rainbow using concentric arcs
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      int radius = 20; 

      // draw the rainbow near the bottom-center
      int centerX = getWidth() / 2;
      int centerY = getHeight() - 10;

      // draw filled arcs starting with the outermost
      for ( int counter = colors.length; counter > 0; counter-- )
      {
         // set the color for the current arc
         g.setColor( colors[ counter - 1 ] );

         // fill the arc from 0 to 180 degrees
         g.fillArc( centerX - counter * radius,
            centerY - counter * radius,
            counter * radius * 2, counter * radius * 2, 0, 180 );
      }
   }
}
