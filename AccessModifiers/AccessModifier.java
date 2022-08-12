/*

AccessModifier


*/

import trycle.Circle;


class A{

    public void printHelloPub()
    {
        System.out.println("Hello Public");
        // printHelloPrivate();
    }

    private void printHelloPrivate()
    {
        System.out.println("Hello Private");
    }

    protected void printHelloProtected()
    {
        System.out.println("Hello Protected");
    }

}


class B extends A
{
    public void hello()
    {
        printHelloProtected();
        // printHelloPrivate();
    }
}


class AccessModifier {
    public static void main(String[] args) {
        
        A a = new A();

        a.printHelloPub();
        // a.printHelloPrivate();
        a.printHelloProtected();

        B b =new B();
        b.hello();

    }    
}