class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        map = Counter(nums)
        #  max_key = max(my_dict, key=my_dict.get)
        return max(map, key=map.get)