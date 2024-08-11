
package com.problemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
* Your task is to write a function that takes two integers n and m,
* and returns a sorted array of all integers from n to m inclusive,
* which have exactly 3 divisors (excluding 1 and the number itself).

Example:
solution(2, 20) -> [16]
16 has 3 divisors: 2, 4, 8 (1 and 16 aren't included)

Input:
n - integer (2 ≤ n ≤ 10^14)
m - integer (2 ≤ m ≤ 10^18)
NOTE: In Rust, the bounds are (2 ≤ n ≤ 2^51), (20 ≤ m ≤ 2^52).

Output:
result - array of integers*/

// loop through n.m
// check if it has a divisor --> 3 max
    //
// if found push to array

public class ProblemSolvingInterview {
    public static void main(String[] args) {
        int n = 2;
        int m = 50;
        List<Integer> result = executeDivisor(n, m);
        System.out.println(result);
    }

    public static List<Integer> executeDivisor(int n, int m){
        //2,20
       List<Integer> result = new ArrayList<>();
        for(int i = n; i <= m; i++){
            int count = countDivisor(i);
          if(count == 3){
              result.add(i);
          }

        }
        Collections.sort(result);
        //System.out.println(result.getClass().getName());
        return result;
    }

    private static int countDivisor(int num) {
        int count = 0;
        for (long i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;  // i is a divisor
            }
            if(count > 3){
                return count;
            }
        }
return count;
    }
}
