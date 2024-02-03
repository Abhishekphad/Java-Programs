package package2.BitManipulation;

import java.util.Scanner;

public class oddEven {
    public static void OddOrEven(int number){
        int bitmask=1;
        if((number & bitmask) ==1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n= sc.nextInt();
        OddOrEven(n);
    }
}
