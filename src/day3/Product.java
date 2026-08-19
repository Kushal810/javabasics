package day3;

public class Product {
    String name; int bno;int pp;

    Product(String name,int bno,int pp)

    {
        this.name = name;
        this.bno=bno;
        this.pp=pp;

    }

    public static void main(String[] args) {
        Product p1 = new Product("laptop",123,500);
        System.out.println("The Name of product is " + p1.name );
        System.out.println("The Name of product is " + p1.bno);
        System.out.println("The Name of product is " + p1.pp);

        Product p2 = new Product("fan",453,400);
        System.out.println("The Name of product is " + p2.name );
        System.out.println("The Name of product is " + p2.bno);
        System.out.println("The Name of product is " + p2.pp);
    }
}


