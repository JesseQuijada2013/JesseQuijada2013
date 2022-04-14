import java.util.Scanner;
import java.util.Random;

class GuessingGame 
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to the guessing game!");
      System.out.println("You will have 5 chances to guess a number from 1 - 50");
      
      UserInput();
   } // end main
//---------------------------------------
   
   private static void UserInput()
   {      
      int maxChances = 5;
      int userResponse;
      int remainingChances;
      int i;
      
      Scanner userInput = new Scanner(System.in);
      
      Random rand = new Random();
      int correctAnswer = rand.nextInt(50);
            
      for (i = 0; i < maxChances; i++)
      {     
         System.out.println("Enter your guessing number: ");
         userResponse = userInput.nextInt();
         
         remainingChances = maxChances - i - 1;
         if (userResponse <= 0)
         {
            System.out.println("Invalid answer. Try again.");
            continue;
         } // end if         
         if (userResponse == correctAnswer)
         {
            System.out.println("Congrats you won!!!");
            break;
         } // end if
         
         else if (userResponse < correctAnswer)
         {
            System.out.println("The number you entered is to low. You have " + remainingChances + " attempts left.");
         } // end else if
        
         else if (userResponse > correctAnswer)
         {
            System.out.println("The number you entered is to high. You have " + remainingChances + " attempts left.");
         } // end else if
         
      } // end for
      
      if (i == maxChances)
      {
         System.out.println("You ran out of chances.");
         System.out.println("The correct answer was " + correctAnswer);
      } // end 
   
   } // end method


} // end class 