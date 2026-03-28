
// MAINTAIN INSERTION ORDER
/*
LinkedHashSet: Ordered by insertion 
    - maintains a doubly-linked list to preserve the order elements were added.
*/

// Adding Elements
// .add(element) - adds element if not present, returns true/false
// .addAll(collection) - adds all elements from collection

// Removing Elements
// .remove(element) - removes element if present, returns true/false
// .removeAll(collection) - removes all elements in collection
// .removeIf(predicate) - removes elements that match condition
// .retainAll(collection) - keeps only elements in collection
// .clear() - removes all elements

// Checking Elements
// .contains(element) - returns true if element exists
// .containsAll(collection) - returns true if all elements exist
// .isEmpty() - returns true if empty

// Information
// .size() - returns number of elements

// Iterating (maintains insertion order)
// .iterator() - returns iterator in insertion order
// .forEach(action) - performs action on each element
// .spliterator() - creates Spliterator

// Conversion
// .toArray() - converts to Object[] (insertion order)
// .toArray(T[] a) - converts to specified type array (insertion order)

// Other
// .clone() - returns shallow copy
// .reversed() - returns reverse order view (Java 21+)
// .getFirst() - returns first element (Java 21+)
// .getLast() - returns last element (Java 21+)
