/*
* Partial solution for https://www.hackerrank.com/challenges/sherlock-and-valid-string/
* Still 4 test cases failing.
 * Complete the 'isValid' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

function isValid(s) {
  // Write your code here
  let countMap = new Map();
  let numberOfDoubleCounts = 0;
  let largestCount = 1;
  let sumofCounts = 0;

  for (let i in s) {

      if(isNaN(countMap.get(s[i]))) {
          countMap.set(s[i], 1) ;
      }
      else {
          let count = countMap.get(s[i]);
          count++;
          countMap.set(s[i], count);
      }
  }

  // logging concatenated keys and values
  countMap.forEach((value, key) => {
      sumofCounts += value;
})

  if(sumofCounts % countMap.size == 0 || sumofCounts % countMap.size == 1 || (sumofCounts + 1) % countMap.size == 0) {
      return "YES";
  }
  else {
      return "NO";
  }

}


console.log(isValid('aabbcd'));
console.log(isValid('aabbccddeefghi'));
console.log(isValid('abcdefghhgfedecba'));
