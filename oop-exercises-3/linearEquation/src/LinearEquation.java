public class LinearEquation {

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }

    //getter
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    //setter
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void setF(int f) {
        this.f = f;
    }

    private boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return ((e * d - b * f) / (double) (a * d - b * c));
    }

    public double getY() {
        return ((a * f - e * c) / (double) (a * d - b * c));
    }

}
