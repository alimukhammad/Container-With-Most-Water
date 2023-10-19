class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;           // Initialize the left pointer at the start.
        int right = height.length - 1; // Initialize the right pointer at the end.

        while (left < right) { // Continue as long as the left pointer is less than the right pointer.
            // Calculate the width between the two lines (indices).
            int width = right - left;
            
            // Calculate the minimum height of the two lines.
            int h = Math.min(height[left], height[right]);

            // Calculate the current water volume.
            int currentWater = width * h;

            // Update maxWater if the currentWater is greater.
            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer that points to the shorter line.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxWater;
    }
}
