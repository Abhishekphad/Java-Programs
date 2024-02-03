package package2.array;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int marks[]=new int[10];
        Scanner sc= new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();
        // System.out.println(marks[1]);
        for(int i=0;i<marks.length;i++){
            marks[i]=i;
        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
