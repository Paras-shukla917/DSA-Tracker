package _01_Arrays;

import java.util.*;
public class Q0189_RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[k];

        // Store the last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Shift the remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        // Put the stored elements at the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(nums));

        rotate(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}
