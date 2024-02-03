package Recursion;

public class FirstOcurrence {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,2,4,6,2,5};
        int key=5;
        int i=0;
        System.out.println(occurence(arr , key , i));
    }
    private static int occurence(int[] arr, int key, int i) {
        //Base case==> if element not in array then return -1
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return occurence(arr, key, i+1);
    }
}
