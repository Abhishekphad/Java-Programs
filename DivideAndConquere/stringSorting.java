package DivideAndConquere;

public class stringSorting {
    public static void main(String[] args) {
        String str[]={"sun","earth","mars","mercury"};
        MergeSort(str, 0, str.length-1);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
    public static String[] MergeSort(String str[],int si,int ei){
        // base case
        if(si==ei){
            String[] A={str[si]};
            return A;
        }
        int mid= si+(ei-si)/2;
        String[] str1=MergeSort(str, si, mid);
        String[] str2=MergeSort(str, mid+1, ei);

        String[] arr3= Merge(str1, str2);
        return arr3;
    }
    static String[] Merge(String[] str1,String[] str2){
        int n=str1.length;
        int m=str2.length;
        String str3[]=new String[m+n];
        int idx=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(isAlphabeticallysmaller(str1[i], str2[j])){
                str3[idx]=str1[i];
                i++;idx++;
            }
            else{
                str3[idx]=str2[j];
                j++;
                idx++;
            }
        }
        while (i<m){
            str3[idx]=str1[i];
            i++;idx++;
        }
        while(j<n){
            str3[idx]=str2[j];
            j++;
            idx++;
        }
        return str3;
    }
    static boolean isAlphabeticallysmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;   
    }
}
