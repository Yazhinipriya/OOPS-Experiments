package oops;

import java.util.*;

public class genericClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        Integer a[] = new Integer[n + 1];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        array<Integer> obj = new array<>(a);
        obj.display();
        System.out.println("Enter the element to be inserted:");
        int b = s.nextInt();
        obj.insert(b);
        System.out.println("Enter the element to be deleted:");
        int c = s.nextInt();
        obj.delete(c);

    }
}

class array<T> {

    T[] value;
    int temp;

    array(T[] value) {
        this.value = value;

    }

    void display() {
        System.out.println("The elements are:");
        for (int i = 0; i < value.length - 1; i++) {
            System.out.println(value[i]);
        }
    }

    void insert(T n) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the position to be inserted:");
        int pos = s.nextInt();
        for (int i = value.length - 2; i >= pos - 1; i--) {

            value[i + 1] = value[i];

        }
        value[pos - 1] = n;
        System.out.println("The elements are:");
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }

    void delete(T n) {

        int pos;
        for (int i = 0; i <= value.length-1; i++) {
            if (value[i] == n) {
                pos = i;
                for (int j = pos; j < value.length-1; j++) {
                    value[j] = value[j + 1];
                }

            }

        }

        System.out.println("The elements are:");
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }

}
