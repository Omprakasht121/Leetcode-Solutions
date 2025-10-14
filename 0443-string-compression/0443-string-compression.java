class Solution {
    public int compress(char[] chars) {
         int write = 0;  // position to write compressed chars
        int i = 0;      // position to read chars
        
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            
            // count occurrences of currentChar
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            
            // write the character
            chars[write++] = currentChar;
            
            // write the count (if > 1)
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        
        return write; // new length
    }
}