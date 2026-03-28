// Sorted Order

// TreeSet implements SortedSet, maintains elements in sorted order (natural or custom)

// Adding Elements
// .add(element) - adds element if not present, returns true/false
// .addAll(collection) - adds all elements from collection

// Removing Elements
// .remove(element) - removes element if present, returns true/false
// .removeAll(collection) - removes all elements in collection
// .removeIf(predicate) - removes elements that match condition
// .retainAll(collection) - keeps only elements in collection
// .clear() - removes all elements
// .pollFirst() - removes and returns lowest element, null if empty
// .pollLast() - removes and returns highest element, null if empty

// Checking Elements
// .contains(element) - returns true if element exists
// .containsAll(collection) - returns true if all elements exist
// .isEmpty() - returns true if empty

// Navigation Methods
// .first() - returns lowest element
// .last() - returns highest element
// .lower(element) - greatest element strictly less than given
// .floor(element) - greatest element less than or equal to given
// .ceiling(element) - smallest element greater than or equal to given
// .higher(element) - smallest element strictly greater than given

// SubSet Views
// .subSet(fromElement, toElement) - fromElement inclusive, toElement exclusive
// .subSet(fromElement, fromInclusive, toElement, toInclusive) - with inclusive flags
// .headSet(toElement) - elements less than toElement
// .headSet(toElement, inclusive) - with inclusive flag
// .tailSet(fromElement) - elements greater than or equal to
// .tailSet(fromElement, inclusive) - with inclusive flag
// .descendingSet() - returns reverse order view
// .descendingIterator() - returns iterator in descending order

// Iterating
// .iterator() - returns iterator in ascending order
// .forEach(action) - performs action on each element
// .spliterator() - creates Spliterator

// Information
// .size() - returns number of elements
// .comparator() - returns comparator used, null if natural order

// Conversion
// .toArray() - converts to Object[] (sorted order)
// .toArray(T[] a) - converts to specified type array (sorted order)

// Other
// .clone() - returns shallow copy