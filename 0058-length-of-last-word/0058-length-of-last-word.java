class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim(); //remove spaces
        int count = 0; //counter
        for (int i = s.length() - 1; i >= 0; i--) { //loop starts from backward
            if (s.charAt(i) == ' ') { //loop breaks once a space is encountered
                break;
            }
            count++; //keeps a count of letters before the space
        }
        return count;
    }
}