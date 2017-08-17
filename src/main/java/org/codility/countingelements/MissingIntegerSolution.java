package org.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a function:

 int solution(int A[], int N);

 that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer that does not occur in A.

 For example, given:

 A[0] = 1
 A[1] = 3
 A[2] = 6
 A[3] = 4
 A[4] = 1
 A[5] = 2
 the function should return 5.

 Assume that:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.
 */
public class MissingIntegerSolution {

    public int solution(int[] A) {
        int min = A[0];
        int max = A[0];

        Set<Integer> existing = new HashSet<>();
        for (int number : A) {
            if (number <= 0) {
                continue;
            }
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            existing.add(number);
        }

        if (max <= 0) {
            return 1;
        }

        if (min <= 0) {
            min = 1;
        }
        for (int i = min; i <= max; i++) {
            if (!existing.contains(i)) {
                return i ;
            }
        }

        return 1;
    }
}
