class Solution {
    public int mySqrt(int x) {
        if (x == 1 || x ==0) {
            return x;
        }

        int start = 1;
        int end = x;
        int mid = -1;

        while (start <= end) {

            mid = (start + end) / 2; //Find Mid

            // if ((mid * mid) > x) {
            if ((x / mid) < mid) {
                end = mid - 1; // If square of mid is greater, move left
            }

            // else if (mid * mid == x) {
            else if (x / mid == mid) {
                return mid; //Root is found
            }

            else{
                start = mid + 1; // If square of mid is smaller, move right
            }
        }
        return end;
    }
}