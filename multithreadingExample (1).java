package OOPS;
import java.util.Random;
public class multithreadingExample {
    public static void main (String args[])
    {
      randomNumber r =new randomNumber();
      r.start();
     
    }
}
    class randomNumber extends Thread
    {
       public void run()
       {
       try
       {
           Thread.sleep(500);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       Random obj=new Random();
       int randomNum=obj.nextInt(100); 
       System.out.println("Random number:" +randomNum);
       evenRandom er=new evenRandom(randomNum);
       er.start();   
       oddRandom or=new oddRandom(randomNum);
       or.start();  
       }
       
    }
    class evenRandom extends Thread
    {
        int x;
        evenRandom(int n)
                {
                   x=n;
                }
        
        public void run()
        {
        if(x%2==0)
            {
              System.out.println("Random number:"  +x);
              System.out.println("Square of the number:" +x*x);
            }
        }
    }
    class oddRandom extends Thread
    {
        int x;
        oddRandom(int n)
                {
                   x=n;
                }
        public void run()
        {
            if(x%2!=0)
            {
                System.out.println("Random number:"  +x);
                System.out.println("Cube of the number:" +x*x*x);
             }
          
        }
    }
    

        
        
     

