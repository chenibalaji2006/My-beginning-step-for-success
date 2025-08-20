import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String user = sc.nextLine();
		int player = 0;
		int computer = 0;
		int winningposition = 100;
		System.out.println("Reach first " + winningposition + " to win■●■");
		while (player < winningposition && computer < winningposition) {
			System.out.println(user + "Type 'yes' to roll the dice");
			String type = sc.nextLine();
			if (type.equalsIgnoreCase("yes")) {
				int dice = rand.nextInt(6) + 1;
				System.out.println("you got " + dice);
				player += dice;
				System.out.println(user + " in place " + player);

				if (player >= winningposition) {
					System.out.println(user + "wins congratulations");
					break;
				}
			} else{
			    System.out.println("Invalid input Skipped chance");
			}
			


				int dice = rand.nextInt(6) + 1;
				System.out.println("computer got " + dice);
				computer += dice;
				System.out.println("computer in place " + computer);

				if (computer >= winningposition) {
					System.out.println("Sorry computer wins");
					break;
				}
			}
			sc.close();

		}
	}