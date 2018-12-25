class Solution(object):
    def searchInsert(self, nums, target):
        position = 0
        if target in nums:
            position = nums.index(target)
        else:
            for x in nums:
                if target > x:
                    position = position + 1
        return position