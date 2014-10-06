// Fig. 4.6: GradeBook01.java
// GradeBook01 class that solves class-average problem
// using counter-controlled repetition.
// 
// Java How To Program, 9th Ed. (Deitel) Page 114
//
// Ray Santos
// October 5, 2014

import java.util.Scanner;

public class GradeBook01
{
   private String courseName;

   // constructor
   public GradeBook01( String name )
   {
      courseName = name;
   }

   public String getCourseName()
   {
      return courseName;
   }

   public void displayMessage()
   {
      System.out.printf( "Welcome to the grade book for\n%s!\n\n",
         getCourseName() );
   }

   public void determineClassAverage()
   {
      Scanner input = new Scanner( System.in );

      int total;
      int gradeCounter;
      int grade;
      int average;

      total = 0;
      gradeCounter = 1;

      while ( gradeCounter <= 10 )
      {
         System.out.print( "Enter grade: ");
         grade = input.nextInt();
         total = total + grade;
         gradeCounter = gradeCounter + 1;
      }

      average = total / 10;

      System.out.printf( "\nTotal of all 10 grades is %d\n", total );
      System.out.printf( "Class average is %d\n\n", average );
   }
}
