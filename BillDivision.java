import java.util.ArrayList;
import java.util.List;

/**
 * Solution for the hackerrank problem
 * https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
 */
public class BillDivision {
  public static void main(String[] args) {

    List<Integer> bill = new ArrayList<Integer>();
    bill.add(3);
    bill.add(10);
    bill.add(2);
    bill.add(9);

    bonAppetit(bill, 1, 12);
  }

  /*
   * Complete the 'bonAppetit' function below.
   *
   * The function accepts following parameters:
   * 1. INTEGER_ARRAY bill
   * 2. INTEGER k
   * 3. INTEGER b
   */

  public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here

    int bActual = 0;

    int actualSum = 0;

    for (int i = 0; i < bill.size(); i++) {
      if (k == i) {
        continue;
      } else {
        actualSum += bill.get(i);
      }
    }

    bActual = actualSum / 2;

    if (b == bActual) {
      System.out.print("Bon Appetit");
    } else {
      System.out.print(b - bActual);
    }
  }
}
