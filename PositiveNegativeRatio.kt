/*
Solution for https://www.hackerrank.com/challenges/plus-minus/problem
 */
fun main() {
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1));
}


fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var numOfPts: Double = 0.0;
    var numOfNgs: Double = 0.0;
    var numOfZeros: Double = 0.0;
    for (x in arr) {
        if (x > 0) {
            numOfPts = numOfPts.inc()
        } else if (x < 0) {
            numOfNgs = numOfNgs.inc();
        } else {
            numOfZeros = numOfZeros.inc();

        }
    }
    println(numOfPts / arr.size.toDouble());
    println(numOfNgs / arr.size.toDouble());
    println(numOfZeros / arr.size.toDouble());

}