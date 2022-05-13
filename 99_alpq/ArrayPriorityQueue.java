// Ruawatrain :: Benjamin Belotser, David Deng, Josiah Moltz
// APCS pd6
// HW99 --  Some Are More Equal Than Others, Codified
// 2022-05-13
// time spent:

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {
  ArrayList<Integer> _queue;

  public ArrayPriorityQueue() // constructor
  {
    _queue = new ArrayList<Integer>();
  }

  public boolean isEmpty()
  {
    return _queue.size() == 0;
  }

  public Integer peekMin()
  {
    return _queue.get(0);
  }

  public Integer removeMin()
  {
    return _queue.remove(0);
  }

  public void add(Integer x)
  {
    if (isEmpty()) {
      _queue.add(x);
      return;
    }
    else {
      int i = _queue.size()-1;
      while (_queue.get(i) < x && i > 0) {
        i--;
      }
      _queue.add(i, x);
      return;
    }
  }

  public String toString() {
    return "" + _queue;
  }

  public static void main(String[] args) {
    ArrayPriorityQueue ruawatrain = new ArrayPriorityQueue();
    System.out.println(ruawatrain.isEmpty());
    ruawatrain.add(42);
    ruawatrain.add(91);
    ruawatrain.add(11111);
    ruawatrain.add(3);
    ruawatrain.add(2);
    ruawatrain.add(5);
    System.out.println(ruawatrain);
  }
}
