package com.springboot.java.student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

interface StringFunction {
        String run(String str);
      }

public class test {
        
        int x=34;

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
test tob= new test();
System.out.println("xxxx---"+tob.x);
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
System.out.println(testString("123333333333"));
double mydou=myNum;
int mydouint=(int)mydou;
int day=1;
switch(day){
        case 1:
        System.out.println("*********");
        break;
        case 2:
        System.out.println("^^^^^^^^^^^^");
        break;
        
}

String[] cars;

for(int i=2; i<3; i++){
System.out.println(i+"%%%%%%%%%%%%%%%%%%%");
}
if(1==2){
System.out.println("0000000000000000000000");
} else{
        System.out.println("999999999999999999999999");
}
System.out.println(Math.sqrt(64));
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
        Consumer<String> tr= ( n -> { System.out.println(n);} );
        al.forEach(tr);

        StringFunction exclaim = (s) -> s + "!";
     StringFunction ask = (s) -> s + "?";

     System.out.println(exclaim.toString());
     String result = exclaim.run("---");
     System.out.println(result);
 


        // ArrayList<String> al2= al;
        System.out.println(al.toString());
        // System.out.println(al2.toString());
    }

    public static String testString(String val){
        String val2=val+"---";
        student std= new student();
        // student std2=new Main();
        std.setAge(10);
        System.out.println("___________"+std.getAge().toString());
        // System.out.println(val2);
        return val2;
    }

    
}

class Vehicle {
        protected String brand = "Ford";
        public void honk() {
          System.out.println("Tuut, tuut!");
        }
      }
      
      class Car extends Vehicle {
        private String modelName = "Mustang";
        public static void main(String[] args) {
          Car myFastCar = new Car();
          myFastCar.honk();
          System.out.println(myFastCar.brand + " " + myFastCar.modelName);
        }
      }


