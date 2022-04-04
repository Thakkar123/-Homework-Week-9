package homework;

import java.util.Arrays;

//3. Write a Java program to reverse an array of integer values
public class Program3 {


    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = new int[array1.length];
        int j = 0;

        for (int i = 0; i < array1.length; i++) {
            array2[0 + j] = array1[array1.length - 1 - i];
            j++;
        }
        System.out.println("Array in reversed is " + Arrays.toString(array2));
    }

}

