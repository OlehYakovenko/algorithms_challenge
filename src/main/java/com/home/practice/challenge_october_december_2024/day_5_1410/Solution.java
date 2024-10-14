package com.home.practice.challenge_october_december_2024.day_5_1410;

import java.util.ArrayDeque;

public class Solution {
  public static String makeGood(String s) {
    ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
    char[] symbols = s.toCharArray();
    for (char symbol : symbols) {
      if(!arrayDeque.isEmpty() && Math.abs(arrayDeque.peek() - symbol) == 32){
          arrayDeque.pop();
      } else {
        arrayDeque.push(symbol);
      }
    }
    StringBuilder result = new StringBuilder();
    while (!arrayDeque.isEmpty()){
      result.append(arrayDeque.removeLast());
    }
    return result.toString();
  }

}
