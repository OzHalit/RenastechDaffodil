package student.Ulzana;

import java.util.Arrays;

public class lab08 {

    public static void main(String[] args) {

        int [] arr = {8, 10, 3, 7, 80,99};
        System.out.println(Arrays.toString(numbers(arr)));
    }

    //(Array) Sort Ascending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex:    int[] arr = {10, 9, 8, 7};      ==>{ 7, 8, 9, 10};

    public static int [] numbers(int [] numbers){
        int number = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {

                    number = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = number;   } } }

        return numbers;}




}
