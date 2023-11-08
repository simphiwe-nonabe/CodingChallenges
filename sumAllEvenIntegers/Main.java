package sumAllEvenIntegers;

/* Write a function that takes in an array of integers and 
 returns the sum of all even numbers in the array. */

public class Main {
  public static void main(String[] args) {

    // Test cases
    Integer[] oddArray = {1, 3, 5, 7, 9};
    Integer[] evenArray = {2, 4, 6, 8, 10};
    Integer[] evenOddArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    System.out.println("The sum of all even numbers in oddArray is: " + sumAllEvenIntegers(oddArray));
    System.out.println("The sum of all even numbers in evenArray is: " + sumAllEvenIntegers(evenArray));
    System.out.println("The sum of all even numbers in evenOddArray is: " + sumAllEvenIntegers(evenOddArray));
    System.out.println("The sum of all even numbers in a null array is: " + sumAllEvenIntegers(null));
  
  }

  // Solution
  // Function to calculate the sum of all even numbers in the given array
  public static Integer sumAllEvenIntegers(Integer[] arr) {

    Integer sum = 0;
    
    try {

      if (arr != null) {
      
        for (int i = 0; i < arr.length; i++) {
          
          if (arr[i] % 2 == 0) {
            sum += arr[i];
          }

        }
      }
    } 
    catch (Exception e) {
      System.out.println("An error occured");
    }

    return sum;
  } 
}