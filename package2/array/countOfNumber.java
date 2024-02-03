package package2.array;

public class countOfNumber {
    public static void main(String[] args) {
        int[][]  arr={{4,8,7},{8,8,7}};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==7){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
