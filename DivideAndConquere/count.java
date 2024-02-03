package DivideAndConquere;
// counting no of swaping of element for sorting array in order..........+
public class count {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,4};
        System.out.println(countofarray(arr));
    }
    public static int countofarray(int arr[]){
        int count=0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
