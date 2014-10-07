// Fig. 4.9: GradeBook02.java
// GradeBook02 class that solves the class-average problem
// using sentinel-controlled repetition.
//
// Java How to Program, 9th Ed. (Deitel) Page 121
//
// Ray Santos
// October 6, 2014

import java.util.Scanner;

public class GradeBook02
{
   private String courseName;

   // constructor
   public GradeBook02( String name )
   {
      courseName = name;
   }

   public void setCourseName( String name )
   {
      courseName = name;
   }

   public String getCourseName()
   {
      return courseName;
   }

   public void displayMessage()
   {
      System.out.printf( "\nWelcome to the grade book for\n%s!\n\n",
         getCourseName() );
   }

   public void determineClassAverage()
   {
      Scanner input = new Scanner( System.in );

      int total;
      int gradeCounter;
      int grade;
      double average;

      total = 0;
      gradeCounter = 0;

      System.out.print( "Enter grade or -1 to quit: " ); // sentinel value is -1
      grade = input.nextInt();

      // loop until sentinel value read from user
      while ( grade != -1 )
      {
         total = total + grade;
         gradeCounter = gradeCounter + 1;

         System.out.print( "Enter grade or -1 to quit: " );
         grade = input.nextInt();
      }

      if ( gradeCounter != 0 )
      {
         average = (double) total / gradeCounter;

         System.out.printf( "\nTotal of the %d grades entered is %d\n",
            gradeCounter, total );

         System.out.printf( "Class average is %.2f\n", average );
      }
      else
         System.out.println( "No grades were entered" );
   }
}
