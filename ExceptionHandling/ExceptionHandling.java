

/*


Exception Handling


*/

class TestException
{
    public void doTesting1()
    {
        try{
            int a = 10;
            int b = 100;

            int result = b/a;

            System.out.println("Result :" + result);
        }
        catch(ArithmeticException a)
        {
            System.out.println("Devided by zero error");
        }
        catch(Exception e)
        {
            System.out.println("Unknown error");
        }
        finally{
            System.out.println("Always executes");
        }
    }

    public void doTesting2()
    {
        throw new ArithmeticException();
    }

    public void doTesting() throws ArithmeticException
    {
        int a = 0;
        int b = 100;

        int result = b/a;
    }
}


public class ExceptionHandling {

    public static void main(String[] args) {
        TestException t = new TestException();
        try{
            t.doTesting();
        }
        catch(Exception e)
        {
            System.out.println("Exception happend");
        }
        
    }
    
}