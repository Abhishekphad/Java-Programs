
import java.util.Scanner;

class posorneg{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        String result= (a>=0)? "Number is positive": "Number is negative";
        System.out.println(result); 

    }
}