/*

this, static and final Keywords


this keyword

static 

final


*/


class Circle
{
    Circle()
    {
        radius = 0;
        this.radius = 0;
        objectCount++;
    }

    Circle(double radius)
    {
        this.radius = radius;
        objectCount++;
    }

    public void printArea()
    {
        double area = 3.14 * radius * radius;
        System.out.println("Area :" + area);
    }

    public static void incrementObjectCountBy100()
    {
        objectCount += 100;
    }

    public static int objectCount;
    // private final double  radius = 100;
    private double  radius;
}

public class ThisStaticFinalKeywords {

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(11);
        Circle c3 = new Circle(12);
        Circle c4 = new Circle(13);
        System.out.println("Number of objects created : "+ Circle.objectCount);
        Circle.incrementObjectCountBy100();
        System.out.println("Number of objects created : "+ Circle.objectCount);

    }
}