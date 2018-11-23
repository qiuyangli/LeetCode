class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0;i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i])+ 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int count;
        if (nums.length % 2 == 0){
            count = nums.length / 2;
        } else {
            count = nums.length / 2 + 1;
        }
        for (int i = 0; i< nums.length; i++) {
            if (map.get(nums[i]) >= count) {
                return nums[i];
            }
        }
        return 0;
    }
}