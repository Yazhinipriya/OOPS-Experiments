package OOPS;
import java.util.Scanner;
//TestScore.java
public class TestScore 
{
    public static void main(String args[])
    {
        Scanner mark=new Scanner(System.in);
        int StudentId[]={01,02,03,04,05};
        int scores[]=new int[5];
        int score=0;
        for(int i=0;i<StudentId.length;i++)
        {
            try
            {
             System.out.println("ENTER A NUMERIC TEST SCORE FOR THE STUDENT "+(i+1)+"of ID "+StudentId[i]+":");
             score=mark.nextInt();
             if(score<0||score>100)
             {
                 scores[i]=0;
                 throw new ScoreException("Input should be between 1 and 100");
             }
             else
             {
                 scores[i]=score;
             }
            }
            catch(ScoreException e)
            {
              System.out.println("\n"+e.getMessage()+"\n");
            }
        }
        System.out.println("\n\nStudent ID\t Score");
        System.out.println("********************************************");
        for(int i=0;i<StudentId.length;i++)
        {
            System.out.println(StudentId[i]+"\t\t"+scores[i]);
        }
    }
}
//ScoreException.java
class ScoreException extends Exception
{
    ScoreException(String msg)
    {
        super(msg);
    }
}



    

