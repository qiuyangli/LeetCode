class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l = len(nums)
        ll = l + 1
        suml = 0
        sumll = 0
        for x in nums:
            suml = suml + x
        for y in range(ll):
            sumll = sumll + y
        res = sumll - suml
        return res