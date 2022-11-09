package generics1;
import java.util.*;
public class GenericFunction 
{
    public static void main(String[]args)
    {
        Integer a[]={2,5,6,9};
        String s []={"world","ant","zebra"};
        Double d[]={22.21,34.15,67.33};
        findmax obj=new findmax();
        obj.max(a); 
        obj.max(s); 
        obj.max(d); 
    }
}
class findmax
  {
    <T extends Comparable <T>> void max (T[] a)
     {
        T max;
        max=a[0];
        for(int i=1;i<a.length;i++)
         {
           if(max.compareTo(a[i])<0)
          {
             max=a[i];
          }
         }
     System.out.println("The maximum number in the array "+ max);
    }
  }

