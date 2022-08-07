/*

Break and Continue Statements

    1. Break

    Syntax
        break;

    2. Continue

    while()
    {
        //code
        if condition
            continue;
        //code
    }


*/



class BreakAndContinue {

    public static void implementWhileLoop()
    {
        int num = 0;
        while(num <= 10)
        {
            num++;
            if(num == 5)
            {
                continue;
            }
            System.out.println(num);            
            
        }
    }

    public static void main(String[] args) {
        implementWhileLoop();
    }
}
