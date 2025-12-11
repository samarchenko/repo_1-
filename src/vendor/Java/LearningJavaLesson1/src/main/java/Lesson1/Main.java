// online lesson on java going Youtube. link: https://youtube.com/playlist?list=PL7vq4D0vOpQbW4oply2GMQjVeYHNi05-I&si=hxSnEb3mJa4aAxCo




/*

package --- using package for avoid conflicts names and for good write codes.Package there are2 types: built in(Java API) and using package(created by hand)

*/

package Lesson1;





/*

import --- using for providing access to classes,interfaces which are located different package(libraries)
java.util --- this is package(libraries)
.Scanner --- this is  class  package java.util
on  this code connecting package  java.util and class scanner
 */

import java.util.Scanner;




/*



 */

class   Main {



    /*



     */

    public static void main(String[] args){



        // first code on java
        System.out.print("1)Hello world!" + "\n");
        System.out.print("2)Hello \nworld" + "\n");
        System.out.print("3)hello \tworld" + "\n");
        System.out.print("4)hello \"" + "\n");
        System.out.print("5)hello \\" + "\n");
        System.out.print("\n");






        //Lesson №1 vareible in java and data types

        /*

            data types:
            1)int(integer) --- ціле чило. for example -2,-1,0,1,2...10000 but which has diapason from -2,147,483,648 to 2,147,483,647
               * byte(байт) --- diapason number from -128 to 127
               * short(короткий) --- diapason number form -32,768 to 32,767
               * long(довгий) --- diapason number from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

            2)float --- плавати.Floating point number, for example -2.5, -1.5, 10.5, 4.55... but save fractional number can be diapasone after comma from 6 to 7 numbers
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

           byte num2 = 100; // 1 byte RAM
           short num3 = 23000;  // 2 byte  RAM
           int num4 = 1000000; // 4 byte RAM
           long num5 = 8000000;  // 8 byte RAM
           System.out.print("byte: " + num2 + "\n");
           System.out.print("short: "  + num3 + "\n");
           System.out.print("int " + num4 + "\n");
           System.out.print("long: " + num5 + "\n");
           System.out.print("\n");

           float num6 = 5.505f; // 4 byte RAM
           double num7 = 5.1234567789f; // 8 byte RAM
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
         //.


      //Lesson №2 Data from user. mathematical operations.

        //Data from user

           /*
               Scanner  --- this is class which reading data from source(files,console,input user,cod) or is used for get data  user.
               scan --- this is vareible.
               new --- this is keyword which create new object
               System --- this is built  сlass in java.he give access to system functions such as "out" for inference on console and "in" for reading with console
               System.in --- he allow program get data which user enters through the console


            */
           Scanner scan = new Scanner(System.in);

           /*
              String --- this is data type
              text --- vareible
              nextLine() --- Reads a String value from the user
              System.out.print() --- prints everything you type in parentheses
            */
           String text = scan.nextLine();
           System.out.print("text: " + text + "\n");

           /*
             ins --- data type
             nexInt() --- 	Reads a int value from the user
             scan.nextInt() --- receives data user but only integer  with keyboard, what the user wrote
            */
           int userNum = scan.nextInt();
           System.out.print("number: " + userNum + "\n");

           /*
             float --- data type
             nextFloat() --- Reads a float value from the user
             nextFloat() ---same as nextInt() but only float

            */
           float userfloat = scan.nextFloat();
           System.out.print("float: " + userfloat + "\n");
         //.






           // mathematical operations

           int a = 5, b = 3, res;
           res =  a + b;  // +, -, *, /, %
           System.out.print("a + b result: " + res + "\n");
           res += 5; // res = res + 5)) +, -, *, /, %.
           System.out.print("res +=5 result: " + res +  "\n");
           res++; // res = res + 1, res += 1)) +, -.
           System.out.print("res++ result: " + res + "\n");
           //.






           //practice of the studied material --- calculator

              // code which reads console what was written
              Scanner console = new Scanner(System.in);

              System.out.print("number 1: ");
              int numb1 = console.nextInt();

              System.out.print("number 2: ");
              int numb2 = console.nextInt();

              System.out.print("res(+): " + (numb1 + numb2) + "\n");
              System.out.print("res(-): " + (numb1 - numb2) + "\n");
              System.out.print("res(*): " + (numb1 * numb2) + "\n");
              System.out.print("res(/): " + (numb1 / numb2) + "\n");
              System.out.print("res(%): " + (numb1 % numb2) + "\n");
              System.out.print("\n");
           //.

      //.













           //Lessons №3 conditional constructions(if, if else, else, switch, case)
           // Урок №3 Умовні Конструктори(if --- якщо, if else --- якщо інакше, else --- інакше , switch --- перемикач, case --- справа, коробка)

               // conditional "if","else","if else" statement
               // "if" this  is  conditional constructor in Java he performs conditional branching he checks the conditio if she is a true then it is done a specific block of code
              // this element "==" used for to indicate equality (is it equal to it? if yes namly true then the then the condition is true and the compiler will read and execute certain code
               if (5 == 5 ){
                   System.out.print("it is tru" + "\n");
               }

               System.out.print("Enter number: ");
               int user = scan.nextInt();
               char sym = '$';

               // comparison operators(оператори порівняння): <, <=, >, >=, ==, !=.
               // && --- it is logical operator "and"
               // || --- it is logical operator "or"
               // symbol "> and < " this is mathematical signs greater than and less than
               // symbol ">= and =< " mathematical signs greater than equals and less than equals
               // this element "!=" means opposite of the element "=="

               if (user == 50 && sym == '$') {
                   System.out.print("number is 50: " + user + sym + "\n");

                   boolean isHappy = false ;
                   if(!isHappy){
                       System.out.print("don't happy!\n");
                   }
                   // else if --- the same as and element "if" but can write more else if than element "if" he write only once
                   // else --- this element written when the condition false then the else code block is executed
               } else if (user > 50) {
                   System.out.print("the number is greater(>) than 50\n");
               } else if (user < 50) {
                   System.out.print("the number is less(<) than 50\n");
               } else {
                   System.out.print("this isn't number\n");
               }
               //.

              System.out.print("\n");

               // "switch-case" conditional statement

               System.out.print("write number(user1): ");
               int user1 = scan.nextInt();

               //  switch --- checks only one change and can include many conditions
               // element "case" this as a condition for example  if this element then execute this code
               switch (user1) {
                   case 5:
                       System.out.print("Number is " + user1);
                       // break --- stops the code on a certain condition
                       break;
                   case 10:
                       System.out.print("number is " + user1);
                       break;
                   case 15:
                       System.out.print("number is " + user1);
                       break;
                       // it's like "else" at the end
                   default:
                       System.out.print("write correct number, because number undefined");
               }
               //.

               System.out.print("\n" + "\n");
               System.out.print("================================================\n" + "\n");



               //continuation write code calculator
               System.out.print("number 1: " );
               int numb_1 = scan.nextInt();
               System.out.print("\n");

               System.out.print("operation(+, -, *, /, %): ");
               scan.nextLine();
               char symb = scan.nextLine().charAt(0);
               System.out.print("\n");


               System.out.print("number 2: ");
               int numb_2 = scan.nextInt();
               System.out.print("\n");


               switch (symb) {
                   case '+':
                       int result = numb_1 + numb_2;
                       System.out.print("result: " + result + "\n");
                       break;
                   case '-':
                       result = numb_1 - numb_2;
                       System.out.print("result: " + result + "\n");
                       break;
                   case '*':
                       result = numb_1 * numb_2;
                       System.out.print("result: " + result + "\n");
                       break;
                   case '/':
                       if (numb_2 == 0){
                           System.out.print("ERROR\n");
                       } else {
                           result = numb_1 / numb_2;
                           System.out.print("result: " + result + "\n");
                       }
                       break;
                   case '%':
                       result = numb_1 % numb_2;
                       System.out.print("result: " + result + "\n");
                       break;
                   default:
                       System.out.print("ERROR\n");
               }
               //.


               System.out.print("===================================================================\n ");


               // 2 version calculator

                   System.out.print("number 1: ");
                   int a1 = scan.nextInt();
                   System.out.print("\n");

                   System.out.print("Operation: ");
                   scan.nextLine();
                   char math = scan.nextLine().charAt(0);
                   System.out.print("\n");

                   System.out.print("number 2: ");
                   int a2 = scan.nextInt();
                   System.out.print("\n");

                   if(math == '+') {
                       int c = a1 + a2;
                       System.out.print("result: " + c );
                   } else if (math == '-') {
                       int c = a1 - a2;
                       System.out.print("result: " + c );
                   } else if (math == '*') {
                       int c = a1 * a2;
                       System.out.print("result: " + c );
                   } else if (math == '/') {
                       if (a2 == 0){
                           System.out.print("ERROR");
                       } else {
                           int c = a1 / a2;
                           System.out.print("result: " + c);
                       }
                   } else if (math == '%') {
                       int c = a1 % a2;
                       System.out.print("result: " + c );
                   } else {
                       System.out.print("ERROR");
                   }
               //.
           //.
    }
}
