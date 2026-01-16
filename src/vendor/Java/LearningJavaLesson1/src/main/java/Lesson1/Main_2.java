// online lesson on java going Youtube. link: https://youtube.com/playlist?list=PL7vq4D0vOpQbW4oply2GMQjVeYHNi05-I&si=hxSnEb3mJa4aAxCo




package Lesson1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_2 {

    public static void main(String[] args) {

        // Lesson #4 loops and operators in them (For, While, Do While)
        // Урок №4 Цикли та оператори в них(for --- для, while --- поки, do while --- робити поки)
        System.out.println("Lesson №4\n");



        // For Loop
        // for --- "for" necessary for   block code replay a certain number of times or enumerating elements of collections, arrays

        for (int i = 0; i < 10; i++) {
            System.out.print("Element is(For) " + i + "\n");
        }

        //.


        System.out.print("===============================================================\n");


        // While Loop
        // While --- the same as "if" but replay block code till, until the specified logical condition is true checking it before each execution of the loop body;

        int i_2 = 0;
        while (i_2 < 15) {
            System.out.print("Element is(while) " + i_2 + "\n");
            i_2++;
        }

        //.


        System.out.print("===============================================================\n");


        // Do/While Loop
        // do while --- this element is loop performs at least once even if the condition is not true

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
                // break --- stops code fully
            }

            if(a % 2 == 0){
                continue;
                // continue(продовжувати) --- to skip a specific block of code
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


            // traversal of an array
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


        System.out.println("============================================================================\n");




        // Lesson №6 Collections in Java(Collections Framework)

           System.out.println("Lesson №6\n");

           // Collection  ArrayList
           ArrayList<Short> anton = new ArrayList<>();
           anton.add((short)56);
           short anton_1 = 45;
           anton.add(anton_1);
           anton.add(1, (short)13);
           anton.add(2, (short)24);
           anton.remove(2);
           anton.isEmpty();
           anton.set(0, (short)90);
         //anton.clear();

//           Short[] qwerty =  (Short[])anton.toArray();
           Short[] qwerty = anton.toArray(new Short[0]);
           System.out.println("Колекція перетворена в масив.Значення 0 індекса:  " + qwerty[0]);


           // 1 version traversing the arrays
           for(int i = 0; i < anton.size(); i++){
               System.out.println(anton.get(i));
           }

          System.out.print("\n");

           // 2 version traversing the arrays
           for(short arr : anton){
               System.out.println(arr);
           }
           //.


          // Collection LinkedList
            LinkedList<Float> linkedList = new LinkedList<>();
            linkedList.add(5.5f);
            linkedList.add(15.5434f);
            linkedList.add(8.1234f);
            linkedList.add(3.45084f);


            System.out.println("значення першого(нульвого) індексу: " + linkedList.getFirst());
            System.out.println("значення 1 індекса: " + linkedList.get(1));
            System.out.println("значення 2 індекса: " + linkedList.get(2));
            System.out.println("значення посліднього(3) індексу: " + linkedList.getLast());

            linkedList.removeFirst();
            linkedList.removeLast();

            for(float vbn : linkedList){
                System.out.println(vbn);
            }
          //.
        //..


    }
}
