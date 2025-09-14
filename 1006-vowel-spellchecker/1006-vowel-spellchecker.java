class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactMatch = new HashSet<>();
        Map<String, String> caseInsensitive = new HashMap<>();
        Map<String, String> vowelError = new HashMap<>();

        for (String word : wordlist) {
            exactMatch.add(word);

            String lower = word.toLowerCase();
            caseInsensitive.putIfAbsent(lower, word);

            String masked = maskVowels(lower);
            vowelError.putIfAbsent(masked, word);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];

            if (exactMatch.contains(query)) {
                result[i] = query;
            } else {
                String lowerQuery = query.toLowerCase();
                if (caseInsensitive.containsKey(lowerQuery)) {
                    result[i] = caseInsensitive.get(lowerQuery);
                } else {
                    String maskedQuery = maskVowels(lowerQuery);
                    result[i] = vowelError.getOrDefault(maskedQuery, "");
                }
            }
        }

        return result;
    }

    private static String maskVowels(String word) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (vowels.contains(c)) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
}