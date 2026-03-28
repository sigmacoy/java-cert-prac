// insertion order

// Constructors (extra)
// .LinkedHashMap(initialCapacity, loadFactor, accessOrder) - accessOrder=true for access-order mode

// Adding/Updating Elements
// .put(key, value) - adds or updates key-value pair, returns old value
// .putAll(map) - adds all key-value pairs from another map
// .putIfAbsent(key, value) - adds only if key doesn't exist

// Removing Elements
// .remove(key) - removes entry by key, returns value
// .remove(key, value) - removes only if key maps to specified value
// .clear() - removes all entries
// .removeEldestEntry(Map.Entry eldest) - protected, override to implement LRU cache

// Accessing Elements
// .get(key) - returns value for key (moves to end if accessOrder=true)
// .getOrDefault(key, defaultValue) - returns value or default
// .getOrDefault(key, defaultValue) - with access order effect
// .containsKey(key) - returns true if key exists
// .containsValue(value) - returns true if value exists

// Views/Collections (maintains order)
// .keySet() - returns Set of all keys (insertion/access order)
// .values() - returns Collection of all values (insertion/access order)
// .entrySet() - returns Set of entries (insertion/access order)

// Information
// .size() - returns number of entries
// .isEmpty() - returns true if empty

// Default Methods (Java 8+)
// .compute(key, remappingFunction) - computes new value
// .computeIfAbsent(key, mappingFunction) - computes if key absent
// .computeIfPresent(key, remappingFunction) - computes if key present
// .forEach(action) - performs action on each entry
// .replace(key, newValue) - replaces value for key
// .replace(key, oldValue, newValue) - conditional replace
// .replaceAll(function) - replaces all values

// Other
// .clone() - returns shallow copy
// .reversed() - returns reverse order view (Java 21+)
// .sequencedKeySet() - returns sequenced set (Java 21+)
// .sequencedEntrySet() - returns sequenced entry set (Java 21+)
// .sequencedValues() - returns sequenced collection (Java 21+)