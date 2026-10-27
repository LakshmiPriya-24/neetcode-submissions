class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9]; // tracks numbers 1-9 for rows
        boolean[][] cols = new boolean[9][9]; // tracks numbers 1-9 for columns
        boolean[][] boxes = new boolean[9][9]; // tracks numbers 1-9 for boxes

        // Traverse the board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                // Only process the number if it's not a dot (empty cell)
                if (num != '.') {
                    int n = num - '1'; // Convert char to index (0-8)
                    int boxIndex = (i / 3) * 3 + (j / 3); // Calculate box index

                    // Check if the number has already been seen in the respective row, column, or box
                    if (rows[i][n] || cols[j][n] || boxes[boxIndex][n]) {
                        return false; // Invalid if already seen
                    }

                    // Mark the number as seen
                    rows[i][n] = true;
                    cols[j][n] = true;
                    boxes[boxIndex][n] = true;
                }
            }
        }

        return true; // If all checks passed, the board is valid
    }
    }

