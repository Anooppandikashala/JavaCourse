/*
 
    Java Arrays

    Collection of marks -- collection of int
    Collection of names -- collection of String

    Property ----> 
        1. Continues memory location 
        2. starting element 0th
            size of an Array ---> n
            last element --- (n-1)th

    1. Array decleration

        Syntax :

            data_type[] arrayName;

    2. Array initialization

            data_type[] arrayName = {value1, value2, .... value_n}

            data_type[] arrayName = new data_type[size];



*/

import java.util.Scanner;

public class JavaArrays {

    public static void implementJavaArrays()
    {
        System.out.println("Enter Marks of a student");

        int[] marks = new int[5];
        Scanner s = new Scanner(System.in);

        for(int i=0; i< 5; i++)
        {
            System.out.println("Enter mark " + (i+1));            
            marks[i] = s.nextInt();
        }

        for(int i=0; i< 5; i++)
        {
            System.out.println(marks[i]);
        }

        int sum = 0;
        for(int i=0; i< 5; i++)
        {
            sum = sum + marks[i];
        }
        System.out.println("Sum : " + sum);

        double avgMark = sum / marks.length;
        System.out.println("Avg  : " + avgMark);

        for(int mark : marks)
        {
            System.out.println(mark);
        }

    }

    public static void main(String[] args) {
        implementJavaArrays();
    }
}

