package com.javalesson.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLancher {

    private static Scanner vvodckonsoli = new Scanner(System.in);

    public static void main(String[] args) {
        //  int [] myArray =  {0,100,200,300,400,500};
        int[] myArray = new int[8];
        System.out.println("Пожалуйста введите 8 элементов массива");

        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Следующие элементы");
            myArray[j] = vvodckonsoli.nextInt();

        }

        //   System.out.println("Элемент 4 = " + myArray[4]);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Элемент #" + i + " = " + myArray[i]);
        }
    }

    private static int[] sort(int[] array) {
//        int [] myNewArray = new int [array.length]; / копирование массива примитивный
//        for (int i = 0; i < array.length; i++){
//            myNewArray[i] = array[i];
//        }
        //      int [] myNewArray = Arrays.copyOf(array, array.length);/копирование массива


    }
}
