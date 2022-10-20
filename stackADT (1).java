package OOPS;
import java.util.Scanner;
public class stackADT {
    public static void main(String args[])
    {
    createStack cs = new createStack ();
    Stack t1=new Stack(cs);
    t1.start();
    }
}
   
class createStack 
{
    int top=-1;
    int[] stack=new int[5];
    synchronized void create(int n)
    {
        if(top==stack.length)
        {
          System.out.print("Stack is full!");
        }
        else
        {
        stack[++top]=n;
        }
    try
    {
        Thread.sleep(500);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    synchronized int pop() 
    {
      
            System.out.println("The element deleted is " + stack[top]);        
    try
    {
        Thread.sleep(500);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    return stack[--top];
    }
    synchronized void display()
    {
        for(int i=0; i <=top; i++) {
            System.out.println("\t"+stack[i]);
        }
    try
    {
        Thread.sleep(500);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
    synchronized void peek()
    {
            System.out.println("The topmost element in the stack is "+stack[top]);
    try
    {
        Thread.sleep(500);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}   

class Stack extends Thread
{
   createStack c; 
   Stack(createStack c)
   {
       this.c=c;
   }
    public void run()
    { 
        c.create(1); //Creates the stack
        c.create(2);
        c.create(3);
        c.create(4);
        c.create(5);
        System.out.println("Stack created successfully!");
        c.display(); //Displays the stack
        c.pop(); // Deletes the last inserted element
        c.display();
        c.peek();
        c.create(8);//This displays that the stack is full
        c.display(); //Displays the stack
        
    }
}

