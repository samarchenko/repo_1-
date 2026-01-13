package Lesson1;

public class Transport {

    // Lesson №9.Creating classes  and objects in java
    // Основні модифікатори достопу: public(мож з будь чого звернутися до цого елемента якщо буде приписано public),
    // protected(елемент який прописаний цим модифікатором буде доступна лише в тому класі де вона описана і класів спадкоємців),
    // private(елемент який прописаний цим модицікатором, буде закритий для всіх класів окрім де припиманий сам)




    // creating class and creating access modifiers in java

    // public class
    public float spead;
    public float weight;
    public String color;
    public float width;
    public float height;
    public byte number_of_wheels;
    public String type_bodywork;
    public String brand_transport;
    public String model_transport;
    public short Year_manufacture;

    // private class
    private int number_seats;

    public void set_values(float _spead, float _weight, String _color, short _Year_manufacture){
        spead = _spead;
        weight = _weight;
        color = _color;
        Year_manufacture = _Year_manufacture;
    }

    //
    public String get_valies(){
        String info = "\nObject spead: " + spead + ", Weight: " + weight + ", Color: " + color + ", Year manufacture: " + Year_manufacture + "\n";
        return  info;
    }

}
