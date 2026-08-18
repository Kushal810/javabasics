package day2;

public class TypeCasting {
    public static void main(String[] args)
    {
        int num=100;
        double value=num;
        System.out.println(value);
        double price=99.99;
        System.out.println("The Round off"+Math.round(price));
        int converted=(int)price;
        System.out.println(converted);

    }
}
