package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        bond[]obj = new bond[6];
        obj[0]=new bond();
        obj[1]=new convertiblebond();
        obj[2]=new bond();
        obj[3]= new convertiblebond();
        obj[4]=new bond();
        obj[5]= new convertiblebond();
       
        for(int i=0;i<obj.length;i++)
        {
            obj[i].display();
        }
    }
}
class bond
{
    public void display()
    {
        System.out.println("bond");
    }
}
class convertiblebond extends bond
{
    @Override
    public void display()
    {
        System.out.println("convertiblebond");
    }
}
