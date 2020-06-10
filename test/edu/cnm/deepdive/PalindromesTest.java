package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromesTest {
  static final String[] knownPalindromes = {
      "radar",
      "abba",
      "x",
      ""
  };

  static final String[] knownNonPalindromes = {
      "sonar",
      "abb"
  };

  @Test
  void testRecursive() {
    for (String kp: knownPalindromes) {
      assertTrue(Palindromes.testRecursive(kp));
    }

    for (String knp: knownNonPalindromes) {
      assertFalse(Palindromes.testRecursive(knp));
    }

  }

}
@Test
  void testDenormalized(String kp) {
    for (String kp: knownPalindromes) {
      assertTrue(Palindromes.testRecursive(kp));