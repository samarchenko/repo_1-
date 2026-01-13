package Lesson1;

public class Main_4 {
    public static void main(String[] args){

        // Lesson №9.Creating classes  and objects in java..
        System.out.println("\nLesson №9.Creating classes  and objects in java");
        // Основні модифікатори достопу: public(мож з будь чого звернутися до цого елемента якщо буде приписано public),
        // protected(елемент який прописаний цим модифікатором буде доступна лише в тому класі де вона описана і класів спадкоємців),
        // private(елемент який прописаний цим модицікатором, буде закритий для всіх класів окрім де припиманий сам)

        // create object BMW M5 G90
        // Option 1
        Transport BMW_M5_G90_2025 = new Transport();
//        BMW_M5_G90_2025.spead = 200.5f;
//        BMW_M5_G90_2025.weight = 2000;
//        BMW_M5_G90_2025.color = "Black";
//        BMW_M5_G90_2025.brand_transport = "BMW";
//        BMW_M5_G90_2025.model_transport = "M5";
//        BMW_M5_G90_2025.Year_manufacture = 2025;
//        BMW_M5_G90_2025.type_bodywork = "Sidan G90";

        //Option 2
        BMW_M5_G90_2025.set_values(200.5f, 2000f, "Black", (short)2025);


        //  create object truck Scania S500
        Transport Scania_S500 = new Transport();
        Scania_S500.spead = 150f;
        Scania_S500.weight = 6000;
        Scania_S500.color = "White";
        Scania_S500.type_bodywork = "Truck";
        Scania_S500.brand_transport = "Scania";
        Scania_S500.model_transport = "S500";
        //Scania_S500.number_seats = 4;  You can't do that because the modifier is private.
        //.

        System.out.println(BMW_M5_G90_2025.get_valies());
        System.out.println(Scania_S500.color);

        //..

    }
}
