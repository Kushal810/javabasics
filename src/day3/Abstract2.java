package day3;

abstract class vehicle123{
    abstract void start();
    void stop(){System.out.println("Vehicle stopped");}
}
class car extends vehicle123{
    void start(){System.out.println("Car starts");}
}
public class Abstract2 {
    public static void main(String[] args){
        car c=new car();
        c.start();c.stop();}
    }



