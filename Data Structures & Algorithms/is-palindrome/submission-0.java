class Solution {
    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters and spaces, and convert to lowercase
        String result = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase(); 
        
        // Reverse the processed string
        String reversed = new StringBuilder(result).reverse().toString(); 
        
        // Compare the cleaned string with its reversed version
        return result.equals(reversed); 
    }
}
