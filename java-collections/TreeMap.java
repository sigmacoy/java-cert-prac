// sorted by keys

// TreeMap implements SortedMap, maintains keys in sorted order (natural or custom)

// Adding/Updating Elements
// .put(key, value) - adds or updates key-value pair
// .putAll(map) - adds all key-value pairs from another map
// .putIfAbsent(key, value) - adds only if key doesn't exist

// Removing Elements
// .remove(key) - removes entry by key, returns value
// .remove(key, value) - removes only if key maps to specified value
// .clear() - removes all entries
// .pollFirstEntry() - removes and returns lowest key entry
// .pollLastEntry() - removes and returns highest key entry

// Accessing Elements
// .get(key) - returns value for key
// .getOrDefault(key, defaultValue) - returns value or default
// .containsKey(key) - returns true if key exists
// .containsValue(value) - returns true if value exists

// Navigation Methods
// .firstKey() - returns lowest key
// .lastKey() - returns highest key
// .firstEntry() - returns lowest key entry
// .lastEntry() - returns highest key entry
// .lowerKey(key) - greatest key strictly less than given
// .floorKey(key) - greatest key less than or equal to given
// .ceilingKey(key) - smallest key greater than or equal to given
// .higherKey(key) - smallest key strictly greater than given
// .lowerEntry(key) - entry with greatest key strictly less than given
// .floorEntry(key) - entry with greatest key ≤ given
// .ceilingEntry(key) - entry with smallest key ≥ given
// .higherEntry(key) - entry with smallest key strictly greater than given

// SubMap Views
// .subMap(fromKey, toKey) - returns portion fromKey to toKey
// .subMap(fromKey, inclusive, toKey, inclusive) - with inclusive flags
// .headMap(toKey) - returns portion less than toKey
// .headMap(toKey, inclusive) - with inclusive flag
// .tailMap(fromKey) - returns portion greater than or equal
// .tailMap(fromKey, inclusive) - with inclusive flag
// .descendingMap() - returns reverse order view
// .descendingKeySet() - returns keys in descending order
// .navigableKeySet() - returns keys in ascending order

// Views/Collections
// .keySet() - returns Set of keys in ascending order
// .values() - returns Collection of values (key order)
// .entrySet() - returns Set of entries in ascending order

// Information
// .size() - returns number of entries
// .isEmpty() - returns true if empty
// .comparator() - returns comparator used, null if natural order

// Other
// .clone() - returns shallow copy
// .forEach(action) - performs action on each entry
// .replace(key, newValue) - replaces value for key
// .replace(key, oldValue, newValue) - conditional replace
// .replaceAll(function) - replaces all values
// .compute/key, remappingFunction) - computes new value
// .computeIfAbsent(key, mappingFunction) - computes if key absent
// .computeIfPresent(key, remappingFunction) - computes if key present
// .merge(key, value, remappingFunction) - merges value