package Teksystem_14_02_24;

public class Practice2 {

    public static void main(String[] args) {
        int[] arr = {1,4,6,7,3,8};
        int target = 9;

        int len = arr.length;
        for (int i=0; i<len;i++){
            for (int j=0;j<len;j++){
                if (arr[i]+arr[j] == target){
                    System.out.println(arr[i]+"-"+arr[j]);
                }
            }
        }

    }

}
