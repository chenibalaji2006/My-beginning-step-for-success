import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1: upper");
		float a = sc.nextFloat();
		System.out.println("enter number 1: lower");
		float c = sc.nextFloat();



		System.out.println("enter number 2: upper");
		float b = sc.nextFloat();
		System.out.println("enter number 2: lower");
		float d = sc.nextFloat();
		System.out.println("final sum");
		//	float y = (a*b)/(c*d);
		float y = a / c * b / d;
		System.out.println(y);

	}
}