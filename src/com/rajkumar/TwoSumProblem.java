package com.rajkumar;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Problem:</b> Given an array of integers, return indices of the 2 numbers
 * who add up to the target.<br />
 * <b>Note: </b>
 * <ul>
 * <li>Could be assumed that only one exact solution</li>
 * <li>Should not use same element twice</li>
 * </ul>
 * 
 * @author Rajkumar. S
 *
 */
public class TwoSumProblem {
    
    private TwoSumProblem() {
    }

    public static int[] getIndicesWhoseValueSumIsTargetNaive(int[] input, int target) {

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }
    
    public static int[] getIndicesWhoseValueSumIsTargetOptimised(int[] input, int target) {

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int complement = target - input[i];
            if (numMap.get(complement) != null) {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(input[i], i);
        }
        return new int[0];
    }
}
