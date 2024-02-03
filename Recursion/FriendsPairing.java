package Recursion;

public class FriendsPairing {
    public static int friendspairing(int n){
        // Base case
        if(n==1||n==2){
            return n;   
        }
        // Single
        int fnm1=friendspairing(n-1);
        // Pair
        int fnm2=friendspairing(n-2);
        int pairways=(n-1)* fnm2;
        // Total ways to pair
        int totalways=pairways+fnm1;
        return totalways;
        // Reduced sized code
        // return friendspairing(n-1)+(n-1)*friendspairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendspairing(4));
    }
}
