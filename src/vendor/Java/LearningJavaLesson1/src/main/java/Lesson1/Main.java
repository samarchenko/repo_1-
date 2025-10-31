// online lesson on java going Youtube. link: https://youtube.com/playlist?list=PL7vq4D0vOpQbW4oply2GMQjVeYHNi05-I&si=hxSnEb3mJa4aAxCo


// Lesson №1 vareible in java and data types
package Lesson1;

class Main {

    public static void main(String[] args){


        /*

            data types:
            1)int(integer) --- ціле чило. for example -2,-1,0,1,2...10000 but which has diapason from -2,147,483,648 to 2,147,483,647
               * byte --- diapason number from -128 to 127
               * short --- diapason number form -32,768 to 32,767
               * long --- diapason number from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

            2)float --- плавати.Floating point number, for example -2.5, -1.5, 10.5, 4.55... but save fractional number can be diapasone after comma from 6 to 7 numbers
               * double --- the same as float but  diapason numbers after comma is  from 15  to 16
            3)char(Character) --- характер. this  element save only one symbol.
            4)boolean(логічний) --- true or false
            5)str(String) --- строка,текстовий

            int(integer - ціче число) ---  this is data type(-2,-1,0,1,2,3,4,5 ....)



            vareible --- this is container for save value data types.
            num(number) --- this is vareible in java.  which is equal to data type integer(int)  that is  number 15

         */

        int num0 = 15;
        System.out.print("vareible num: " + num0);

        System.out.print("\n");
        System.out.print("\n");

        int num1 = 2;
        System.out.print("this is first vareible num1: " + num1 + "\n");
        num1 = 7;
        System.out.print("this is second vareible num1: " + num1 + "\n");
        System.out.print("\n");

        byte num2 = 100; // 1 byte
        short num3 = 23000;  // 2 byte
        int num4 = 1000000; // 4 byte
        long num5 = 8000000;  // 8 byte
        System.out.print("byte: " + num2 + "\n");
        System.out.print("short: "  + num3 + "\n");
        System.out.print("int " + num4 + "\n");
        System.out.print("long: " + num5 + "\n");
        System.out.print("\n");

        float num6 = 5.505f; // 4 byte
        double num7 = 5.1234567789f; // 8 byte
        System.out.print("float: " + num6 + "\n");
        System.out.print("double: " + num7 + "\n");
        System.out.print("\n");

        char symbol = '@';
        String str = "hello world!";
        System.out.print("char: " + symbol + "\n");
        System.out.print("String: " + str + "\n");
        System.out.print("\n");

        boolean ishappy = false;
        System.out.print("boolen: " + ishappy + "\n");









    }
}
