package _01_Arrays;

import java.util.*;

public class Q283_MoveZeroes {

    // Q. No. 283 - Move Zeroes

    public static void moveZeroes(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Original Array: " + Arrays.toString(nums));

        moveZeroes(nums);

        System.out.println("After Moving Zeroes: " + Arrays.toString(nums));
    }
}
