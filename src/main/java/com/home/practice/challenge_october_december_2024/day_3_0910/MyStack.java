package com.home.practice.challenge_october_december_2024.day_3_0910;

import java.util.LinkedList;

public class MyStack {

  LinkedList<Integer> queue;

  public MyStack() {
    queue = new LinkedList<>();
  }

  public void push(int x) {
    queue.push(x);
  }

  public int pop() {
    return queue.pop();
  }

  public int top() {
    return queue.peek();
  }

  public boolean empty() {
    return queue.isEmpty();
  }
}
