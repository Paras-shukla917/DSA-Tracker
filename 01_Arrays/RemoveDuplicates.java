import java.util.*;

class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int i = 1;

        for(int j = 0; j < n - 1; j++) {
            if(nums[j + 1] != nums[j]) {
                nums[i++] = nums[j + 1];
            }
        }

        return i;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}