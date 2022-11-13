package collec;
import java.util.*;
public class list {
    public static void main(String[] args) {
        String[] StrArray = {"flowers", "cup", "pens", "van"};
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("ARRAY LIST");
        for (String string : StrArray) {
	list.add(string);
	}    
      System.out.println("DISPLAY ALL THE WORDS"); 
              System.out.println(list);    
      
      
      System.out.println("DISPLAY THE PLURAL WORDS"); 
      for(int i=0;i<list.size();i++)
      { 
          if(list.get(i).endsWith("s"))
          {
               String newValue = list.get(i).toUpperCase();
            list.set(i, newValue);
        }
      }
        System.out.println(list);
  
        
      System.out.println("DISPLAY IN REVERSE ORDER"); 
      Collections.reverse(list);    
      System.out.println(list);
      
      
      System.out.println("DISPLAY WITH ALL PLURAL WORDS REMOVED"); 
      for(int i=0;i<list.size();i++)
       {
            if(list.get(i).endsWith("S"))
            {
                list.remove(i);      
            }
       }
            System.out.println(list);
           
       }    
      }
    
     
    
       
    



