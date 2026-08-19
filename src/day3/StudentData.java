package day3;

public class StudentData {
    String name; int age;

    StudentData(String name,int age)

    {
        this.name = name;
        this.age = age;

    }

    public static void main(String[] args) {
        StudentData d1 = new StudentData("virat", 25);
        System.out.println("The Name of student is " + d1.name);
        System.out.println("The Name of student is " + d1.age);

        StudentData d2 = new StudentData("bob", 28);
        System.out.println("The Name of student is " + d2.name);
        System.out.println("The Name of student is " + d2.age);
    }
}






