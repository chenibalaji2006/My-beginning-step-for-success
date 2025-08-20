import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("input:");
		Scanner sc = new Scanner(System.in);
		System.out.println("marks sum:");
		System.out.println("subject number 1:");
		long a = sc.nextLong();
		System.out.println("subject number 2:");
		long b = sc.nextLong();
		System.out.println("subject number 3:");
		long c = sc.nextLong();
		System.out.println("subject number 4:");
		long d = sc.nextLong();
		System.out.println("sunject number 5:");
		long e = sc.nextLong();
		long sum = a + b + c + d + e;
	    System.out.println("total marks");
	    System.out.println(sum);
	    System.out.println("Enter total marks:");
	    
	    long s = sc.nextLong();
	    float f = (s/500.0f) *100;
	    System.out.println("total percentage");
	    System.out.println(f);
	    
	}
}