class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < length + 1; i++) {
            sum = sum + i;
        }
        for (int i = 0; i < length; i++) {
            sum1 = sum1 + nums[i];
        }
        return sum - sum1;
    }
}