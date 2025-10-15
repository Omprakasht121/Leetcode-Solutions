class Solution {
    public int countSegments(String s) {
         // Trim spaces and check if the string is empty
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }

        // Split the string by one or more spaces
        String[] segments = s.trim().split("\\s+");

        // Return the number of segments
        return segments.length;
    }
}