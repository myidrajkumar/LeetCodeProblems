package com.rajkumar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumProblemTest {

    @Test
    void testGetIndicesWhoseValueSumIsTargetNaiveWhenAvailable() {
        int[] input = { 2, 7, 11, 15 };
        int target = 9;

        int[] indicesWhoseValueSumIsTarget = TwoSumProblem.getIndicesWhoseValueSumIsTargetNaive(input, target);

        Assertions.assertArrayEquals(new int[] { 0, 1 }, indicesWhoseValueSumIsTarget, "Indices do not match"); //NOSONAR
    }
    
    @Test
    void testGetIndicesWhoseValueSumIsTargetNaiveWhenNone() {
        int[] input = { 2, 7, 11, 15 };
        int target = 8;

        int[] indicesWhoseValueSumIsTarget = TwoSumProblem.getIndicesWhoseValueSumIsTargetNaive(input, target);

        Assertions.assertArrayEquals(new int[] {  }, indicesWhoseValueSumIsTarget, "Indices do not match"); //NOSONAR
    }
    
    @Test
    void testGetIndicesWhoseValueSumIsTargetOptimisedWhenAvailable() {
        int[] input = { 2, 7, 11, 15 };
        int target = 9;

        int[] indicesWhoseValueSumIsTarget = TwoSumProblem.getIndicesWhoseValueSumIsTargetOptimised(input, target);

        Assertions.assertArrayEquals(new int[] { 0, 1 }, indicesWhoseValueSumIsTarget, "Indices do not match"); //NOSONAR
    }
    
    @Test
    void testGetIndicesWhoseValueSumIsTargetOptimisedWhenNone() {
        int[] input = { 2, 7, 11, 15 };
        int target = 8;

        int[] indicesWhoseValueSumIsTarget = TwoSumProblem.getIndicesWhoseValueSumIsTargetOptimised(input, target);

        Assertions.assertArrayEquals(new int[] {  }, indicesWhoseValueSumIsTarget, "Indices do not match"); //NOSONAR
    }
}
