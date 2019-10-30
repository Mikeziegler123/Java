import java.util.Scanner;

    
public class testAverage
{ 
    public static void main(String args[] ) 
    {    
    Scanner userInput = new Scanner(System.in);
    
    int testScore1;

    int testScore2;

    int testScore3;

    int testScore4;

    int testScore5;

    System.out.print("Enter your first test score: ");

    testScore1 = userInput.nextInt();

    System.out.print("Enter your second test score: ");

    testScore2 = userInput.nextInt();

    System.out.print("Enter your third test score: ");

    testScore3 = userInput.nextInt();

    System.out.print("Enter your fourth test score: ");

    testScore4 = userInput.nextInt();

    System.out.print("Enter your fifth test score: ");

    testScore5 = userInput.nextInt();

    userInput.nextLine();

    double average = calcAverage(testScore1,testScore2, testScore3, testScore4, testScore5);

    System.out.printf("The average is: %.2f ", average);

    determineGrade(average);

      
    }
    //Calc average function
    public static double calcAverage(int score1, int score2, int score3, int score4, int score5) 
    {
    
      int total = score1 + score2 + score3 + score4 + score5;
      double average = total/5;
      return average;
    }
    // Determine grade function
    
     public static double determineGrade(double average) 

    {

        if (average>90)

        {

            System.out.println("You got an A! :D");

        }

        else if (average>=80)

        {

            System.out.println("You got a B! :) ");

        }

        else if (average>=70)

        {

            System.out.println("You got a C! :I");

        }

        else if (average>=60)

        {

            System.out.println("You got a D! :/");

        }

        else if (average<60)

        {

            System.out.println("You got an F! :(");

        }

                return 0; 
 
    }
}