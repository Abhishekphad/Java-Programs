package package3;
import java.util.Scanner;

public class isprime {
    public static boolean prime(int number){
        for(int i=2;i<Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n=sc.nextInt();
        System.out.println(prime(n));
    }
}   
