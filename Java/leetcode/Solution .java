/**
 * ����һ���������� nums ��һ��Ŀ��ֵ target�� �����ڸ��������ҳ���ΪĿ��ֵ���� ���� ������ ���������ǵ������±ꡣ
 * ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
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
