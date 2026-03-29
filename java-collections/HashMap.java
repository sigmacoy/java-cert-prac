// unordered
/*
no guarantees about iteration order. Order can even change over time.
unordered_map in c++
*/

// Adding/Updating Elements
// .put(key, value) - adds or updates key-value pair, returns old value
// .putAll(map) - adds all key-value pairs from another map
// .putIfAbsent(key, value) - adds only if key doesn't exist
// .merge(key, value, remappingFunction) - merges value using function

// Removing Elements
// .remove(key) - removes entry by key, returns value
// .remove(key, value) - removes only if key maps to specified value
// .clear() - removes all entries

// Accessing Elements
// .get(key) - returns value for key, null if not found
// .getOrDefault(key, defaultValue) - returns value or default if not found
// .containsKey(key) - returns true if key exists
// .containsValue(value) - returns true if value exists

// Views/Collections
// .keySet() - returns Set of all keys
// .values() - returns Collection of all values
// .entrySet() - returns Set of all key-value pairs (Map.Entry)

// Information
// .size() - returns number of entries
// .isEmpty() - returns true if empty

// Default Methods (Java 8+)
// .compute(key, remappingFunction) - computes new value for key
// .computeIfAbsent(key, mappingFunction) - computes if key absent
// .computeIfPresent(key, remappingFunction) - computes if key present
// .forEach(action) - performs action on each entry
// .replace(key, newValue) - replaces value for key
// .replace(key, oldValue, newValue) - replaces only if matches old
// .replaceAll(function) - replaces all values using function

// Other
// .clone() - returns shallow copy