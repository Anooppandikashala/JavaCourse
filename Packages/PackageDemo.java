
/*

Package Demo





*/

import java.util.Scanner;

import trycle.Circle;
import trycle.Rect;
import trycle.java.Output;

// import trycle.*;


class PackageDemo {
    public static void main(String[] args) {
        
        System.out.println("Enter radius : ");
        Scanner s = new Scanner(System.in);
        double rad = s.nextDouble();

        Circle c1 = new Circle(rad);
        System.out.println("Circle Area : " + c1.getArea());

        System.out.println("Enter length : ");
        double ln = s.nextDouble();
        System.out.println("Enter breadth : ");
        double br = s.nextDouble();

        Rect r1 = new Rect(ln, br);
        System.out.println("Rectangle Area : " + r1.getArea());

        Output o = new Output();
        o.printHello();
    }
}