package homework;
//5. Write a Java program to iterate through all elements in an array list using Iterator

import java.util.ArrayList;
import java.util.Iterator;

public class Program5 {

    public static void main(String[] args) {

        ArrayList<Integer> array=new ArrayList<Integer>();

        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.add(70);
        array.add(80);
        array.add(90);
        array.add(100);
        System.out.println("ArrayList "+array);

        Iterator<Integer> iterate= array.iterator();
        System.out.println("Iterating over ArrayList");
        while(iterate.hasNext()){
            System.out.print(iterate.next()+ ",");
        }
    }
}
