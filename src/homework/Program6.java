package homework;

import java.util.ArrayList;

//6. Write a Java program to retrieve an element (at a specified index) from a given array list
public class Program6 {

    public static void main(String[] args) {

        ArrayList<String> colours = new ArrayList<>();

        colours.add("Grey");
        colours.add("Maroon");
        colours.add("Black");
        colours.add("Purple");
        colours.add("Orange");
        colours.add("Red");
        colours.add("Blue");
        colours.add("White");
        colours.add("Yellow");
        System.out.println(colours);
        System.out.println("Second Element\t: "+colours.get(2));
        System.out.println("Fifth Element\t: "+colours.get(5));

    }
}