// Population.java
// World Population Growth Calculator
// JHTP, Exercise 2.34, page 70
// Ray Santos
// November 18, 2015

/* 
   Problem: Use the web to determine the current world population and
   the annual world population growth rate. Write an application that
   inputs these values, then displays the estimated world population
   after one, two, three, four and five years.

      World population on 17Nov2015 is 7,381,153,122, according to 
      http://www.geohive.com/earth/population_now.aspx

      The annual world population growth rate, according to the same 
      source, is 1.132%
 
   Population growth formula: The program will use only the arithmetic
   operators introduced in section 2.7

      The formula I'll use for this program is
      current world population + ( current world population x annual growth rate )

      The next year will use the previous year's calculated population as its
      current world population value.

   How I envision the working program (Note: calculations done manually with a calculator):

      Enter the current world population (exclude commas): 7381153122
      Enter the annual world population growth rate (in percent): 1.132

      World population after one year: 7464707775 
                      after two years: 7549208267
                    after three years: 7634665304
                     after four years: 7721089715
                     after five years: 7808492450
*/

import java.util.Scanner;

public class Population
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner( System.in );

      double currentPopulation;
      double yearOne;
      double yearTwo;
      double yearThree;
      double yearFour;
      double yearFive;
      float growthRate;

      System.out.print( "Enter the current world population (exclude commas): ");
      currentPopulation = input.nextDouble();

      System.out.print( "Enter the annual world population growth rate (in percent): ");
      growthRate = input.nextFloat();
      growthRate = growthRate / 100;

      yearOne = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "\nWorld population after one year: %.0f\n", yearOne );

      currentPopulation = yearOne;
      
      yearTwo = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "                after two years: %.0f\n", yearTwo );

      currentPopulation = yearTwo;

      yearThree = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "              after three years: %.0f\n", yearThree );

      currentPopulation = yearThree;
      
      yearFour = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "               after four years: %.0f\n", yearFour );

      currentPopulation = yearFour;

      yearFive = currentPopulation + ( currentPopulation * growthRate );
      System.out.printf( "               after five years: %.0f\n", yearFive );
   }
}

/* Example run

$ java Population 
Enter the current world population (exclude commas): 7381153122
Enter the annual world population growth rate (in percent): 1.132

World population after one year: 7464707772
                after two years: 7549208261
              after three years: 7634665296
               after four years: 7721089703
               after five years: 7808492436

*/
