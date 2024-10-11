class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++; //last digit of the array will be incremented by 1
                return digits; //and loop breaks here
            }
            else{
                digits[i] = 0; //if last digit was 9, it will now be 0
            }
        }
        digits = new int[digits.length + 1]; //and we'll increase the size of array
        digits[0] = 1; //then add a 1 at 0th index, because 9 + 1 = 10
        return digits;
    }
}