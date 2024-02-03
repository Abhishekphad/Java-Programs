package Recursion;

public class Prob5 {
    static void towerOfHanoi(int n,String source,String helper,String destination){
    //    Base case
    if(n==0){
        return;
    }
    towerOfHanoi(n-1, source, destination, helper);
    System.out.println("Transfer disk "+n+" From "+source+" to "+destination);
    towerOfHanoi(n-1, destination,helper, source);
    }
    public static void main(String[] args) {
        int N=3;
        towerOfHanoi(N, "A", "B", "C");
    }
    // static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    // {
    //     if (n == 0) {
    //         return;
    //     }
    //     towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    //     System.out.println("Move disk " + n + " from rod "+ from_rod + " to rod "+ to_rod);
    //     towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    // }
    // public static void main(String args[])
    // {
    //     int N = 3;
  
    //     // A, B and C are names of rods
    //     towerOfHanoi(N, 'A', 'C', 'B');
    // }
}
