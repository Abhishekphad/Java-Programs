package package2;
import java.util.Scanner;

public class even {
public static boolean iseven(int n){
    if(n%2==0){
        return true;
    }else{
        return false;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        iseven(n);
        System.out.println(iseven(n));
    }
}
