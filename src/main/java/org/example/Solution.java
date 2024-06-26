package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] can, int target) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> temp = new ArrayList();
        helper(can, 0, result, target, 0, temp);
        return result;
    }

    public void helper(int[] can, int index, List<List<Integer>> result, int target, int sum,
                       List<Integer> temp) {
        if (sum == target) {
            result.add(new ArrayList(temp));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < can.length; i++) {
            sum += can[i];
            temp.add(can[i]);
            helper(can, i, result, target, sum, temp);
            temp.remove(temp.size() - 1);
            sum-= can[i];
        }
    }
}
