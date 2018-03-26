package arraywork;

/**
 * sort a fixed integer array, find out the minimum and maximum numbers in the array
 */
public class TestSortArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 7, 9, 10, 6};

        //sort from largest to smallest
        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers.length-1; j++){
                if (numbers[j]<numbers[j+1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
//           for (int m=0; m<numbers.length;m++) System.out.print(numbers[m]+" ");
        }
        System.out.println();
        for (int k=0; k<numbers.length;k++) {
            System.out.print("The sorted array is :: "+ numbers[k]+ " ");
        }
        System.out.println();
        System.out.println("The minumum of the array is:: "+numbers[numbers.length-1]);
        System.out.println("The maximum number of the array is :: "+ numbers[0]);
    }
}
