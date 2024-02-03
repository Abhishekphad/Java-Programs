package Recursion;

public class BinaryString {
    public static void printstring(int n, int lastPlace, String str){
        // Base Condition
        if(n==0){
            System.out.println(str);
            return;
        }
        // Kaam
        if(lastPlace==0){
            printstring(n-1, 0, str+="0");
            printstring(n-1, 1, str+="1");
            }
        else{
            printstring(n-1, 1, str+="0");  
        }

    }
    public static void main(String[] args) {
        printstring(4,1,"");
    }
}
