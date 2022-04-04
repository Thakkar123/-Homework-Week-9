package homework;
//Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.

import java.util.ArrayList;

public class Program4 {

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

        for (String s : colours)
        {
            System.out.println(s);
        }
    }
}



