package package2;

import java.util.Scanner;

public class primeinrange {
    public static boolean prime(int number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void inrange(int n){
        for(int j=2;j<=n;j++){
            if(prime(j)==true){
                System.out.print(j+" ");;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n=sc.nextInt();
        inrange(n);
    }
}   
