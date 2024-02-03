package package2;

import java.util.Scanner;

public class exmpl1 {
    public static void avgOf3(int sum){
        double avg= sum/3;
        System.out.println(avg);;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int sum= a+b+c;
        avgOf3(sum);
    }
}
