package Recursion;

public class DuplicateStr {
    public static void duplicateinstr(String str, int index, StringBuilder newstr, boolean map[]) {
        //Base case
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        char curchar=str.charAt(index);
        if(map[curchar-'a']==true){
            // Duplicate
            duplicateinstr(str, index+1, newstr, map);
        }else{
            map[curchar-'a']=true;
            duplicateinstr(str, index+1, newstr.append(curchar), map);
        }
    }
    public static void main(String[] args) {
        String str="Abhishek";
        duplicateinstr(str, 0,new StringBuilder(" "), new boolean[26]);
    }
}
