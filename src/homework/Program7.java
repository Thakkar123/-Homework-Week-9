package homework;

import java.util.ArrayList;

//7. Write a Java program to test an array list is empty or not. Define array list with underground tube names
public class Program7 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("\nIs arraylist empty: "+list.isEmpty());
        list.add("Morden");
        list.add("South Wimbeldon");
        list.add("Colliers Wood");
        list.add("Balham");
        list.add("Victoria");
        list.add("Green Park");
        list.add("Green Park");
        list.add("Warren Street");
        list.add("Euston");
        list.add("King's Cross St. Pancras");
        System.out.println("\nIs arraylist empty: "+list.isEmpty());
        System.out.println("\nElements of the list: "+list);
    }
}
