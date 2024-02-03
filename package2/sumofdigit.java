package package2;
import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        // int sum=0;
        // sumDigits(number);
        System.out.println("Sum of Digit is: "+sumDigits(number));
    }
    public static int sumDigits(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
}

