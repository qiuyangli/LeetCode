class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        l = len(nums)
        for x in range(l):
            for y in range(l):
                if x != y:
                    if nums[x] + nums[y] == target:
                        return x, y