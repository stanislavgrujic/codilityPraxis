package org.codility.timecomplexity;

/**
 * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N +
 * 1)], which means that exactly one element is missing.
 * Your goal is to find that missing element.
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A, returns the value of the missing element.
 * For example, given array A such that:
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 * Assume that:
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input
 * arguments).
 * Elements of input arrays can be modified.
 */
public class PermMissingElemSolution {

    public int solution(int A[]) {
        int min = 2;
        int max = 0;
        long sum = 0;
        final int arrayLength = A.length;
        if (arrayLength == 0) {
            return 1;
        }
        if (arrayLength == 1) {
            return A[0] - 1;
        }
        for (final int element : A) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
            sum += element;
        }

        if (min == 2) {
            return 1;
        }

        long expectedSum = arrayLength * (arrayLength + 1)/ 2;
        return (int) (expectedSum - sum);
    }
}
