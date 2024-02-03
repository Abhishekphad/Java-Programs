import java.util.Scanner;

public class mian {
    public static void main(String[] args) {
        int number;
        int evenSum=0;
        int oddSum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        number=sc.nextInt();
        if(number%2==0) {
            evenSum+=number;}
        else{oddSum+=number;}
    }
}
