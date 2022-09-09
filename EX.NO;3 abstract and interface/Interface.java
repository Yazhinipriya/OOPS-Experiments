package OOPS;
public class Interface {
        public static void main(String[] args){
             Rectangle r[]=new Rectangle [5];
             r[0]=new Rectangle(4.0,5.6);
             r[1]=new Rectangle(8.2,7.6);
             r[2]=new Rectangle(6.5,5.9);
             r[3]=new Rectangle(1.2,8.4);
             r[4]=new Rectangle(4.0,5.6);
             for(int i=0;i<r.length;i++)
             {
               System.out.println("RECTANGLE " +i);    
               System.out.println(r[i].area());  
               System.out.println(r[i].perimeter());  
             }
             r[0].compare(r[1]);     
            r[1].compare(r[2]);    
            r[2].compare(r[3]);    
            r[3].compare(r[4]);    
            r[4].compare(r[5]);      
        }
        
    }
    interface CompareShapes{
        double area();
        double perimeter(); 
        int compare(Rectangle rectangle);
    }

     class Rectangle implements CompareShapes
    {
         double l;
         double b;
         Rectangle(double l,double b){
             this.l=l;
             this.b=b;
         }
     @Override
     public double area()
     {
         System.out.println("Area:");
         return l*b;
     }
     @Override
     public double perimeter()
     {
         System.out.println("Perimeter:");
         return 2*(l+b); 
     }
     @Override
     public int compare(Rectangle rectangle)
     {
        
          if(this.area() > rectangle.area())
          {
             System.out.println(this.area()); 
          }
          else if (this.area()<rectangle.area())
          {
             System.out.println(rectangle.area()); 
          }
         return 1;
     }
}

    

