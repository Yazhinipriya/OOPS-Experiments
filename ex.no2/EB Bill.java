package bill;
import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
     ebbill obj[]=new ebbill[10];
    for(int i=0;i<10;i++)
    {
        obj[i]=new ebbill();
        obj[i].getdata();    
        obj[i].calculate();
    }    
    }            
}
class ebbill
{
int consumerno;
String consumer_name;
double prev_read;
double curr_read;
String type;


void getdata()
{
Scanner obj=new Scanner(System.in);
System.out.println("ENTER DETAILS");
System.out.println("ENTER CONSUMER NUMBER");
consumerno=obj.nextInt();
System.out.println("ENTER CONSUMER NAME");
consumer_name=obj.next();
System.out.println("ENTER PREVIOUS MONTH READING");
prev_read=obj.nextDouble();
System.out.println("ENTER CURRENT MONTH READING");
curr_read=obj.nextDouble();
System.out.println("ENTER TYPE");
type=obj.next();
}
void calculate()
{
    double unit=curr_read-prev_read; 
    System.out.println("UNITS CONSUMED = "+unit);
    double amount;
    if(type.equals("domestic"))
    {
        if(unit==100)
        {
         amount=unit*2;            
            System.out.println("BILL AMOUNT IS "+amount);
        }        
        else if(unit>100&&unit<=200)    
        {  
         amount =(100*2)+(unit-100)*3.50;
          System.out.println("BILL AMOUNT IS "+amount);                     
       }
        else if(unit>200&&unit<=500)    
        {  
         amount =(100*2)+(100)*3.50+(unit-200)*5;
          System.out.println("BILL AMOUNT IS "+amount);                     
       }
        else     
        {  
         amount =(100*2)+(100)*3.50+(300)*5+(unit-500)*6;
          System.out.println("BILL AMOUNT IS "+amount);                     
       }
    }
     else
     {
         if(unit==100)
        {
         amount=unit*3;            
            System.out.println("BILL AMOUNT IS "+amount);
        }        
        else if(unit>100&&unit<=200)    
        {  
         amount =(100*3)+(unit-100)*5.50;
          System.out.println("BILL AMOUNT IS "+amount);                     
       }
        else if(unit>200&&unit<=500)    
        {  
         amount = (100*3)+(100)*5.50+(unit-200)*7;
          System.out.println("BILL AMOUNT IS "+amount);                     
       }
        else     
        {  
         amount = (100*3)+(100)*5.50+(300)*7+(unit-500)*8;
          System.out.println("BILL AMOUNT IS "+amount);                     
       }
     }
}
}
        
        
        
    
    
        
        
    

   

