// Fig. 3.11: GradeBook04Test.java
// GradeBook04 constructor used to specify the course name at the
// time each GradeBook04 object is created.
// Page 87 
//
// Ray Santos
// October 1, 2014

import java.util.Scanner;

public class GradeBook04Test
{
   public static void main( String[] args )
   {
      GradeBook04 gradeBook1 = new GradeBook04( 
         "CS101 Introduction to Java Programming" );

      GradeBook04 gradeBook2 = new GradeBook04(
         "CS102 Data Structures in Java" );

      // display initial value of course name for each GradeBook04 object
      System.out.printf( "gradeBook1 course name is: %s\n",
         gradeBook1.getCourseName() );
      
      System.out.printf( "gradeBook2 course name is: %s\n\n",
         gradeBook2.getCourseName() );
   }
}
