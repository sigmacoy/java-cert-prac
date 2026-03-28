// doubly linked list

// LinkedList implements both List and Deque (doubly-linked list)

// List Methods
// .add(element) - adds at end
// .add(index, element) - adds at specific position
// .addAll(collection) - adds all at end
// .addAll(index, collection) - adds all at specific position
// .get(index) - returns element at index
// .set(index, element) - replaces at index, returns old
// .remove(index) - removes at index, returns element
// .remove(element) - removes first occurrence, returns true/false
// .indexOf(element) - returns first index, -1 if not found
// .lastIndexOf(element) - returns last index, -1 if not found

// Deque Methods (Queue/Stack operations)
// .addFirst(element) - adds at beginning
// .addLast(element) - adds at end
// .offerFirst(element) - adds at beginning, returns true/false
// .offerLast(element) - adds at end, returns true/false
// .removeFirst() - removes and returns first
// .removeLast() - removes and returns last
// .pollFirst() - removes and returns first, null if empty
// .pollLast() - removes and returns last, null if empty
// .getFirst() - returns first, throws if empty
// .getLast() - returns last, throws if empty
// .peekFirst() - returns first, null if empty
// .peekLast() - returns last, null if empty
// .push(element) - adds at beginning (Stack)
// .pop() - removes and returns first (Stack)
// .poll() - removes and returns first (Queue)
// .peek() - returns first (Queue)
// .element() - returns first (Queue), throws if empty
// .offer(element) - adds at end (Queue)

// Other Methods
// .contains(element) - returns true if exists
// .size() - returns number of elements
// .isEmpty() - returns true if empty
// .clear() - removes all
// .toArray() - converts to array
// .toArray(T[] a) - converts to typed array
// .iterator() - returns iterator
// .descendingIterator() - returns reverse iterator
// .listIterator(index) - returns list iterator
// .clone() - returns shallow copy
// .subList(from, to) - returns portion of list
// .forEach(action) - performs action on each
// .removeIf(predicate) - removes if matches condition
// .replaceAll(unaryOperator) - replaces each element
// .sort(comparator) - sorts list