// BmiCalc.java
// Java How to Program, 9th Ed.
// Exercise 2.33 - Body Mass Index Calculator
// Page 69
//
// Ray Santos
// September 30, 2014
//
// Create a BMI (body mass index) calculator that reads the user's wieght in pounds and
// height in inches, then displays the user's body mass index. Also, display the following
// information from the Department of Health and Human Services/National Institutes of Health
// so the user can evaluate his/her BMI:
//
//   BMI VALUES
//   Underweight: less than 18.5
//   Normal:      between 18.5 and 24.9
//   Overweight:  between 25 and 29.9
//   Obese:       30 or greater
//
// BMI formula is:
//
//   BMI = (weightInPounds * 703) / (heightInInches * heightInInches)
//
// Note: This program uses only the Java constructs introduced only up to Chapter 2.

import java.util.Scanner;

public class BmiCalc
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      int weight;
      int height;
      int bmi;

      System.out.print("\nEnter the integer value of your weight in pounds: ");
      weight = input.nextInt();

      System.out.print("Enter the integer value of your height in inches: ");
      height = input.nextInt();

      bmi = (weight * 703) / (height * height);

      System.out.printf("\nYour BMI is %d\n", bmi);

      System.out.println("\nCheck your BMI against the chart below\n");

      System.out.println("BMI VALUES");
      System.out.println("Underweight: less than 18.5");
      System.out.println("Normal:      between 18.5 and 24.9");
      System.out.println("Overweight:  between 25 and 29.9");
      System.out.println("Obese:       30 or greater\n");
   }
}
