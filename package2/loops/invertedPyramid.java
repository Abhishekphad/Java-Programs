package package2.loops;
class invertedPyramid{
    public static void main(String[] args) {
        int n=10;
        pyramid(n);
    }
    public static void pyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}