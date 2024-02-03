package package2;

import java.util.Scanner;

public class hollowrect {
    public static void hollowrectangle(int n,int m){
        int lastclmn=n;
        int lastrw=m;
        for(int i=1;i<=lastclmn;i++){
            for(int j=1;j<=lastrw;j++){
                if(i==1 || i==lastclmn || j==1 || j==lastrw){
                    System.out.print("*");
                }else{System.out.print(" ");}
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of columns: ");
        int n= sc.nextInt();
        System.out.println("Enter no of rows: ");
        int m=sc.nextInt(); 
        hollowrectangle(n,m);
    }
}
