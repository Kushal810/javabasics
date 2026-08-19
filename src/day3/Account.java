package day3;

public class Account {

    String name;
    int accountno;
    double balance;
    Account(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    void display(){
        System.out.println("Account holder:"+this.name);
        System.out.println("Account balance:"+this.balance);
    }
    public static void main(String[] args)
    {
        new Account("kushal",60000).display();
    }
}

