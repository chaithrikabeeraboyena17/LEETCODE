class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        return sb.toString().equals(sb.reverse().toString());
    }
}