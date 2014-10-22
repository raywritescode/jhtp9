// Fig. 6.12: DrawSmileyTest.java
// Test application that displays a smiley face.
//
// Java How to Program, 9th Ed. (Deitel) Page 226
//
// Ray Santos
// October 21, 2014

import javax.swing.JFrame;

public class DrawSmileyTest
{
   public static void main( String[] args )
   {
      DrawSmiley panel = new DrawSmiley();
      JFrame application = new JFrame();

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( panel );
      application.setSize( 230, 250 );
      application.setVisible( true );
   }
}
