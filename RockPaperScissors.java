import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String[] choises = {"Rock","Paper","Scissors"};
		System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissors:");
		int user = sc.nextInt();
		int computer = rand.nextInt(3);
		System.out.println("Computer choise:" + choises[computer]);
		System.out.println("Users choise:" + choises[user]);
		if(user == computer){
		    System.out.println("its a tie!!");
		}
		else if(user==0&&computer==2||user==1&&computer==0||user==2&&computer==1){
		    System.out.println("user wins♡♡");
		}else{
		    System.out.println("computer wins!!");
		}
		
	}
}