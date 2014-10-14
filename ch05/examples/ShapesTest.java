// Fig. 5.27: ShapesTest.java
// Test application that deploys class Shapes
//
// Java How to Program, 9th Ed. (Deitel) Page 185
//
// Ray Santos
// October 13, 2014

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest
{
   public static void main( String[] args )
   {
      String input = JOptionPane.showInputDialog(
         "Enter 1 to draw rectangles\n" +
         "Enter 2 to draw ovals" );

      int choice = Integer.parseInt( input ); // convert input to int

      Shapes panel = new Shapes( choice );

      JFrame application = new JFrame();

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( panel );
      application.setSize( 300, 300 );
      application.setVisible( true );
   }
}
