package package2.BitManipulation;
class complex{
    int real;
    int imaginary;
    public complex (int r,int i){
        real=r;
        imaginary=i;
    }
    public complex add(complex a , complex b){
        return new complex((a.real+b.real),(a.imaginary+b.imaginary));
    }
    public complex difference( complex a,  complex b){
        return new complex((a.real-a.real),(a.imaginary - b.imaginary));
    }
    public complex product(complex a, complex b){
        return new complex ((a.real*b.real)-(a.imaginary*b.imaginary),(a.real*b.real)+(a.imaginary*b.imaginary));
    }
    public static void main(String[] args) {
        complex c= new complex(3,4);
        complex d= new complex(5, 6);
        
        complex e= complex.add(c,d);
        e.printcomplex();
        // System.out.println(complex(c,d));
    }
}   