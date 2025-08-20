import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("subject one marks");
		int one = sc.nextInt();
		System.out.println("subject two marks");
		int two = sc.nextInt();
		System.out.println("subject three marks");
		int three = sc.nextInt();
		System.out.println("total marks");
		int total = one + two + three;
		System.out.println(total);
		float per = (total/300.0f)*100;
		System.out.println(per);
		if(per>40.0f&&one>33&&two>33&&three>33){
		    System.out.println("you passed congratulations");
		}
		        else{
		        System.out.println("sorry you failed better luck next time");
		    }
		    float tax = sc.nextFloat();
		    
		
	}
}