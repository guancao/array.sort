package arraywork;

/**
 * find the duplicates in an array {1,2,4,5,4,6,7}
 */
public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,4,5,4,6,7};

        for (int i=0; i<nums.length; i++){
            for (int j=1; j<nums.length; j++){
                if((i!= j) && nums[i] == nums[j]) {
                    System.out.printf("nums[%d] and nums[%d] are duplicates.\n", i, j);
                }
            }
        }
    }


}
