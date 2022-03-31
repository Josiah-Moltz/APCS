import java.util.ArrayList;
public class ALStack<PANCAKE> implements Stack<PANCAKE> {
  ArrayList<PANCAKE> _stack = new ArrayList();

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty() {
    return _stack.size() == 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop() {
    return isEmpty() ? null : _stack.get( _stack.size() - 1 );  // David magic
  }

  //Pop and return top element of stack.
  public PANCAKE pop() {
    if (isEmpty()) {
      return null;
    }
    return _stack.remove( _stack.size() - 1 );
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ) {
    _stack.add( x );
  }

  
}
