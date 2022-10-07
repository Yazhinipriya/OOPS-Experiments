package OOPS;
import java.util.Scanner;
public class pigLatin {
    public static void main(String args[])
    {
        int pos=-1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the word:");
        String s1= obj.nextLine();
   
        if(s1.charAt(0)!='y')
        {
        for(int i=0;i<s1.length();i++)
        {
          char ch = s1.charAt(i);         
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')
          {
        
                pos = i;
                break;
          }
        
        }
        }
        else
        {
        for(int i=1;i<s1.length();i++)
        {
          char ch = s1.charAt(i);     
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')
          {
        
                pos = i;
                break;
          }  
        }
        }
    
        if (pos == 0) 
        {
            
            System.out.println("Translated Word to PigLatin is :"+s1+"ay"); 
        } 
        else 
        {
            String a = s1.substring(pos);
            String b = s1.substring(0, pos);
            System.out.println("Translated Word to PigLatin is : "+ a + b + "ay"); 
        }
    }
           
    }
     
        
