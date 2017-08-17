package org.codility.countingelements;

import java.util.Arrays;

/**
 * Problem Statement
 * 
 * There are N integers in an array A. All but one integer occur in pairs. Your task is to find the number that occurs
 * only once.
 * 
 * Input Format
 * 
 * The first line of the input contains an integer N, indicating the number of integers. The next line contains N
 * space-separated integers that form the array A.
 * 
 * Constraints
 * 
 * 1≤N<100
 * N % 2=1 (N is an odd number)
 * 0≤A[i]≤100,∀i∈[1,N]
 * Output Format
 * 
 * Output S, the number that occurs only once.
 */
public class LonelyInteger {

    public int solution(int[] a) {
        Arrays.sort(a);

        int previous = -1;
        int next = -1;
        for (int i = 0; i < a.length; i++) {
            if (i == 1) {
                previous = a[0];
            } else if (i < a.length - 2) {
                next = a[i + 1];
            }
            int number = a[i];
            if (number == previous || number == next) {
                previous = number;
            } else {
                return number;
            }
        }

        return -1;
    }
}
