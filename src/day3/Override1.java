package day3;

class Animal2{ void sound(){System.out.println("Animal sound");} }
class Dog extends Animal2 {
    @Override void sound(){System.out.println("Dog barks");}
}

public class Override1 {

    public static void main(String[] args)
    {
        Dog d=new Dog();
        System.out.println("The parent class method is sound and child class method is Dog barks with same method");
        d.sound();
        Animal2 a = new Animal2();
        a.sound();
    }
}
