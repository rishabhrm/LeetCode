class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0; //initializing with 0, because if none found it will be 0
        for (int i = 0; i < nums.length; i++){ //transverse the array
            xor = xor ^ nums[i]; //only the number that appears once won't return 0
        }
        return xor;
    }
}