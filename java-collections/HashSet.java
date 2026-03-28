// Unordered
/*
no guarantees about iteration order. Order can even change over time.
unordered_set in c++
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

// Iterating
// .iterator() - returns iterator
// .forEach(action) - performs action on each element

// Conversion
// .toArray() - converts to Object[]
// .toArray(T[] a) - converts to specified type array

// Other
// .clone() - returns shallow copy
// .spliterator() - creates a Spliterator over the elements