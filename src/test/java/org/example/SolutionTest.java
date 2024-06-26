package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void combinationSumTest() {
        Solution solution = new Solution();
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(2, 2, 3));
        output.add(Arrays.asList(7));
        Assert.assertEquals(output, solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
        output = new ArrayList<>();
        output.add(Arrays.asList(2, 2, 2, 2));
        output.add(Arrays.asList(2, 3, 3));
        output.add(Arrays.asList(3, 5));
        Assert.assertEquals(output, solution.combinationSum(new int[]{2, 3, 5}, 8));
        output = new ArrayList<>();
        Assert.assertEquals(output, solution.combinationSum(new int[]{2}, 1));

    }

}