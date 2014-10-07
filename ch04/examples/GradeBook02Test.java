// Fig. 4.10: GradeBook02Test.java
// Create GradeBook02 object and invoke its determineClassAverage method.
//
// Java How to Program, 9th Ed. (Deitel) page 125
//
// Ray Santos
// October 6, 2014

public class GradeBook02Test
{
   public static void main( String[] args )
   {
      GradeBook02 myGradeBook = new GradeBook02(
         "CS101 Introduction to Java Programming" );

      myGradeBook.displayMessage();
      myGradeBook.determineClassAverage();
   }
}

/* Test run

Welcome to the grade book for
CS101 Introduction to Java Programming!

Enter grade or -1 to quit: 97
Enter grade or -1 to quit: 88
Enter grade or -1 to quit: 72
Enter grade or -1 to quit: -1

Total of the 3 grades entered is 257
Class average is 85.67

*/
