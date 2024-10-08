package com.home.practice.challenge_october_december_2024.day_2_0810;

import java.util.ArrayDeque;

/***
 * <a href="https://leetcode.com/problems/baseball-game/description/">...</a>
 *
 */
public class Solution {

  public static void main(String[] args) {
    String[] operations = {"5","2","C","D","+"};
    Solution solution = new Solution();
    System.out.println(solution.calPoints(operations));
  }

  public int calPoints(String[] operations) {
    ArrayDeque<Integer> elements = new ArrayDeque<>();
    int result = 0;
    for (String operation : operations) {
      switch (operation) {
        case "+" -> {
          if (elements.size() >= 2) {
            int top = elements.pop();
            int prev = elements.peek();
            elements.push(top);
            elements.push(top + prev);
          }
        }
        case "D" -> {
          if (!elements.isEmpty()) {
            elements.push(elements.peek() * 2);
          }
        }
        case "C" -> {
          if (!elements.isEmpty()) {
            elements.pop();
          }
        }
        case null, default -> {
          assert operation != null;
          elements.push(Integer.parseInt(operation));
        }
      }
    }
    for (Integer value : elements) {
      result += value;
    }
    return result;
  }
}
