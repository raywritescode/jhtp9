// Fig. 3.8: GradeBook03Test.java
// Creating and manipulating a GradeBook03 object.
// Page 82 
//
// Ray Santos
// October 1, 2014

import java.util.Scanner;

public class GradeBook03Test
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      GradeBook03 myGradeBook = new GradeBook03();

      // display initial value of courseName, which is blank
      System.out.printf( "Initial course name is: %s\n\n",
         myGradeBook.getCourseName() );

      System.out.println( "Please enter the course name:" );
      String theName = input.nextLine();
      myGradeBook.setCourseName( theName );
      System.out.println(); // blank line to make the output nicer looking

      myGradeBook.displayMessage();
   }
}
