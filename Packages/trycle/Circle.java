package trycle;

public class Circle
{
    public Circle(double rad)
    {
        radius = rad;
    }

    public double getArea()
    {
        return (3.14 * radius * radius);
    }

    double radius;
}