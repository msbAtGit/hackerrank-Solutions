package thekataproject.hackerrank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
 */
class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    
    // Checking validation here
    if (t < s) {
        return;
    }
    // Initializing counters
    
    int appleCount = 0;
    int orangeCount = 0;
    
    // For each of the d value in apple 
    
    for (int dApple: apples) {
        
        // check if the a + d is greater than or equal to s
        boolean aPlusDS = (a + dApple) >= s;
        
        // and less than equal to t
        boolean aPlusLT = (a + dApple) <= t;   
        
        if(aPlusDS && aPlusLT) {
            appleCount++;
        }
    }
    
    // For each of the d value in orange
    
    for (int dOranges: oranges) {
        
        // check if b + dOranges  >= S
        boolean aPlusDS =  (b + dOranges) >= s;
        
        // Check if b + dOranges <= t
        boolean bdOrgT = (b + dOranges) <= t;
        
        if (aPlusDS && bdOrgT) {
            orangeCount++;
        }
        
    }
    //Print Apple Counts
    System.out.println(appleCount);
    
    //Printing Orange Counts
    
    System.out.println(orangeCount);   
    

    }

}


public class ApplesAndOranges {
	
	public static void main(String[] args) {
		int s = 7;
		int t = 10;
		int a = 4;
		int b = 12;
		List<Integer> apples = new ArrayList<Integer>(); 
		apples.add(2);
		apples.add(3);
		apples.add(-4);
		
		
		List<Integer> oranges = new ArrayList<Integer>(); 
		oranges.add(3);
		oranges.add(-2);
		oranges.add(-4);
		
		Result.countApplesAndOranges(s, t, a, b, apples, oranges);
	}
	
}
