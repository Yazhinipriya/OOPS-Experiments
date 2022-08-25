/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill;
import java.util.Scanner;
public class Bill {
    public static void main(String[] args) {
     ebbill obj[]=new ebbill[2];
    for(int i=0;i<2;i++)
    {
        obj[i]=new ebbill();
        obj[i].getdata();
        
        
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
double bill_amount;

void getdata()
{
int i;
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
    if("DOMESTIC".equals(type))
    {
        if(unit==100)
        {
            double billamount = (double)unit*2;
            {
            System.out.println("BILL AMOUNT IS"+billamount);
        }
        if(unit>100)    
                    {
    }
    
    
        
        
    
}
    }}}




