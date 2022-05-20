package phuongtrinhbachai;
public class PTB2 {
    double a, b, c;

    public PTB2(){
    }

    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDelta() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.getDelta(), 0.5)) / (this.a * 2);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.getDelta(), 0.5)) / (this.a * 2);
    }


}
