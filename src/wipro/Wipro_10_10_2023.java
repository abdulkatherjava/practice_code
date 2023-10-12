package wipro;

import java.util.Scanner;

public class Wipro_10_10_2023 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value");
//        String str = sc.nextLine();
//
//        char chArr[] = str.toCharArray();
//        int count = 1;
//        String result = "";
//        for(int i = 0; i<str.length()-1;i++) {
//            if (str.charAt(i) == str.charAt(i+1) ) {
//                    count++;
//                    continue;
//            } else {
//                    result = result+str.charAt(i)+count;
//                    count = 1;
//            }
//        }
//        result = result+str.charAt(str.length()-1)+count;
//        System.out.println(result);
//    }

    public static void main(String[] args) {

        String input = "aaaaa";
        int count = 0;
        char temp = input.charAt(0);
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==temp)
                count++;
            else
            {
                System.out.print(temp+""+count);
                count = 1;
                temp = input.charAt(i);
            }
        }
        System.out.print(temp+""+count);
    }
}

