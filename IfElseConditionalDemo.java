import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//this is if-else conditional forms.
		Scanner sc = new Scanner(System.in);
		System.out.println("Fill in the blanks ?");
		System.out.println("What is the opposite of light _____ ?");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("Dark") || answer.equalsIgnoreCase("heavy")) {
			System.out.println("Correct answer, good job");
		} else {
			System.out.println("wrong answer, try again");
			
		}  
		    System.out.println("      ");
		    System.out.println("enter your age to check you are eligible or not:");
		    int age = sc.nextInt();
		    if(age>18&&age<68){
		    System.out.println("you are eligible(•♡•)");
		    }else{
		    System.out.println("you are not eligible(○□○)");
		    
		    }
		    
	}
}
