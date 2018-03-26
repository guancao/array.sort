package arraywork;

public class TestSorting {
    public static void main(String[] args) {
        int [] nums = {1, 5, 54, 9, 34, 0, 5};
        SortArray newSort = new SortArray();
        newSort.sorting(nums);
        newSort.findDuplicatesInArray(nums);

        double[] doubles = {18.3, 20, 5.5, 9.2,  -1.3, 8.3, 45.2, 23.6};
        newSort.sorting(doubles);
        newSort.findDuplicatesInArray(doubles);

    }


}
