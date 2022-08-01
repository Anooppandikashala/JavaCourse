/*
    Input And Output Functions

    1. Output functions

        Program  -----> User ---> Result/Output

        1.  println()

            System ---> out -----> println()

            System.out.println("Hello world");
        
        2. print()

            System ---> out -----> print()
            System.out.print("Hello world");

    2. Input functions

        User ------> Program  ----> signals/files/cammands/input

        Scanner Class

            import java.util.Scanner;

            Scanner input = new Scanner(System.in);
            int x = input.nextInt();

*/

import java.util.Scanner;

class InputAndOutput {

    public static void main(String[] args) {
        
        // System.out.println("Hello world1");
        // System.out.println("Hello world2");

        // System.out.print("Hello world3");
        // System.out.print("Hello world4");

        // int x = 9000;
        // System.out.println(x);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number :");        
        int num1 = input.nextInt();

        System.out.println("Enter second number :");
        int num2 = input.nextInt();

        int result = num1 + num2;

        System.out.println(result);

        System.out.println("Enter double :");
        double x = input.nextDouble();
        System.out.println(x);

        System.out.println("Enter string :");
        String s = input.next();
        System.out.println(s);

        input.close();

    }
    
}
