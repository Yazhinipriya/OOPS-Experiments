
package inheritance1;
public class Inheritance1{
    public static void main(String[] args) {
        MovablePoint obj=new MovablePoint(8.0f,9.0f,8.9f,7.8f);
        System.out.println(obj.getx());
        obj.setx(4.5f);
        System.out.println(obj.gety());
        obj.sety(6.7f);
        obj.setxy(6.65f,7.87f);
        obj.getxy();
        System.out.println("MOVABLEPOINT");
        System.out.println(obj.getxspeed());
        obj.setxspeed(8.5f);
        System.out.println(obj.getyspeed());
        obj.setyspeed(9.7f);
        obj.setspeed(6.6f,7.8f);
        obj.getspeed();
        System.out.println(obj.toString());
        obj.move();
    }
}
    
    class Point
    {
        float x;
        float y;
        Point(float x,float y)
        {
           this.x=x;
           this.y=y;
            
        }
        float getx()
        {
            return x;
        }
        void setx(float x)
        {
            this.x=x;
        }
        float gety()
        {
            return y;
        }
         void sety(float y)
        {
            this.y=y;
        }
         void setxy(float x,float y)
        {
            this.x=x;
            this.y=y;
        } 
         void getxy()
         {
             float a[]=new float[2];
             a[0]=x;
             a[1]=y;
             System.out.println("The values are:");
             for(int i=0;i<2;i++)
             {
             System.out.println(a[i]);
             }
             
         }
        @Override
         public String toString()
       {
 
        return "("+x+","+y+")";
        }
    }

   
    class MovablePoint extends Point
    {
        float xspeed=0.0f;
        float yspeed=0.0f;
        MovablePoint(float x,float y,float xspeed,float yspeed)
        {
            super(x,y);
            this.xspeed=xspeed;
            this.yspeed=yspeed;
            
        }
        MovablePoint(float xspeed, float yspeed)
        {
            System.out.println("The values are"+x+" "+y);
            
        }
        float getxspeed()
        {
            return xspeed;
        }
        void setxspeed(float xspeed)
        {
            xspeed=10;
        }
        float getyspeed()
        {
            return yspeed;
        }
        void setyspeed(float yspeed)
        {
            yspeed=20;
        }   
        void setspeed(float xspeed,float yspeed)
        {
            this.xspeed=xspeed;
            this.yspeed=yspeed;
        }
        void getspeed()
         {
             float a[]=new float[2];
             a[0]=xspeed;
             a[1]=yspeed;
             System.out.println("The values are:");
             for(int i=0;i<a.length;i++)  
             System.out.println(a[i]);   
         
         }
        
         @Override
         public String toString()
         {
        return "("+x+","+y+")"+","+"speed"+"="+"("+xspeed+","+yspeed+")";
       }
       float move()
       {
            System.out.println(x+=xspeed);
            System.out.println(y+=yspeed);
            return 0;
       }
    }
    
       
    
    


    


