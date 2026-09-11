class Solution {
    public int totalNumbers(int[] digits) {

        int[] freq = new int[10];

        // Count frequency of each digit
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Choose units digit
        for (int i = 0; i <= 8; i += 2) {

            if (freq[i] == 0)
                continue;

            freq[i]--;

            // Choose hundreds digit
            for (int j = 1; j <= 9; j++) {

                if (freq[j] == 0)
                    continue;

                freq[j]--;

                // Choose tens digit
                for (int k = 0; k <= 9; k++) {

                    if (freq[k] > 0)
                        count++;
                }

                freq[j]++;
            }

            freq[i]++;
        }

        return count;
    }
}