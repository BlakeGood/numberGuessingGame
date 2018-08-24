import java.util.Scanner;

public class numberGuessing
	{

		public static void main(String[] args)
			{
				Scanner userName = new Scanner(System.in);
				Scanner userGuess = new Scanner(System.in);
				Scanner difficultyLevel = new Scanner(System.in);
				Scanner playAgain = new Scanner(System.in);

				System.out.println("What's your name?");
				String name = userName.nextLine();
				System.out.println("Welcome to the game, " + name + "!");

				boolean wantsToPlayAgain = true;
				while (wantsToPlayAgain)
					{
						System.out.println("How many numbers do you want to guess from?");
						int difficulty = difficultyLevel.nextInt();

						int secretNumber = (int) (Math.random() * difficulty) + 1;
						System.out.println("Please guess a number between 1 and " + difficulty + ".");

						int counter = 0;

						boolean isStillGuessing = true;
						while (isStillGuessing)
							{

								counter++;

								int guess = userGuess.nextInt();

								if (guess == secretNumber)
									{
										System.out.println("Congratulations! You guessed right.");
										System.out.println("It took you " + counter + " guesses.");
										isStillGuessing = false;
									} else if (guess < secretNumber)
									{
										System.out.println("Try guessing a higher number.");
									} else if (guess > secretNumber)
									{
										System.out.println("Try guessing a lower number");
									}

							}
						
						System.out.println("Would you like to play again?");
						String again = playAgain.nextLine();
						if (again.equals("No"))
							{
								wantsToPlayAgain = false;
								System.out.println("Thanks for playing, " + name + "!");
							}
					}
			}

	}

// WOOOHOOOOO i added this to see if it works 
// oooohhhhh yeah 
// afkldajfklfkl
