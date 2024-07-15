package enfora_11_11_23;

public class Practice {
    public static void main(String[] args) {
        String s = "asddfaavve";
        int len = s.length();
        int count = 1;
        for (int i = 0; i < len-1; i++){

            if (s.charAt(i) == s.charAt(i+1)){
                count++;
            } else {
                System.out.print(s.charAt(i)+""+count);
                count=1;
            }

        }
        System.out.print(s.charAt(s.length()-1)+""+count);
    }
}
