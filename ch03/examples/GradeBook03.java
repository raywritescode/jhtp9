// Fig. 3.7: GradeBook03.java
// GradeBook03 class that contains a courseName instance variable
// and methods to set and get its value
// Page 80
//
// Ray Santos
// October 1, 2014

public class GradeBook03
{
   private String courseName;

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
