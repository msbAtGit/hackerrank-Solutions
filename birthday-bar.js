/*
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

function birthday(s, d, m) {
    // Write your code here
    
    // Validation
    // Empty array
    if(s.length == 0) {
        return 0;
    }
        

   // This a sliding window problem
   
   // count for number of instances
   let count = 0;
   // we need start at i = 0 and i < s.length - m
   
   for(let i = 0; i <= (s.length - m); i++) {
    let sum = 0;
   
    // then start j = i, j upto i +m increment j++
    for (let j = i; j <= (i + m) - 1; j++) {
        sum += s[j];   
    } 

    
    // check if the sum is equals the d
    
    if(sum == d) {
        count++;
    }
    
    // if not move the next window
   }
   
   return count;

}
s = [2,2,1,3,2];
d = 4;
m = 2;
console.log(birthday(s, d, m));