/**
 * 给定一个整数数组 nums 和一个目标值 target， 请你在该数组中找出和为目标值的那 两个 整数， 并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *//*
class Solution {
    int x, y;
    int[] arr;

    public int[] twoSum(int[] nums, int target) {
        for (int left = 0; left < nums.length - 1; left++) {
            for (int right = left + 1; right < nums.length; right++) {
                Integer a;
                a = target - nums[left];
                if (a.equals(nums[right])) {
                    x = left;
                    y = right;
                    break;
                }
            }
        }
        int[] arr = { x, y };
        return arr;
    }
}*/
