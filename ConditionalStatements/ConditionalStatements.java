/*

    Print name of day 

    Input :
        Number 1 to 7

    Output
        1 ----> Sunday
        2 ----> Monday
        .
        .
        .
        7 ----> Saturday

    1. if-else

        syntax

            if (statement)
            {

            }
            else
            {

            }


    2. switch 
            
        syantax

            switch(key)
            {
                case value1:
                {
                     //body
                     break;
                }
                case value2
                {
                     //body
                     break;
                }
                ...
                default
                {
                    //body
                    break;
                }
            }


*/

import java.util.Scanner;

class ConditionalStatements {

    public static void implementIfElse()
    {
        System.out.println("Enter a number between 1 to 7");

        Scanner input  = new Scanner(System.in);
        int num = input.nextInt();

        if(num == 1)
        {
            System.out.println("Sunday");
        }
        else if(num == 2 || num == 1)
        {
            System.out.println("Monday");
        }
        else if(num == 3)
        {
            System.out.println("Tuesday");
        }
        else if(num == 4)
        {
            System.out.println("Wednesday");
        }
        else if(num == 5)
        {
            System.out.println("Thursday");
        }
        else if(num == 6)
        {
            System.out.println("Friday");
        }
        else if(num == 7)
        {
            System.out.println("Saturday");
        }
        else
        {
            System.out.println("Invalid number");
        }

        System.out.println("End if");

    }

    public static void implementSwitch()
    {
        System.out.println("Enter a number between 1 to 7");

        Scanner input  = new Scanner(System.in);
        int num = input.nextInt();

        switch(num)
        {
            case 1 :
            {
                System.out.println("Sunday");
                break;
            }
            case 2 :
            {
                System.out.println("Monday");
                
            }
            case 3 :
            {
                System.out.println("Tuesday");
               
            }
            case 4 :
            {
                System.out.println("Wed");
                break;
            }
            case 5 :
            {
                System.out.println("Thu");
                break;
            }
            case 6 :
            {
                System.out.println("Fri");
                break;
            }
            case 7 :
            {
                System.out.println("Sat");
                break;
            }
            default:
            {
                System.out.println("Invalid Number");
            }
        }

    }

    public static void main(String[] args) 
    {
        //implementIfElse();
        implementSwitch();
    }
}