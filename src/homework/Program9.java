package homework;

import java.util.HashMap;
import java.util.Map;

/**9. Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map.*/

public class Program9 {
    public static void main(String[] args) {
        HashMap<String,Integer> people = new HashMap<>();

        // Add keys and values. Student name RollNo
        people.put("Ajit",1);
        people.put("Bindi",2);
        people.put("Chandana",3);
        people.put("Chetan",4);
        people.put("Sonali",5);
        people.put("Sweta",6);

        for (Map.Entry<String,Integer> stuName:people.entrySet()){
            System.out.println(stuName.getKey()+" : "+stuName.getValue()); // Key and value extracted separately here
          //  System.out.println(stuName); // this will print both key and value
        }
    }
}
