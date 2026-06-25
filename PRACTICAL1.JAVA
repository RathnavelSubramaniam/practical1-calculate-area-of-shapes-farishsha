class Point
{
private double x;
private double y;
public Point(double x, double y)
{
this.x = x;
this.y = y;
}
public double getX()
{
return x;
}
public double getY()
{
return y;
}
}
// Step 1: Define the Quadrilateral class
class Quadrilateral {
Point point1;
Point point2;
Point point3;
Point point4;
public Quadrilateral(Point p1, Point p2, Point p3, Point p4)
{
this.point1 = p1;
this.point2 = p2;
this.point3 = p3;
this.point4 = p4;
}
// No area calculation for Quadrilateral due to its general nature
}
// Step 1: Define the Trapezoid class as a subclass of Quadrilateral
class Trapezoid extends Quadrilateral
{
public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
super(p1, p2, p3, p4);
}
class Trapezoid extends Quadrilateral
{
pubilc Trapezoid(point p1,point p2,point p3,point p4)
}
{super(p1,p2,p3,p4);
}
public double calculationArea()
{
double length = Math.abs(point1.getX() - point2.getX());
double width = Math.abs(point2.getXY() - point3.getY());
return length*width;}}
class Square extends Rectangle
{
    public Square(Point p1,double sideLength)
    {
        super(p1,new Point(p1.getX()+sideLength,p1.getY()),new Point(p1.getX()+sideLength,p1.getY()+sideLength),new Point(p1.getX(),p1.getY()+sideLength));
    }
    }
class PRACTICAL1
{
    public static void main(String[]args)
    {
        Point p1=new Point(0,0);
        Point p2=new Point(4,0);
        Point p3=new Point(0,3);
        Point p4=new Point(0,3);
        Trapezoid trapezoid = new Trapezoid(p1,p2,p3,p4);
        Rectangle rectangle = new Rectangle(p1,p2,p3,p4);
        Square square =new Square(p1,3);
        Systam.out.println("Area of trapezoid="+trapezoid.calculateArea());
        Systam.out.println("Area of rectangle="+rectangle.calculateArea());
        Systam.out.println("Area of square="+square.calculateArea());
    }
}
