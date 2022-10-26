package OOPS;
import java.io.*;
public class fileHandling {
    public static void main(String args[]) throws FileNotFoundException 
    {
        int wordCount=0;
        int lineCount=0;
        int charCount=0;
       try
       {
       FileInputStream fi=new FileInputStream("D:\\abc.txt");
       int read=0;
       while((read=fi.read())!=-1)
       {
           System.out.print((char)read);
           if((char)read >='a'&& (char)read<='z' || (char)read >='A'&& (char)read<='Z' )
           {
           charCount++;
           }
           if((char)read=='.')
           {
           lineCount++;    
           }
           if((char)read==' ')
           {
            wordCount++;
           }
         
       }
       
       System.out.println("\nThe number of characters in the text file are:"+charCount); 
       System.out.println("\nThe number of lines in the text file are "+lineCount);
       System.out.println("\nThe number of words in the text file are "+wordCount);
    }
       
       catch(Exception e)
        {
            System.out.println(e);  
        }
    
}
}
