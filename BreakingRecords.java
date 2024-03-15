package thekataproject.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
 */
public class BreakingRecords {
	
	/*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        List<Integer> records = new ArrayList<Integer>();
        if (scores == null || scores.size() == 0) {
            return records;
        }
        
        int maxScore = scores.get(0);
        int minScore = scores.get(0);
        
        int maxTimes = 0;
        int minTimes = 0;
        
        for (int score: scores) {
            if(maxScore < score) {
                maxScore = score;
                maxTimes++;
            }
            
            if(minScore > score) {
                minScore = score;
                minTimes++;
            }
        }
        
        records.add(maxTimes);
        records.add(minTimes);
        return records;
        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,4,21,36 ,10,28,35,5,24 ,42};
		
		List<Integer> arrList = new ArrayList<Integer>();
		
		for (int e: arr) {
			arrList.add(e);
		}
		
		System.out.println(breakingRecords(arrList));

	}

}
