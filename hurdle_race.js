
/**
 * Solution for https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true
 * /
/*
 * Complete the 'hurdleRace' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY height
 */

function hurdleRace(k, height) {
    // Write your code here
    let invalid_value = 0;
    
    /**
     * Validation code
     */
    if (k<1) {
        return invalid_value;
    }
    
    if(height === null) {
        return invalid_value;
    }
   
    let max = height[0];
    for(let i = 1; i < height.length; i++) {
        if( max < height[i]) {
            max = height[i];
        }
    }
    
    if(max - k <= 0) {
        return 0;
    }
    else {
        return max - k;
    }

}

console.log(hurdleRace(4,[1,6,3,5,2] ));