package Recursion;

public class Prob4 {
    private static int count;
    static int printCount(String str,int i,int j,int length){
        // Base case
        if(length==1){
            return 1;
        }
        if(length==0){
            return 0;
        }
        // Kaam
        // for(i=0;i<str.length();i++){
        //     for(j=1;j<=length-1;j++){
        //         int count=printCount(str, i+1, j-1, length-2);
        //     }
        // }


        // Here we use A union B formula
        int count=printCount(str, i+1, j, length-1)+printCount(str, i, j-1, length-1)-printCount(str, i+1, j-1, length-2);
        if(str.charAt(i)==str.charAt(j)){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str="abca";
        int length=str.length();
        System.out.println(printCount(str, 0, length-1, length));
    }
}
