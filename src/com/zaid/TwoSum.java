//https://leetcode.com/problems/two-sum/
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.

//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

package com.zaid;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int target=6;
        int[]index=new int[2];
        for (int i = 0; i < nums.length ; i++) {
            for (int k = nums.length-1; k >i ; k--) {
                if(nums[i]+nums[k]==target)
                {
                    index[0]=i;
                    index[1]=k;
                }
            }

          }
        System.out.println(Arrays.toString(index));

    }
}
