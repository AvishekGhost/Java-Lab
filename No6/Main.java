public class Main {

    public static void main(String[] args) {
        Complex c1 = new Complex(3,2);
        Complex c2 = new Complex(4,-2);
        Complex c = Add(c1,c2);
        System.out.println(c.getComplex());
        System.out.println(Multiply(c1,c2).getComplex());
    }
    public static Complex Add(Complex src1, Complex src2){
        Complex temp = new Complex(src1.getReal() + src2.getReal() , src1.getImg()+src2.getImg());
        return  temp;
    }
    public static Complex Multiply(Complex src1, Complex src2){
        Complex temp = new Complex(src1.getReal() * src2.getReal() , src1.getImg() * src2.getImg());
        return  temp;
    }

}
