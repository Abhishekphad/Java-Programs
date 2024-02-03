package Recursion;

public class fibonachi {
    // Fibonachi number is sum of previous two numbers (0,1,1,2,3,5,8.....)
    public static int fibonachinumber(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1= fibonachinumber(n-1);
        int fibnm2= fibonachinumber(n-2);
        return fibnm1+fibnm2;
    }
    public static void main(String[] args) {
        int n=30;
        System.out.println(fibonachinumber(n));
    }
}
