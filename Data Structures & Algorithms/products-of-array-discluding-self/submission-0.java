class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Compute the products of elements to the left of each index
        result[0] = 1; // No elements to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1]; // Product of all elements to the left
        }
        
        // Step 2: Compute the products of elements to the right of each index
        int rightProduct = 1; // Initialize the right product to 1
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct; // Multiply with the right product
            rightProduct *= nums[i];    // Update the right product for the next iteration
        }
        
        return result; // Return the final result array
    }
}