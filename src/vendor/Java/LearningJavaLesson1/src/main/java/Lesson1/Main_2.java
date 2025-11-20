// online lesson on java going Youtube. link: https://youtube.com/playlist?list=PL7vq4D0vOpQbW4oply2GMQjVeYHNi05-I&si=hxSnEb3mJa4aAxCo




package Lesson1;

import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {

        // Lesson #4 loops and operators in them (For, While, Do While)
        // Урок №4 Цикли та оператори в них(...)




        // For Loop

        for (int i = 0; i < 10; i++) {
            System.out.print("Element is(For) " + i + "\n");
        }

        //.


        System.out.print("===============================================================\n");


        // While Loop

        int i_2 = 0;
        while (i_2 < 15) {
            System.out.print("Element is(while) " + i_2 + "\n");
            i_2++;
        }

        //.


        System.out.print("===============================================================\n");


        // Do/While Loop

        int i_3 = 0;
        do {
            System.out.print("Element is(do while): " + i_3 + "\n");
            i_3++;
        } while(i_3 < 20);

        //.

        System.out.print("=======================================================\n");


        // Operators in Loops

        for(byte a = 1; a <= 11; a++){

            if (a == 11 ){
                break;
            }

            if(a % 2 == 0){
                continue;
            }

            System.out.print(a + "\n");
        }
        //.

        //..



    }
}
