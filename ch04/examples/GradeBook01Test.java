// Fig. 4.7: GradeBook01Test.java
// Create a GradeBook01 object and invoke its determineClassAverage method.
//
// Java How To Program, 9th Ed. (Deitel) Page 117
//
// Ray Santos
// October 5, 2014

public class GradeBook01Test
{
   public static void main( String[] args )
   {
      GradeBook01 myGradeBook = new GradeBook01(
         "CS101 Introduction to Java Programming" );

      myGradeBook.displayMessage();
      myGradeBook.determineClassAverage();
   }
}
