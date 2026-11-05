import java.util.Arrays;

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // Step 1: Sort arr2 to enable Binary Search
        Arrays.sort(arr2);
        int distanceValue = 0;
        
        // Step 2: Check each element in arr1
        for (int val : arr1) {
            // Check if any element in arr2 falls in the range [val - d, val + d]
            if (isValid(arr2, val - d, val + d)) {
                distanceValue++;
            }
        }
        
        return distanceValue;
    }
    
    // Helper function to check if NO element in arr2 falls within [lower, upper]
    private boolean isValid(int[] arr2, int lower, int upper) {
        int left = 0;
        int right = arr2.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // If an element is found inside the forbidden range, this value is invalid
            if (arr2[mid] >= lower && arr2[mid] <= upper) {
                return false; 
            }
            
            if (arr2[mid] < lower) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // No matching elements found in the forbidden range
        return true; 
    }
}
