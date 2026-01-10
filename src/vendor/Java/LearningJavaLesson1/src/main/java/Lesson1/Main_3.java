package Lesson1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main_3 {
    public static void main (String[] args){

        System.out.print("\n");

        // Lesson №7.Funcions on Java.
        System.out.println("Lesson №7.Funcions on Java.");

        System.out.println("Це і є функція --- System.out.print");

        info();

        info_2("hello new funcion info_2");

        Scanner scan = new Scanner(System.in);
        System.out.print("Ведіть 1 число: ");
        short number_1 = scan.nextShort();
        System.out.println("Буде виконано операція + ");
        System.out.print("Ведіть 2 число: ");
        short number_2 = scan.nextShort();

        int result = summ(number_1, number_2);
        System.out.print("return: " + result + "\n");

        System.out.println("================================================================================");

        int[] array_1 = new int[4];
        array_1[0] = 6;
        array_1[1] = 7;
        array_1[2] = 4;
        array_1[3] = 7;

        int summa_1 = 0;
        for(int i = 0; i < array_1.length; i++){
            summa_1 += array_1[i];
        }
        System.out.println("Сума всіх елементів arrray_1: " + summa_1);

        int[] array_2 = new int[5];
        array_2[0] = 6;
        array_2[1] = 7;
        array_2[2] = 4;
        array_2[3] = 7;
        array_2[4] = 6;

        summa_array(array_2);

        //.
    }

    public static void info() {
        System.out.println("funcoin info!");
    }

    public static void info_2(String word) {
        System.out.println(word);
    }

    public static int summ(int a, int b) {
        int res = a + b;
        System.out.println("Сума: " + res );
        return res;
    }

    public static void summa_array(int[] arr ) {
        int summa_2 = 0;
        for(int i = 0; i < arr.length; i++) {
            summa_2 += arr[i];
        }
        System.out.println("Сума всіх елементів arrray_2: " + summa_2);
    }
}
