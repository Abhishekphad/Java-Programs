package package2.array;

public class sumOfSecondRow {
    public static void main(String[] args) {
        int [][] num={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int j=0;j<num.length;j++){
            sum+=num[1][j];
        }
        System.out.println(sum);
    }
}
