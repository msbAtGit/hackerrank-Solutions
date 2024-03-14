package thekataproject;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
 */
class Result {

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here

		// Validation

		if (a == null || b == null) {
			return 0;
		}

		// Assumming both the arrays are sorted.

		int rangeStart = a.get(a.size() - 1);
		int rangeEnd = b.get(0);

		Set<Integer> numList = new HashSet<Integer>();
		Set<Integer> finalList = new HashSet<Integer>();

		for (int i = rangeStart; i <= rangeEnd; i++) {
			if (evenlyDivides(i, a)) {
					numList.add(i);
			}
		}
		
		for(int e:numList) {
			if(evenlyDAllEInArray(b, e)) {
				finalList.add(e);
			}
		}
		
		return finalList.size();
	}

	/**
	 * Check if all the elements in arr divides num;
	 */
	public static boolean evenlyDivides(int num, List<Integer> arr) {

		int count = 0;
		for (int a : arr) {
			if (num % a == 0) {
				count++;
			}
		}

		return count == arr.size();
	}
	
	public static boolean evenlyDAllEInArray(List<Integer> b, int num) {
		
		int count = 0; 
		
		for(int e: b) {
			if (e%num == 0) {
				count++;
			}
		}
		
		return count == b.size();
	}

}

public class BetweenTwoSets {
	public static void main(String[] args) throws IOException {
       
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> brr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(4);
        brr.add(16);
        brr.add(32);
        brr.add(96);

        int total = Result.getTotalX(arr, brr);

        System.out.println(total);
        }
}
