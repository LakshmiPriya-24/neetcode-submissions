class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length; // Get the length of the heights array
        int res = 0; // To store the maximum area found
        int l = 0; // Left pointer
        int r = n - 1; // Right pointer
        
        while (l < r) {
            // Calculate the area with the current left and right pointers
            int area = (r - l) * Math.min(heights[l], heights[r]);
            res = Math.max(res, area); // Update the result if the current area is larger
            
            // Move the pointer corresponding to the shorter bar
            if (heights[l] < heights[r]) {
                l++; // Move left pointer to the right
            } else {
                r--; // Move right pointer to the left
            }
        }
        
        return res; // Return the maximum area found
    }
}
