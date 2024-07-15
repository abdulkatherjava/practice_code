package leetcode;

public class MinimumNumberOfGlasses {

    static int solution(int N, int K) {
        int ans = 0;
        for (int i = N; K > 0 && i > 0; i--) {
            System.out.println("i:"+i+" k:"+K);
            if (i <= K) {
                ans++;
                K -= i;
            }
        }
        return K == 0 ? ans : -1;
    }

    public static void main(String[] args) {
	    System.out.println(solution(5, 8)); // 2
//	    System.out.println(solution(4, 10)); // 4
//	    System.out.println(solution(1, 8)); // -1
//	    System.out.println(solution(10, 5)); // 1
	    // N 1..1,000,000
    }

}