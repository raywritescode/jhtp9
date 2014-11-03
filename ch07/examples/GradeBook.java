// Fig. 7.14: GradeBook.java
// GradeBook class using an array to store test grades
//
// Java How to Program, 9th Ed. (Deitel) Page 263
//
// Ray Santos
// November 3, 2014

public class GradeBook
{
   private String courseName;
   private int[] grades;

   public GradeBook( String name, int[] gradesArray )
   {
      courseName = name;
      grades = gradesArray;
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
      System.out.printf( "Welcome to the grade book for\n%s!\n\n",
         getCourseName() );
   }

   public void processGrades()
   {
      outputGrades();

      System.out.printf( "\nClass average is %.2f\n", getAverage() );

      System.out.printf( "Lowest grade is %d\nHighest grade is %d\n\n",
         getMinimum(), getMaximum() );
   
      outputBarChart();
   }
 
   public int getMinimum()
   {
      int lowGrade = grades[ 0 ]; // assume grade[ 0 ] is smalles

      for ( int grade : grades )
      {
         if ( grade < lowGrade )
            lowGrade = grade;
      }

      return lowGrade;
   }

   public int getMaximum()
   {
      int highGrade = grades[ 0 ]; // assume grades[ 0 ] is largest

      for ( int grade : grades )
      {
         if ( grade > highGrade )
            highGrade = grade;
      }

      return highGrade;
   } 

   public double getAverage()
   {
      int total = 0;

      for ( int grade : grades )
         total += grade;

      return (double) total / grades.length;
   }

   public void outputBarChart()
   {
      System.out.println( "Grade distribution:" );

      // store frequency of grades in each range of 10 grades
      int[] frequency = new int[ 11 ];

      // for each grade, increment the appropriate frequency
      for ( int grade : grades )
         ++frequency[ grade / 10 ];

      // for each grade frequency, print bar in chart
      for ( int count = 0; count < frequency.length; count++ )
      {
         // output bar label ( "00-09: ", ..., "90-00: ", "100: " )
         if ( count == 10 )
            System.out.printf( "%5d: ", 100 );
         else
            System.out.printf( "%02d-%02d: ",
               count * 10, count * 10 + 9 );

         // print bar of asterisks
         for ( int stars = 0; stars < frequency[ count ]; stars++ )
            System.out.print( "*" );

         System.out.println();
      }
   }

   public void outputGrades()
   {
      System.out.println( "The grades are:\n" );

      for ( int student = 0; student < grades.length; student++ )
         System.out.printf( "Student %2d: %3d\n",
            student + 1, grades[ student ] );
   }   
}
