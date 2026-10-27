class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    // Check if the matrix is empty
        if (matrix.length == 0) return false;

        // Iterate through each row of the matrix
        for (int[] row : matrix) {
            // Iterate through each element in the row
            for (int num : row) {
                // If the target is found, return true
                if (num == target) {
                    return true;
                }
            }
        }
        // If the target is not found, return false
        return false;
    }

        
    }

