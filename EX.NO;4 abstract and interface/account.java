/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractc;
import java.util.Scanner;    
public class account 
{
    public static void main(String[] args)
    {
        accountdetails obj = new currentaccount();
        System.out.println("Account details:");
        obj.getdata();
        obj.getbalance();
        obj.deposit(1000);
        obj.withdraw(500);
        account obj1 = new savingsaccount();
        obj.getdata();
        obj.getbalance();
        obj.deposit(2000);
        obj.withdraw(2000);
       
       
    }
   
}
abstract class accountdetails
{
    abstract void getdata();
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
    abstract double getbalance();
}
class currentaccount extends accountdetails
{
    String name;
    int accountnum;
    String email;
    private double amount;
   
    @Override
    void getdata()
    {
    Scanner s = new Scanner(System.in);
    System.out.println("ENTER NAME");
    name = s.next();
    System.out.println("ENTER ACCOUNT NUMBER");
    accountnum = s.nextInt();
    System.out.println("ENTER EMAIL");
    email = s.next();
    }

   
    @Override
    void deposit(int amount)
    {
       System.out.println("AMOUNT"+amount); 
    }
    @Override
    void withdraw(int amount)
    {
        
        System.out.println("AMOUNT"+amount); 
    }
    public double getbalance()
    {
        double balance;
        balance = amount-amount;
        return balance;
    }
    public String toString(String amount, String balance)
    {
        
        return "Name"+name+"Email"+email+"accountnum"+accountnum+"deposit"+amount+"withdraw"+amount+"balance"+balance;
    }
   
}
class savingsaccount extends account{
    String name;
    int accountnum;
    String email;
    void getdata()
    {
    Scanner s = new Scanner(System.in);
    System.out.println("ENTER NAME");
    name = s.next();
    System.out.println("ENTER ACCOUNT NUMBER");
    accountnum = s.nextInt();
    System.out.println("ENTER EMAIL");
    email = s.next();
    }
    double getbalance()
    {
        System.out.println("ENTER BALANCE");
        Scanner s = new Scanner(System.in);
        int balance = s.nextInt();
        return balance;
    }
   
    
    
    void deposit(int amount)
    {
         System.out.println("AMOUNT"+amount); 
    }
   
    void withdraw(int amount)
    {
        
         System.out.println("AMOUNT"+amount); 
    }

    public String toString(String amount, String balance)
    {
        return "Name"+name+"Email"+email+"accountnum"+accountnum+"deposit"+amount+"withdraw"+amount+"balance"+balance;
    }
   
}


