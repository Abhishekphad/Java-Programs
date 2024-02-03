package package2;

import java.util.Scanner;

public class palidorme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check pelidrome: ");
        int n= sc.nextInt();
        int temp=n;int sum=0;
        while(n>0){
           int r= n%10;
           sum= (sum*10)+r;
           n=n/10;
        }
        if(temp==sum)
            System.out.println("Number is pelidrome");
        else
            System.out.println("number is not pelidrome");
        
    }
}
