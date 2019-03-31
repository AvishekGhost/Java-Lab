public class Complex {
    private int Real;
    private int Img;

    public Complex(int Real, int Img) {
        this.Real = Real;
        this.Img = Img;
    }

    public Complex(int Real) {
        this.Real = Real;
        this.Img = 0;
    }

    public Complex() {
        this.Real = 0;
        this.Img = 0;
    }

    public String getComplex() {
        if(this.Img < 0) return Real + " - i" + Img*(-1);
        else if (this.Img == 0) return Real + "";
        else return  Real + " + i" + Img ;
    }

    public int getReal() {
        return Real;
    }

    public int getImg() {
        return Img;
    }
}
