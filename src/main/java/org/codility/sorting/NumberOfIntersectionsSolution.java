package org.codility.sorting;

/**
 * Created by stanislavgrujic on 5/11/15.
 */
public class NumberOfIntersectionsSolution {

    public int solution(int[] A) {
        int count = 0;
//        A = Arrays.stream(A).distinct().sorted().toArray();
//
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == 0) {
//                continue;
//            }
//
//            count += A.length - i - 1;
//        }
//
//        if (count > 10000000) {
//            return -1;
//        }

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                final int r0 = A[i];
                final int r1 = A[j];
                if (r0 == r1) {
                    continue;
                }

                if ((Math.pow((r0 - r1), 2) <= Math.pow((i - j), 2)) && (Math.pow((r0 + r1), 2) >= Math.pow((i - j), 2))) {
                    count++;
                }

                if (count > 10000000) {
                    return -1;
                }
            }
        }
        return count;
    }
}
