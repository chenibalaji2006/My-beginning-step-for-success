import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me the starting number");
        int a = sc.nextInt();
        int b = 0;

        for(int i = a; i<=b; i++){
            if(i<2){
                continue;
            }
            boolean Isprime = true;
            for(int j = 2; j*j <= i; j++){
                if(i%j==0){
                    Isprime = false;
                    break;
                }
            }
            if(Isprime){
                System.out.println(i);
            }
        }
    }
}