package Recursion;

public class XpowerN {
    public static int xpowern(int x, int power){
        if(power==0){
            return 1;
        }
        int xptm1= xpowern(x, power-1);
        int xn=x * xptm1;
        return xn;
    }
    public static void main(String[] args) {
        int x=34;
        int power=4;
        System.out.println(xpowern(x, power));
    }
    public static int optimizedpowern(int x, int n){
        if(n==0){
            return 1;
        }
        int powersq= optimizedpowern(x, n/2)*optimizedpowern(x, n/2); // we call for n/2 twice..... we can store value in variable 
        if(n%2==1){
            powersq=x*powersq;
        }
        return powersq;
    }
}
