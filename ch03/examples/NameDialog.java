// Fig. 3.18: NameDialog.java
// Basic input with a dialog box
// Java How to Program, 9th Ed. (Deitel) Page 95
//
// Ray Santos
// October 2, 2014

import javax.swing.JOptionPane;

public class NameDialog
{
   public static void main( String[] args )
   {
      String name = JOptionPane.showInputDialog( "What is your name?" );

      String message = String.format( "Welcome, %s, to Java Programming!", name );

      JOptionPane.showMessageDialog( null, message );
   }
}
