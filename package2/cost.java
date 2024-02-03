import java.util.Scanner;

public class cost {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        float pencile= sc.nextFloat();
        float pen= sc.nextFloat();
        float eraser= sc.nextFloat();
        float TotalBill= pencile+pen+eraser;
        System.out.println(TotalBill);
        float billwithgst= (0.18f*TotalBill)+ TotalBill;
        System.out.println(billwithgst);
    }
    
}
