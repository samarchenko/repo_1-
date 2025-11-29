// online lesson on java going Youtube. link: https://youtube.com/playlist?list=PL7vq4D0vOpQbW4oply2GMQjVeYHNi05-I&si=hxSnEb3mJa4aAxCo




package Lesson1;

import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {

        // Lesson #4 loops and operators in them (For, While, Do While)
        // Урок №4 Цикли та оператори в них(...)
        System.out.println("Lesson №4\n");



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


        System.out.println("=====================================================================\n" + "\n");







        // Lesson №5 Arrays data.one-dimensional arrays and multi-dimensional arrays
        // Урок № 5 Масиви даних, одновимірні масиви та багатовимірні масиви.
          System.out.println("Lesson №5\n");

          // first write code array
          // one-dimensional arrays(укр: одновимирні масиви)
            int[] nums = new int[5];
            nums[0] = 1;
            nums[1] = 2;
            nums[2] = 3;
            nums[3] = 4;
            nums[4] = 5;
            System.out.println(nums[0]);
          //.


          // 2 variant writing array
          byte[] nums_2 = {6, 7, 8, 9, 10};
          System.out.println(nums_2[2]);
          //.

          System.out.print("\n\n");

          // Loop and array
            short[] array = {5, 6, 3, 7, 2, 0};
            System.out.print("Довжина масиву: " + array.length + "\n");

            for (int g = 0; g < array.length; g++){
                System.out.println(array[g] + "\n");
            }
          //.

          System.out.print("=======================================================================\n");
          System.out.print("practical application(use) lesson\n\n");




          // practical application(use) lesson

             // створюємо масив і вказуємо довжину масиву
             Scanner scan = new Scanner(System.in);
             System.out.print("Ведіть число яке і буде довжиною масива: ");
             int user_lenght = scan.nextInt();
             byte[] array_data = new byte[user_lenght];
             System.out.println("Довжина масива: " +  array_data.length);


             // проходить по кожному масиву і вставляємо значення в індексах
             for(int index = 0; index < user_lenght; index++) {
                 System.out.print("(індекс масива: " + index + ")" + " Ведіть значення до індексів: ");
                 array_data[index] = scan.nextByte();
             }



             // виводить максимельне число тобто найбільше чило в масиві
             int maxnum = array_data[0];
             for (int n = 0; n < array_data.length; n++) {
                 if (array_data[n] > maxnum) {
                     maxnum = array_data[n];
                 }
             }
             System.out.println("\n");
             System.out.println("навище значення: " + maxnum + "\n\n");



             // проходимо по масиві і виводить кожне значення в консоль
             int ipta = 0;
             int index_passes_to_array =  ipta;
             for(ipta = 0; ipta < array_data.length; ipta++){
                 System.out.print("(індекс масива: " + ipta + ") " +  array_data[ipta] + "\n");
             }
          //..

          System.out.println("=========================================================================\n\n");

          // multi-dimensional arrays
          // Багатовимірні масиви

            //first(1) varion write multi-dimensional arrays
            String[][] words = new String[2][2];

             // second(2) varion write multi-dimensional arrays
            String[][] words_2 = {
                    {"hello", "Words"},
                    {"hi", "Bro"}
            };

            System.out.println(words_2[1][1] + "\n");
          //.
        //..



    }
}
