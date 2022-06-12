package com.springboot.java.student;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        // Primitive data type
        // byte	1 byte	Stores whole numbers from -128 to 127
        // short	2 bytes	Stores whole numbers from -32,768 to 32,767
        // int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        // boolean	1 bit	Stores true or false values
        // char	2 bytes	Stores a single character/letter or ASCII values

// Numbers:
        byte byt=1;
        short sht=23;
        long lg=234;
        int myNum = 5;               // Integer (whole number)
 //Decimals
        float myFloatNum = 5.99f;    // Floating point number
        double dbl=12.344555;
//Other Primitive
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
 //Non -primitive
        String myText = "Hello";     // String - is an object

final int testint=10;
// testint=20;
System.out.println(testint);

        System.out.println("Tet");
        List<String> al=new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("two");
        al.add("two");
        al.add("two");
        al.add("two");
        al.add("two");
        al.add("two");
        al.add("two");
        al.add("two");
        al.add("two");
        al.add("two");
        al.add("two");
        // ArrayList<String> al2= al;
        System.out.println(al.toString());
        // System.out.println(al2.toString());
    }

    
}
