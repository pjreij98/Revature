import java.util.Scanner;

public class ExerciseOne {
	private static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0, max = 10;
		int randomNum = genNum(max, min);
		while(checkGuess(getGuess(min, max), randomNum) == false)
		{
			
		}
		scan.close();
			
	}
	
	private static int genNum(int max, int min)
	{
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	private static int getGuess(int min, int max)
	{
		System.out.println("Guess a number between " + min + " and " + max);
		while(!scan.hasNextInt())
		{
			scan.nextLine();
			System.out.println("That is not a number.");
			System.out.println("Guess again");
		}
		return scan.nextInt();
	}
	
	private static boolean checkGuess(int guess, int target)
	{
		if(guess < target)
		{
			System.out.println("Your guess is too low.");
			return false;
		}
		else if(guess > target)
		{
			System.out.println("Your guess is too high.");
			return false;
		}
		else
		{
			System.out.println("You got it, your guess is correct!");
			return true;
		}
	}
}
