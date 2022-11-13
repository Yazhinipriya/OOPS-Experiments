package collect;
import java.util.*;
import java.util.Comparator;
public class student implements Comparator<student>{
    public String name;
    public int price;
    public int quantity;
    public student(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int compare(student a, student b) {
        return b.name.compareTo(a.name);
    }
    public static void main(String[] args) {
        ArrayList<student> students  = new ArrayList<student>();
        students.add(new student("REKHA", 16, 8));
         students.add(new student("ANU", 1, 9));
         students.add(new student("BANU", 2, 8));
         students.add(new student("PRIYA", 13, 10));
         students.add(new student("DIVYA", 4, 10));
         students.add(new student("RAM", 14, 9));
         students.add(new student("YOGI", 20, 7));
         students.add(new student("GOPI", 8, 6));
         students.add(new student("RAVI", 15, 7));
         students.add(new student("UDHAY", 19, 10));
         students.add(new student("SATHYA", 17, 8));
         students.add(new student("NITHYA", 11, 10));
         students.add(new student("DHARSHINI", 3, 6));
         students.add(new student("EVA", 5, 6));
         students.add(new student("FEMINA", 6, 7));
         students.add(new student("SELVI", 18, 5));
         students.add(new student("GEETHA", 7, 8));
         students.add(new student("HEMA", 9, 7));
         students.add(new student("MANOJ", 10, 10));
         students.add(new student("PAVI", 12, 6));
        Collections.sort( students, new student("", 0, 0));
        for (student details :  students) {
            System.out.println(details.name + " " + details.price + " " + details.quantity);
        }
    }
}
