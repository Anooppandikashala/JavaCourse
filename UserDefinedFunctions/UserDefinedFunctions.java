/*

User-defined Functions/Methods

    Syntax

        return-type FunctionName(arguments)
        {
            //function body

            return value
        }


        return-type  : function  ---> result
        FunctionName : getSum, getResult, setName
        arguments : values given to the function
        function-body : logic of the function

        Function call:

            FunctionName(arguments);



*/

class UserDefinedFunctions {

    public int addTwoNumbers(int num1, int num2)
    {
        int result = num1 + num2;
        return result;
    }


    public static void main(String[] args) 
    {
        UserDefinedFunctions object = new UserDefinedFunctions();
        int sum = object.addTwoNumbers(100,200);
        System.out.println(sum);
    }
    
}