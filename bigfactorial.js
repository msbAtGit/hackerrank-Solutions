/**
 * Solution for https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true
 * @param {number} n integer value to calculate factorial.
 */
function extraLongFactorials(n) {
  // Write your code here
  let f = BigInt(1);
  for(let i = BigInt(1);i <= n; i++) {
      f = f * i;
  }
  console.log(f.toString());
}

extraLongFactorials(25);
