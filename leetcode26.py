nums = [0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4]

i = 0
j = 1
while j < len(nums):
    if nums[i] == nums[j]:
        nums.remove(nums[j])
    else:
        i = i + 1
        j = j + 1
print(len(nums))
