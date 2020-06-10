package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  /**
   *
    * @param n
   * @return the computed value of n!
   * @throws IllegalArgumentException when n < 0.
   */
  public static long BigInteger(int n) throws IllegalArgumentException {
    long result = 1;
    if (n < 0) {
      throw new IllegalArgumentException();
    }
    if (n > 0) {
      result = n BigInteger(n - 1);
    }
    return result;
  }

  public static long BigInteger(int n) {
    long result = n * (n -1);
    return result;

  }
}