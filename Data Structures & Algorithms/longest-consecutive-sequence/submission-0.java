class Solution {
    public int longestConsecutive(int[] nums) {
             HashSet<Integer> numSet = new HashSet<>();
        
        // Step 1: Add all numbers to the set
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Step 2: Iterate through the numbers
        for (int num : numSet) {
            // Step 3: Check if it's the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Step 4: Count the length of the sequence
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Step 5: Update the maximum length
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak; // Return the length of the longest consecutive sequence
    }
        
    }

