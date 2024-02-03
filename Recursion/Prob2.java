package Recursion;

public class Prob2 {
    public static void printInLetter(int input){ 
        String[] str={"Zero","One", "Two","Three","Four","Five","Six","Seven","Eigth","Nine"};
        // Base case
        if(input==0){
            return;
        }
        // Kaam
        int lastDigit=input%10;
        printInLetter(input/10);
        System.out.print(str[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int input=3468536;
        printInLetter(input);
    }
}
