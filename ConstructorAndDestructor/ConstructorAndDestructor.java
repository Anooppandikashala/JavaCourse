import javax.security.auth.login.CredentialException;

/*

Constructor And Destructor

1. Constructor

    Special function 
    constructor name is same as the class Name
    no-return-type

    1. Default Constructor

    class A

        A()
        {
            //body of constructor
        }
    

    2. Parameterized Constructor 

        A(int x,int y)
        {
            //body of constructor
        }


2. Destructor


*/

class Circle
{
    // Default Constructor
    Circle()
    {
        System.out.println("Called Default Constructor");
        rad = 10;
    }

    // Parameterized Constructor
    Circle(double radius)
    {
        System.out.println("Called Parameterized Constructor");
        rad = radius;
    }

    double getArea()
    {
        return (3.14 * rad * rad);
    }

    double rad;
}

public class ConstructorAndDestructor {

    public static void main(String[] args) {
        
        Circle c1 = new Circle(20);
        System.out.println(c1.getArea());

        Circle c2 = new Circle();
        System.out.println(c2.getArea());

    }
    
}