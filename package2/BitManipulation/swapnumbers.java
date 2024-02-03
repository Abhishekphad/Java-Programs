package package2.BitManipulation;

public class swapnumbers {
    static void swapingtwonumbers(int x, int y){
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        int x=5;
        int y=10;
        swapingtwonumbers(x,y);
    }
}
