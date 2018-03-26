package arraywork;

/**
 * SortArray -- a class to be called to sort integer and double arrays
 * find out the minimum and maximum numbers
 * find out if any duplicates in the array
 */
public class SortArray {
    private int limit;
    private int[] numbers = new int[limit];

    public SortArray(){}

    public SortArray(int[] numbers){
        this.numbers = numbers;
        setLimit(numbers);
    }

    public void setLimit(int[] numbers){
        this.limit = numbers.length;
    }

    //sort integer array
    public void sorting(int[] numbers) {
        //sort from largest to smallest
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("The sorted array is :: ");
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();

        System.out.println("The minumum of the array is:: " + numbers[numbers.length - 1]);
        System.out.println("The maximum number of the array is :: " + numbers[0]);

    }

    //sort double array
     public void sorting(double[] numbers) {
        //sort from largest to smallest
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    double temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("The sorted array is :: ");
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();

        System.out.println("The minumum of the array is:: " + numbers[numbers.length - 1]);
        System.out.println("The maximum number of the array is :: " + numbers[0]);

    }
    //find out duplicates in integer array
    public void findDuplicatesInArray (int[] nums) {
        boolean noDuplicates = true;
        for (int i=0; i<nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((i != j) && nums[i] == nums[j]) {
                    System.out.printf("nums[%d] and nums[%d] are duplicates.\n", i, j);
                    noDuplicates = false;
                }
            }
        }
        if(noDuplicates) System.out.println("No duplicates in this array.");
    }
    //find out duplicates in double array
    public void findDuplicatesInArray (double[] doubles) {
        boolean noDuplicates = true;
        for (int i=0; i<doubles.length; i++) {
            for (int j = 1; j < doubles.length; j++) {
                if ((i != j) && doubles[i] == doubles[j]) {
                    System.out.printf("doubles[%d] and doubles[%d] are duplicates.\n", i, j);
                    noDuplicates = false;
                }
            }
        }
        if(noDuplicates) System.out.println("No duplicates in this array.");
    }

}
