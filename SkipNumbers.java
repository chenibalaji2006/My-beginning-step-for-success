import java.util.Scanner;
public class SkipNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me the starting number");
        int a = sc.nextInt();
        int b = 0;

        for(int i = a; i<=b; i++){
            if(i==10||i==19||i==23){
                System.out.println("error.,*..,*");
                continue;
            }
            System.out.println(i);
        }
    }
}