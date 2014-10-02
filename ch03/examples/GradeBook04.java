// Fig. 3.10: GradeBook04.java
// GradeBook04 class with a constructor to initialize the course name.
// Page 85
//
// Ray Santos
// October 1, 2014

public class GradeBook04
{
   private String courseName;

   // constructor initializes courseName with String argument
   public GradeBook04( String name )
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
      System.out.printf( "Welcome to the grade book for\n%s!\n",
         getCourseName() );
   }
}
