/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapp;

import java.util.*;

/**
 *
 * @author Ing. de Desarrollo
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Integer[] intArray = new Integer[11];
        Integer min = 10;
        Integer max = 30;
        Integer givenNum = (int) (Math.random() * (max - min + 1) - min);

        for (int y = 0; y < intArray.length; y++) {
            Integer x = (int) (Math.random() * (max - min + 1) - min);
            List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
            if (!intList.contains(x)) {
                intArray[y] = x;
            } else {
                x++;
                intArray[y] = x;
            }
        }
        System.out.println("List of Numbers: " + Arrays.toString(intArray));
        System.out.println("Given Number: " + givenNum);
        findPairs(intArray,givenNum);
    }

    static void findPairs(Integer array[], int givenNum) {
        for (Integer array1 : array) {
            for (Integer array2 : array) {
                if (array1 + array2 == givenNum) {
                    System.out.println("- " + array1 + ", " + array2);
                }
            }
        }
    }

    /*static void Ramdom() {
        int x = (int) (Math.random()*(21));
    }*/
}
