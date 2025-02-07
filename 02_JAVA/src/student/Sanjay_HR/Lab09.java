package student.Sanjay_HR;

import java.util.Arrays;

public class Lab09 {
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //         arr = Sort(arr); ==> {90, 20, 10, 8, 7};
    public static void main(String[] args) {
        int[] numbers={1,4,6,4,3,5};
        sortDescending(numbers);
    }
    public static int[] sortDescending(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length ; j++) {
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
