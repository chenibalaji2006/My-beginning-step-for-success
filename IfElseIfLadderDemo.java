import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age>70){
		    System.out.println("you are an old man on grave steps");
		}
		else if(age>50){
		    System.out.println("you are an onld man");
		}
		else if(age>30){
		    System.out.println("you are a middle aged man");
		}
		else if(age>20){
		    System.out.println("you young man");
		}
		else if(age>14){
		    System.out.println("you teenager");
		}
		
	}
}