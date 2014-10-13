// Fig. 5.10: GradeBookTest.java
// Create GradeBook object, input grades and display grade report
//
// Java How to Program, 9th Ed. (Deitel) Page 169
//
// Ray Santos
// October 12, 2014

public class GradeBookTest
{
   public static void main( String[] args )
   {
      GradeBook myGradeBook = new GradeBook(
         "CS101 Introduction to Java Programming" );

      myGradeBook.displayMessage();
      myGradeBook.inputGrades();
      myGradeBook.displayGradeReport();
   }
}

/* Code execution

99
92
45
57
63
71
76
85
90
100

Grade Report:
Total of the 10 grades entered is 778
Class average is 77.80
Number of students who received each grade:
A: 4
B: 1
C: 2
D: 1
F: 2

*/
