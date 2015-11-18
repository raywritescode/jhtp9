// BmiCalc.java
// Body Mass Index Calculator
// JHTP9, Exercise 2.33, page 69
// Ray Santos
// November 17, 2015

import java.util.Scanner;

public class BmiCalc
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      double weightInPounds;
      double heightInInches;
      double bmi;

      System.out.print( "Enter your weight in pounds (ex: 163.4): " );
      weightInPounds = input.nextDouble();

      System.out.print( "Enter your height in inches (ex: 67.75): " );
      heightInInches = input.nextDouble();

      bmi = ( ( weightInPounds * 703 ) / ( heightInInches * heightInInches ) );

      System.out.printf( "\nBMI VALUES\n" );
      System.out.println( "Underweight: less than 18.5" );
      System.out.println( "Normal:      between 18.5 and 24.9" );
      System.out.println( "Overweight:  between 25 and 29.9" );
      System.out.println( "Obese:       30 or greater" );

      System.out.printf( "\nYour BMI is %.2f\n", bmi );
   }
}

/* Example run

$ java BmiCalc 
Enter your weight in pounds (ex: 163.4): 162.3
Enter your height in inches (ex: 67.75): 67.75

BMI VALUES
Underweight: less than 18.5
Normal:      between 18.5 and 24.9
Overweight:  between 25 and 29.9
Obese:       30 or greater

Your BMI is 24.86

*/

// http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
