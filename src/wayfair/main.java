package wayfair;

import java.util.stream.IntStream;

class AddHugeNumbersInString1 {
    public static void main(String[] args) {
        String number1Str = "43534534523465235463984576983457698347598639845769834569837569856893745698";
        String number2Str = "8765782436587236485726587348752837457823456782364875263485762837456872345687234";

        String result = addHugeNumbers(number1Str, number2Str);

        System.out.println("Sum: " + result);
    }

    public static String addHugeNumbers(String num1, String num2)  {
        return null;
    }

    public static String padWithZeros(String str, int length) {
        return String.format("%" + length + "s", str).replace(' ', '0');
    }
}
