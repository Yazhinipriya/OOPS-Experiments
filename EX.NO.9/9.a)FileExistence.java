package OOPS;
import java.io.*;
import java.util.*;
public class checkingFileExistence 
{
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName=s.nextLine();
        File file = new File(fileName);    
        String a= FilenameUtils.getExtension(file);
System.out.println(a);
        if (file.exists()) 
        {
            System.out.println("File exists!");
        }
        else
        {
            System.out.println("No file found!");
        } 
        if(file.canRead())
        {
           System.out.println("File "+fileName+" can be read");
        }
        else
        {
           System.out.println("File "+fileName+" cannot be read");
        }
        if(file.canWrite())
        {
           System.out.println("File "+fileName+" can be read");
        }
        else
        {
           System.out.println("File "+fileName+" cannot be read");
        }
        
    }
}
        
        
    

      
