package IleriSinifNesneOzellikleri;


public class Point {
    int a;
    int b;

    public Point(int x, int y) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b= b;
    }

    public Point clone() {
        Point po = new Point(a, b);
        return po;
    }



    void printInfo() {
        System.out.println("Point"  + a + " , "  + b );
    }

    public double calculateDistanceToOrigin() {
        return Math.sqrt(a * a + b * b);
    }


}