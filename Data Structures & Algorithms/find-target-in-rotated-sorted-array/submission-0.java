class Solution {
    int result = -1;
    boolean isThere = true;
    public int search(int[] nums, int target) {
        for (int i = 0; i< nums.length; i++){
            if (nums [i] == target){
                result = i;
            } else {
                isThere = false;
            }
        }
        return result;
    }
}
