//Author: Michael Ziegler, John Ziegler
/* 1) TestScores Class
 *    -Write a class names TestScores. The class constructor should accept an array of test scores
 *      as it's argument. 
 *    -The class should have a method that returns the average of the test scores
 *    -If any score in the array is greater than 100, the class should throw an: 'illegalArgumentException'. 
 *    -Demonstrate the class in a program.
 * 2)TestScores Class Custom Exception 
 *    -Write an exception class named 'IsValidTestScore'
 *    -Modify the 'TestScores' class you wrote in Programming Challenge 1 so that it throws an 
 *     'IsValidTestScore' exception if any of the test scores in the array are invalid.
 */
import java.util.*;
  
public class TestScores
{ 
//Private
    private double[] scoreArray;
//Public

//(1)
    public TestScores(double[] tests) throws IllegalArgumentException
    {
        scoreArray = new double[tests.length];

        for (int i = 0; i < tests.length; i++)
        {
            if (tests[i] < 0 || tests[i] > 100)

                throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");

            else
                scoreArray[i] = tests[i];
        }
    }

//(2)Method that returns the average of the test scores.
    
   public double returnAvg(double[] scores)
   {
     scoreArray = new double[scores.length];
     double sum = 0;
     double avg;
     int count = 0;
     for(int j = 0; j < scores.length; j++)
     {
       sum += scores[j];
       if(scores[j]!=0)
         count = j+1;
     }
//System.out.print("The sum is: " + sum);
//System.out.print("The count is: " + count);
     
     avg = sum / count+1;
     avg = avg -1;
     return avg;
   }
  
//Main Function
public static void main(String[] args) throws IllegalArgumentException
{
  Scanner keyboard = new Scanner(System.in);
  double userInput; 
  double testCount = 1;
  
  //Create an Array for testScore input
  double ar[] = new double[100];
  
  //Ask how many test scores there will be to input
  System.out.print("How many tests would you like to add?");
  testCount = keyboard.nextDouble(); 
  
  //For Loop to take in testscores
  for(int i = 0; i < testCount; i++)
  {
    System.out.print("Please Enter the score for test " + (i+1));
    userInput = keyboard.nextDouble();
    //Update array values
    ar[i] = userInput;
  }
  //Create testScores object, and initialize it with the filled testscores array.
  TestScores testscores = new TestScores(ar);
  
  //Demonstrate Testscores returnAvg(double scores[]) Function:
  System.out.print("The average of the testscores you provided is: " + testscores.returnAvg(ar));
}
}