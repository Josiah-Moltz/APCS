import java.util.LinkedList;
public class LLStack<PANCAKE> implements Stack<PANCAKE> {
  LinkedList<PANCAKE> _stack = new LinkedList();

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty() {
    return _stack.size() == 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop() {
    return _stack.getLast();
  }

  //Pop and return top element of stack.
  public PANCAKE pop() {
    return isEmpty() ? null : _stack.removeLast();
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ) {
    _stack.addLast(x);
  }

}
