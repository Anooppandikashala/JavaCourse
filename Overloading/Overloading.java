/*

Polymorphism --- Overloading

1. Constructor




2. Method

    getSum(int x, int y);

    getSum(double x, double y);


*/

class Circle
{
    Circle()
    {
        radius = 0;
    }

    Circle(int rad)
    {
        radius = rad;
    }

    public double getArea()
    {
        return (3.14 * radius * radius);
    }

    public double getArea(int rad)
    {
        return (3.14 * rad * rad);
    }

    
    int radius;

}


class Overloading {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(100);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c1.getArea(200));
        System.out.println(c2.getArea(200));

    }
    
}