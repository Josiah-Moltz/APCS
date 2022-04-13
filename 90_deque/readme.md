## PLAN!!!
* int 	size() 	
  Returns the number of elements in this deque.
* boolean 	add​(E e) 	
  Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
* void 	addFirst​(E e) 	
  Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
* void 	addLast​(E e) 	
  Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
* E 	remove() 	
  Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
* E 	removeFirst() 	
  Retrieves and removes the first element of this deque.
* E 	removeLast() 	
  Retrieves and removes the last element of this deque.
* E 	element() 	
  Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).
* E 	getFirst() 	
  Retrieves, but does not remove, the first element of this deque.
* E 	getLast() 	
  Retrieves, but does not remove, the last element of this deque.
* E 	peek() 	
  Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
* E 	peekFirst() 	
  Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
* E 	peekLast() 	
  Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
* E 	poll() 	
  Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
* E 	pollFirst() 	
  Retrieves and removes the first element of this deque, or returns null if this deque is empty.
* E 	pollLast() 	
  Retrieves and removes the last element of this deque, or returns null if this deque is empty.
* boolean offer​(E e) 	
  Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available.
* boolean 	offerFirst​(E e) 	
  Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
* boolean 	offerLast​(E e) 	
  Inserts the specified element at the end of this deque unless it would violate capacity restrictions.
* E 	pop() 	
  Pops an element from the stack represented by this deque.
* void 	push​(E e)
  Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
* boolean 	remove​(Object o)  SEEMS ANNOYING 	
  Removes the first occurrence of the specified element from this deque.
* boolean 	removeFirstOccurrence​(Object o) 	
  Removes the first occurrence of the specified element from this deque.
* boolean 	removeLastOccurrence​(Object o)  SEEMS HARD
  Removes the last occurrence of the specified element from this deque.
* boolean 	contains​(Object o)  SEEMS HARDish
  Returns true if this deque contains the specified element.
* Iterator<E> 	descendingIterator() SEEMS HARD
  Returns an iterator over the elements in this deque in reverse sequential order.
* Iterator<E> 	iterator() SEEMS HARD
  Returns an iterator over the elements in this deque in proper sequence.
* boolean 	addAll​(Collection<? extends E> c) SEEMS HARDish
  Adds all of the elements in the specified collection at the end of this deque, as if by calling addLast(E) on each one, in the order that they are returned by the collection's iterator.
