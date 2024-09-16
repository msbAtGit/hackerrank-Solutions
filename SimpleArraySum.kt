/*
Solution for simple array sum problem
https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
fun simpleArraySum(ar: Array<Int>): Int {
    // Write your code here
    var sum:Int = 0;
    for(x in ar) {
        sum = sum.plus(x);
    }
    return sum;
}
fun main() {
    val arr:Array<Int> = arrayOf(1, 2, 3, 4, 5);
    println(simpleArraySum(arr));
}
