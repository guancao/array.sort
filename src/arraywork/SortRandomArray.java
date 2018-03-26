package arraywork;

import java.util.Random;

public class SortRandomArray {
    public static void main(String[] args) {
        int count =10;
        int[] numbers = new int[count];
        //generate integer arrays with random numbers
        Random random = new Random();
        System.out.println("The array generated is:: ");
        for (int i=0; i<numbers.length; i++){
            numbers[i]=random.nextInt(100)-50;  //generate positive and negative numbers
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();

        //sort from largest to smallest
        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length-1; j++){
                if (numbers[j]<numbers[j+1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("The sorted array is :: ");
        for (int k=0; k<numbers.length;k++) {
            System.out.print(numbers[k]+ " ");
        }
        System.out.println();

        System.out.println("The minumum of the array is:: "+numbers[numbers.length-1]);
        System.out.println("The maximum number of the array is :: "+ numbers[0]);


        //call the sorting method in SortArray to sort
        System.out.println("-----------------Now sort with class 'SortArray'-----------------");
        SortArray sorting = new SortArray();
        sorting.sorting(numbers);
    }


}
