class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] freq = new int[nums.length][2];
        int count = 0;
        int distinct = 0;
        for (int i = 0; i < nums.length; i++) {
            count++;
            if (i + 1 == nums.length || nums[i] != nums[i + 1]) {
                freq[distinct][0] = nums[i];
                freq[distinct][1] = count;
                distinct++;
                count = 0;
            }
        }
        Arrays.sort(freq, 0, distinct, (a, b) -> b[1] - a[1]);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = freq[i][0];
        }
        return result;
    }
}