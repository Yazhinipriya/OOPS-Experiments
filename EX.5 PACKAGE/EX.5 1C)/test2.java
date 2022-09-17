
package pack1;
import pack.*;
    class test2 extends test {
        public static void main(String[] args){
            test2 obj = new test2();
            obj.display();
            try{
                obj.display1();
            }
            catch(Exception e){
                System.out.println("Default property cannot be displayed!");
            }
        }
    
}

    
    
}
