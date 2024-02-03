

// public class factorial {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int number= sc.nextInt();
//         int fact=1;
//         for(int i=1; i<=number;i++){
//             fact=fact*i;
//         }
//         System.out.println("factorial is: "+fact);
//     }
// }

import java.util.Scanner;

public class factorial{
    public static int factexp(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        System.out.println(factexp(number)); 

    }
}