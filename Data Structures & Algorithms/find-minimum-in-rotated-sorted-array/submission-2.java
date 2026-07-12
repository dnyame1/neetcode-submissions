class Solution {
    public int findMin(int[] nums) {
int min = nums[0];

for (int i = 0; i < nums.length - 1; i += 2) {
    int prev = nums[i];
    min = Math.min(min, prev);
    min = Math.min(min, nums[i + 1]);
}

if (nums.length % 2 != 0) {
    min = Math.min(min, nums[nums.length - 1]);
}

return min;
}
}
