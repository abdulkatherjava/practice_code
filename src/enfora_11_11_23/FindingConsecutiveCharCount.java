package enfora_11_11_23;

/**
 * Find the Consecutive Identical Characters Count in the String Using Java
 * input: "aabaabcab"
 * output: a2b1a2c1a1b1
 */

public class FindingConsecutiveCharCount {

    public static void main(String[] args) {
        String str = "aabaabcab";
        findIdenticalCharacters(str);
    }

    private static void findIdenticalCharacters(String str) {
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        System.out.println(sb);
    }


}
