// Fig. 3.5: GradeBook02Test.java
// Creating a GradeBook object and pass a String to its displayMessage method.
// Page 77
//
// Ray Santos
// October 1, 2014

import java.util.Scanner;

public class GradeBook02Test
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      GradeBook02 myGradeBook = new GradeBook02();

      System.out.println( "\nPlease enter the course name:" );
      String nameOfCourse = input.nextLine();
      System.out.println();

      myGradeBook.displayMessage( nameOfCourse );
   }
}
