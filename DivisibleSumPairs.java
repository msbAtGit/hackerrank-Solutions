package thekataproject.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Solution for the for the hackerrank problem 
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true
 * 
 */
public class DivisibleSumPairs {

	/*
	 * Complete the 'divisibleSumPairs' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER k 3. INTEGER_ARRAY ar
	 */

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		// Write your code here

		if (ar == null || ar.size() < n) {
			return 0;
		}
		// Initialize the count variable
		int count = 0;

		// Iterate nested loop way and find the divisibility of the number

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {

				if (((ar.get(i) + ar.get(j)) % k) == 0) {
					count++;
				}
			}
		}

		return count;

	}
	
	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<Integer> ();
		ar.add(1);
		ar.add(3);
		ar.add(2);
		ar.add(6);
		ar.add(1);
		ar.add(2);
		System.out.println(divisibleSumPairs(6,3, ar));
	}

}
