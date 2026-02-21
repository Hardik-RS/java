class Circle 
{
    private int x, y;
    private double r;
    
    Circle() {
        x = 0; y = 0; r = 1;
    }

    Circle(double r) {
        x = 0; y = 0; this.r = r;
    }

    Circle(int x, int y, double r) {
        this.x = x; this.y = y; this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }

    public double circumference() {
        return 2 * 3.14 * r;
    }
}

public class circle7 
{
    public static void main(String[] args) 
    {

        Circle c1 = new Circle()
        System.out.println("DeFault Constructor");
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: " + c1.circumference());

        Circle c2=new Circle(2);
        System.out.println("");
        System.out.println("Radius-only Constructor");
        System.out.println("Area: " + c2.area());
        System.out.println("Circumference: " + c2.circumference());

        Circle c3=new Circle(0,0,2);
        System.out.println("");
        System.out.println("Parameterized Constructor");
        System.out.println("Area: " + c3.area());
        System.out.println("Circumference: " + c3.circumference());

    }
}
