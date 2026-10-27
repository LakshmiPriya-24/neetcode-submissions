class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int res = 0;
        HashSet<Character> chr = new HashSet<>();
        for(int r = 0; r<s.length();r++){
            while(chr.contains(s.charAt(r))){
                chr.remove(s.charAt(l));
                l++;
            }
            chr.add(s.charAt(r));
            res = Math.max(res, r-l+1);

        }
        return res;
        
    }
}
