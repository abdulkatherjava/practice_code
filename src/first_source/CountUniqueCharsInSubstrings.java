package first_source;

public class CountUniqueCharsInSubstrings {
    public static int countUniqueChars(String s) {
        int[] count = new int[26];
        int uniqueCount = 0;
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (count[c - 'A'] == 0) {
                uniqueCount++;
            }
            count[c - 'A']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int[] tempCount = new int[26];
            int tempUniqueCount = 0;
            
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (tempCount[c - 'A'] == 0) {
                    tempUniqueCount++;
                }
                tempCount[c - 'A']++;
                
                result += tempUniqueCount;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String s1 = "ABC";
        System.out.println(countUniqueChars(s1)); // Output: 10
        
        String s2 = "ABA";
        System.out.println(countUniqueChars(s2)); // Output: 8
    }
}
