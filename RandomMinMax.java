/*
* The RandomMinMax program implements an application that
* generates a 10 random numbers from 1 to 99 an tells the user the minimum and
* maximum.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-1 
*/

import java.util.Scanner;  // Import the Scanner class

public class RandomMinMax {
  public static final int numberOfValues = 10;
  public static final int maxValue = 99;
  
  /////////////////////////////////////////////////////////////////////////////
  
  /**
   * Function which determines the max value.
   */
  static int maxCalculation(int[] values) {
    int maximum = 0;
    for (int position = 0; position < numberOfValues; position++) { 
      if (values[position] > maximum) {
        maximum = values[position];
      }
    }
      
    return maximum;
  }

  /////////////////////////////////////////////////////////////////////////////

  /**
   * Function which determines the min value.
   */
  static int minCalculation(int[] values) {
    int minimum = 99;
    for (int position = 0; position < numberOfValues; position++) { 
      if (values[position] < minimum) {
        minimum = values[position];
      }
    }

    return minimum;
  }

  /////////////////////////////////////////////////////////////////////////////

  /**
   * This function handles the input and output of the program.
   */
  public static void main(String[] args) {
    try {
      int[] values = new int [numberOfValues];
      // To make it look nice/
      System.out.println("The generated numbers are:");
      System.out.print("| ");
      // Generating the ten random numbers.
      for (int position = 0; position < numberOfValues; position++) {
        int tempValue = (int) (Math.random() * maxValue + 1);
        values[position] = tempValue;
        System.out.print(values[position] + " | ");
      }
      // Getting the max and min back.
      int maximum = maxCalculation(values);
      int minimum = minCalculation(values);
      // Outputing the rolled number.
      System.out.println();
      System.out.println("The maximum is: " + maximum);
      System.out.println("The minimum is: " + minimum);
    } catch (Exception e) {
      System.out.println("AN ERROR HAS OCCURED");
    }
  }
  /////////////////////////////////////////////////////////////////////////////
}
