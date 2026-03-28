// heap-based

// PriorityQueue implements min-heap by default (smallest priority)

// Adding Elements
// .add(element) - adds element, throws if capacity exceeded
// .offer(element) - adds element, returns true/false
// .addAll(collection) - adds all elements

// Removing Elements
// .remove() - removes and returns head, throws if empty
// .remove(element) - removes first occurrence, returns true/false
// .removeAll(collection) - removes all in collection
// .removeIf(predicate) - removes if matches condition
// .poll() - removes and returns head, null if empty
// .clear() - removes all elements

// Examining Elements
// .element() - returns head without removing, throws if empty
// .peek() - returns head without removing, null if empty

// Information
// .size() - returns number of elements
// .isEmpty() - returns true if empty
// .contains(element) - returns true if exists
// .containsAll(collection) - returns true if all exist
// .comparator() - returns comparator used, null if natural order

// Iterating (no guaranteed order)
// .iterator() - returns iterator (not in priority order)
// .forEach(action) - performs action on each
// .spliterator() - creates Spliterator

// Conversion
// .toArray() - converts to Object[]
// .toArray(T[] a) - converts to typed array

// Other
// .retainAll(collection) - keeps only elements in collection

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Implement Max Heap
// Method 1: Collections.reverseOrder()
// PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

// Method 2: Custom comparator
// PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

// Method 3: Comparator.comparing reverse
// PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.comparingInt(Integer::intValue).reversed());
