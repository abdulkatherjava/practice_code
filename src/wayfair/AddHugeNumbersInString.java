package wayfair;

/**
 * Addition of large number in String
 */
public class AddHugeNumbersInString {
    public static void main(String[] args) {
        try {
            String str1 = "24";
            String str2 = "19";

            StringBuffer buffer = new StringBuffer();
            int carryValue = 0;
            int j = str1.length() - 1;
            int k = str2.length() - 1;

            while (j >= 0 || k >= 0 || carryValue > 0) {
                //for (int a = j-1, b = k-1; a>= 0 || b >= 0 || carryValue > 0; a--, b--) {
                int temp1 = j >= 0 ? Integer.parseInt(String.valueOf(str1.charAt(j))) : 0;
                int temp2 = k >= 0 ? Integer.parseInt(String.valueOf(str2.charAt(k))) : 0;
                int val = temp1 + temp2 + carryValue;
                if (val > 9) {
                    buffer.append(val % 10);
                    carryValue = val / 10;
                } else {
                    buffer.append(val);
                    carryValue = 0;
                }
                j--;
                k--;

            }
          System.out.println(buffer.reverse());

        } catch (NumberFormatException e) {
            System.out.println("Wrong Input");
        } catch (Exception e) {
            System.out.println("Error in the code" + e);
        }

    }
}
