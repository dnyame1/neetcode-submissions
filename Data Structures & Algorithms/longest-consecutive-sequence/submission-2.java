class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int result = 1;
        int longest = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int prev = nums[i];
            int curr = nums[i + 1];
            if (curr == prev + 1) {
                result++;
                longest = Math.max(longest, result);
            } else if (curr != prev) {
                result = 1;
            }
        }
        return longest;
    }
}

