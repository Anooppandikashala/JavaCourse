/*
 
Loop Statements

    -repeats

    1 to 100 

    1. Entry control loops

        1. While loop

            Syntax

                while(expression)
                {
                    //body
                }

        2. for loop
            syntax
            for(initial value ; test-expression ; updation)
            {
                body
            }

        3. for-each loops

    2. Exit Control loop

        1. do-while loop

            do
            {
                // body
            }
            while(expression);

    

*/


class Loops {

    public static void implementWhileLoop()
    {
        int num = 1;
        while(num <= 10)
        {
            System.out.println(num);
            num++;
        }
    }

    public static void implementForLoop()
    {
        for(int num = 1; num <= 100; num++)
        {
            System.out.println(num);
        }
    }

    public static void implementDoWhileLoop()
    {
        int num = 1;
        do
        {
            System.out.println(num);
            num ++;
        }
        while(num <= 100);
    }

    public static void implementForEachLoop()
    {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};

        // Syntax

        // for ( int a : nums){
        //     body
        // }

        for(int a : nums)
        {
            System.out.println(a);
        }


    }


    public static void main(String[] args) {
        // implementWhileLoop();
        // implementForLoop();
        // implementDoWhileLoop();
        implementForEachLoop();
    }
}