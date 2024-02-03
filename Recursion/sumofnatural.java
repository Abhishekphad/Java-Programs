package Recursion;

import java.util.Scanner;

public class sumofnatural {
    public static int printsum(int n){
        if(n==1){
            return 1;
        }
        int fnm1=printsum(n-1);
        int sum=n+printsum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n=sc.nextInt();
        // int n=10;
        System.out.println("Sum of first "+n+" natural number is: "+printsum(n));
    }
}
