import java.util.HashSet;

public class Solution {

    public static int solution(int[] A) {
        int num = 1;
        HashSet<Integer> hset = new HashSet<Integer>();

        for (int i = 0 ; i < A.length; i++) {
            hset.add(A[i]);
        }

        while (hset.contains(num)) {
            num++;
        }

        return num;
    }
}
