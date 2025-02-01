package math;

/**
 * LeetCode Problem #70: Climbing Stairs.
 * Link: <a href="https://leetcode.com/problems/climbing-stairs/">...</a>
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n <= 2)
            return n;

        int first = 1;
        int second = 2;

        for (int i = 3; i < n; i++){
            int third = first + second;
            first = second;
            second = third;
        }

        return second;

    }
}
