
package OOPS.converter;
import java.util.Scanner;
public class currencyconverter {
    double inr;
    double dollar;
    double euro;
    double yen;
    public void dollartoinr()
    {
      Scanner obj=new Scanner(System.in);
      System.out.println("Dollar:");
      dollar=obj.nextDouble();
      inr=dollar*79.65;
      System.out.println("Indian rupee:"+inr);
     }  
    public void eurotoinr()
    {
      Scanner obj1=new Scanner(System.in);
      System.out.println("Euro:");
      euro=obj1.nextDouble();
      inr=euro*79.65;
      System.out.println("Indian rupee"+inr);
     }  
    public void yentoinr()
    {
      Scanner obj2=new Scanner(System.in);
      System.out.println("Yen:");
      yen=obj2.nextDouble();
      inr=yen/0.55;
      System.out.println("Indian rupee:"+inr);
     }  
     public void inrtodollar()
    {
      Scanner obj3=new Scanner(System.in);
      System.out.println("Indian rupee:");
      inr=obj3.nextDouble();
      dollar=inr/79.65;
      System.out.println("Dollar:"+dollar);
     }
    public void inrtoeuro()
    {
      Scanner obj4=new Scanner(System.in);
      System.out.println("Indian rupee:");
      inr=obj4.nextDouble();
      euro=inr/79.65;
      System.out.println("Euro:"+euro);
     }  
    public void inrtoyen()
    {
      Scanner obj5=new Scanner(System.in);
      System.out.println("Indian rupee:");
      inr=obj5.nextDouble();
      yen=inr*0.55;
      System.out.println("Yen:"+yen);
     }  
}
