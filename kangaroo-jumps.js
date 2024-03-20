/* Problem from https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 * CODE Not working for 63 8 94 3
 */

function kangaroo(x1, v1, x2, v2) {
  // Write your code here
  while (x1 != x2 ) {
      // No condition
      if(x2 > x1 && v2 > v1) {
          return "NO";
      }

      if(x1 > x2 && v1 > v2) {
          return "NO";
      }

      if(x1 != x2 && v1 == v2) {
         return "NO";
      }
      // First check if the Kangaroo can ever catch up

      // The below solution is correct but its not efficient.
      // while (x1 != x2) {
      //     x1 = x1 + v1;
      //     x2 = x2 + v2
      // }
      // if(x1 == x2) {
      //     return "YES";
      // }
      // else {
      //     return "NO";
      // }

      let r1 = x1 + v1;

      let r2 = x2 + v2;

      if(r1 % r2 == 0 || r2 %r1 == 0) {
          return "YES";
      }
      else {
          x1 = x1 + v1;
          x2 = x2 + v2;
      }

  }

  return "YES";

}
console.log(kangaroo(43,2,70,2));
