/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class;

/**
 *
 * @author 21cse069
 */
public class Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author obj= new Author("AAA","AAA@gmail.com",'f');
        Author obj1= new Author("BBB","BBB@gmail.com",'f'); 
        System.out.println(obj.getname());
        System.out.println(obj.getEmail());
        System.out.println(obj.getGender()); 
        System.out.println(obj1.toString());
       
        
    }
    
}
class Author
{
    String name;
    String email;
    char gender;
    
    Author(String s,String e,char g1)
    {
        name=s;
        email=e;
        gender=g1;
    }
   
   String getname()
    {
        return name;
    }
    String getEmail()
    {
       return email;
    }
    char getGender()
    {
        return gender;
    }
    @Override
    public String toString()
    {
 
        return "Name->"+name+" " +"Email->"+email+" "+"Gender->"+gender;
}
    }
