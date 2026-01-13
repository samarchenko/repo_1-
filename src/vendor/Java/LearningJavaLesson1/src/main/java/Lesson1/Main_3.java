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

        System.out.println("===========================================================================================");
        //.

        // Lesson №8.Basics OOP
        System.out.println("Lesson №8.Basics OOP");
        /*
        1)Клас - це шаблон, за яким створюється об'єкт.Він містить властивості та метод що визначають, якими будуть ці об'єкти і що вони зможуть робити.


        2)Обєкт - це елемент, який має властивості, функції і може виконувати певні дії в програмуванні.

        * Властивіть - де можна індефікувати і описати  один обєкт від іншого наприклад: колір,розмір,вага,спосіб поведінки і тд.
        * функції - це методи в ооп.визначає поведінку обєкту.наприк: ходити, сидіти, нюхати, пригати і тд.

        - В ооп є 3 принципи: 1)інкапсуляція, 2)поліморфізм, 3)Наслідування 4)Абстракція.

        3)інкапсуляція - це приховання даних об'єкта, доступ до яких можливий тільки через спеціальні методи.

        4)Наслідування - це коли один клас успадковує властивості та методи іншого, щоб викристовувати їх або розширювати.

        5)поліморфізм -  це здатність об'єктів різних класів реагувати по-різному на однакові методи(функції).

        6)Абстракція - це виділення важливих характеристик обʼєкта,приховуючи зайві деталі.
         */
        //.


    }

    // Lesson №7.Funcions on Java.

    // Creating funcion
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
    //.
}
