class Solution {
    public String[] findWords(String[] words) {
                String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            
            // Determine which row the first letter belongs to
            String row;
            if (row1.indexOf(lowerWord.charAt(0)) != -1) {
                row = row1;
            } else if (row2.indexOf(lowerWord.charAt(0)) != -1) {
                row = row2;
            } else {
                row = row3;
            }
            
            // Check if all characters belong to the same row
            boolean valid = true;
            for (char c : lowerWord.toCharArray()) {
                if (row.indexOf(c) == -1) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);

    }
}