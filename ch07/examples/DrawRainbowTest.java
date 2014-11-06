// Fig. 7.26: DrawRainbowTest.java
// Test application to display a rainbow.
//
// Java How to Program, 9th Ed. (Deitel) Page 288
//
// Ray Santos
// November 5, 2014

import javax.swing.JFrame;

public class DrawRainbowTest
{
   public static void main( String[] args )
   {
      DrawRainbow panel = new DrawRainbow();
      JFrame application = new JFrame();

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( panel );
      application.setSize( 400, 250 );
      application.setVisible( true );
   }
}
