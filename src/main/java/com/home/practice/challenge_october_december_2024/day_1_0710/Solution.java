package com.home.practice.challenge_october_december_2024.day_1_0710;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

  /***
   * Validate Parentheses
   * You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
   * The input string s is valid if and only if:
   * 1. Every open bracket is closed by the same type of close bracket.
   * 2. Open brackets are closed in the correct order.
   * 3. Every close bracket has a corresponding open bracket of the same type.
   * Return true if s is a valid string, and false otherwise.
   ***/
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    HashMap<Character, Character> dic = new HashMap<>();
    dic.put(')', '(');
    dic.put('}', '{');
    dic.put(']', '[');

    for (char c : s.toCharArray()) {
      if (dic.containsKey(c)) {
        char element = stack.isEmpty() ? ' ' : stack.pop();
        if (element != dic.get(c)) {
          return false;
        }
      } else {
        stack.push(c);
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.isValid("]")); //false
    System.out.println(solution.isValid("[]")); //true
    System.out.println(solution.isValid("([{}])")); //true
    System.out.println(solution.isValid("[(])")); //false
  }

}
