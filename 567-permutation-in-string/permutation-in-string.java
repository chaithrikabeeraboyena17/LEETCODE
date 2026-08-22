class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] count = new int[26];

        for (char c : s1.toCharArray())
            count[c - 'a']++;

        int left = 0;
        int matches = 0;

        for (int right = 0; right < s2.length(); right++) {

            int r = s2.charAt(right) - 'a';

            if (count[r] > 0)
                matches++;

            count[r]--;

            if (right - left + 1 > s1.length()) {

                int l = s2.charAt(left) - 'a';

                count[l]++;

                if (count[l] > 0)
                    matches--;

                left++;
            }

            if (matches == s1.length())
                return true;
        }

        return false;
    }
}