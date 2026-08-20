package day4;

public class MultipleCatchExample {
    public static void main(String[] args)
    {
        try{
            int[] numbers={10,20,30};
            int a= Integer.parseInt("100");
            int b=0;
            System.out.println("The Division by"+a/b);
            System.out.println("Print the Numbers array"+ numbers[5]);
        }catch (ArithmeticException e)
        {
            System.out.println("The Arithmetic Exception"+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException"+e.getMessage());
        }catch (NumberFormatException e)
        {
            System.out.println("Arithmetic exception"+e.getMessage());
        }
        System.out.println("Program executes successfully");

    }
}
