package _01_Arrays;

import java.util.*;

class Q1752_CheckSortedRotated {

    public static boolean check(int[] nums) {

        int k = 0;
        int n = nums.length;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[(i + 1) % n]) {
                k++;
            }
        }

        return k <= 1;
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};

        boolean ans = check(nums);

        System.out.println(ans);
    }
}
