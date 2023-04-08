# HashMap
HashMap<K, V> is a part of Java’s collection since Java 1.2. This class is found in java.util package. It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace the element of the corresponding key.

HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values.  This class makes no guarantees as to the order of the map. To use this class and its methods, you need to import java.util.HashMap package or its superclass.
![Capture](https://user-images.githubusercontent.com/99464989/230715250-75d7eef2-4484-4842-b02b-14adb09568b9.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230715274-05e094d8-212a-4eaf-a805-5cff01c2079e.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230715298-69399275-c888-4232-9cff-554f3120a0d8.PNG)
HashMap implements Serializable, Cloneable, Map<K, V> interfaces. HashMap extends AbstractMap<K, V> class. The direct subclasses are LinkedHashMap, PrinterStateReasons.

 

Different chrematistics’ of HashMap:
A HashMap is a data structure that is used to store and retrieve values based on keys. Some of the key characteristics of a hashmap include:

Fast access time: HashMaps provide constant time access to elements, which means that retrieval and insertion of elements is very fast, usually O(1) time complexity.
Uses hashing function: HashMaps use a hash function to map keys to indices in an array. This allows for quick lookup of values based on keys.
Stores key-value pairs: Each element in a HashMap consists of a key-value pair. The key is used to look up the associated value.
Supports null keys and values: HashMaps allow for null values and keys. This means that a null key can be used to store a value, and a null value can be associated with a key.
Not ordered: HashMaps are not ordered, which means that the order in which elements are added to the map is not preserved. However, LinkedHashMap is a variation of HashMap that preserves the insertion order.
Allows duplicates: HashMaps allow for duplicate values, but not duplicate keys. If a duplicate key is added, the previous value associated with the key is overwritten.
Thread-unsafe: HashMaps are not thread-safe, which means that if multiple threads access the same hashmap simultaneously, it can lead to data inconsistencies. If thread safety is required, ConcurrentHashMap can be used.
Capacity and load factor: HashMaps have a capacity, which is the number of elements that it can hold, and a load factor, which is the measure of how full the hashmap can be before it is resized.
Here is an example of creating a HashMap in Java:
![Capture](https://user-images.githubusercontent.com/99464989/230715335-2798e37e-ee87-4030-9d14-9931bc0be8e2.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230715353-fc0352c7-e3bb-4e6c-a629-ff35bd4f96cd.PNG)
Constructor 1: HashMap()

It is the default constructor which creates an instance of HashMap with an initial capacity of 16 and load factor of 0.75.

Syntax:

HashMap<K, V> hm = new HashMap<K, V>();
Example
![Capture](https://user-images.githubusercontent.com/99464989/230715379-2609cc70-1307-480a-87b1-93323173dbfc.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230715393-4eeef7f1-3ba8-418d-a9b5-8cc704f3969f.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230715411-54faa158-28f7-4e4e-9501-764fd87c2415.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230715421-2677856e-a814-4919-a457-8ca1face6101.PNG)

Constructor 3: HashMap(int initialCapacity, float loadFactor)

It creates a HashMap instance with a specified initial capacity and specified load factor.

Syntax:

HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity, float loadFactor);
Example
![Capture](https://user-images.githubusercontent.com/99464989/230715456-70715456-2304-4602-b2b0-54e68add2f63.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230715466-77acf784-c7ca-4ac3-b9d3-225e81e344cb.PNG)
![Capture](https://user-images.githubusercontent.com/99464989/230715484-c5ea4f7d-5af3-4463-a965-9e6bedc4cbff.PNG)
Performing Various Operations on HashMap
1. Adding Elements: In order to add an element to the map, we can use the put() method. However, the insertion order is not retained in the Hashmap. Internally, for every element, a separate hash is generated and the elements are indexed based on this hash to make it more efficient.
![Capture](https://user-images.githubusercontent.com/99464989/230715525-3bfb8fb9-3474-4f15-8958-4a494273a59a.PNG)
2. Changing Elements: After adding the elements if we wish to change the element, it can be done by again adding the element with the put() method. Since the elements in the map are indexed using the keys, the value of the key can be changed by simply inserting the updated value for the key for which we wish to change.
![Capture](https://user-images.githubusercontent.com/99464989/230715541-8714ee6b-a649-4858-8942-7ae6fe9b50c4.PNG)
3. Removing Element: In order to remove an element from the Map, we can use the remove() method. This method takes the key value and removes the mapping for a key from this map if it is present in the map.
![Capture](https://user-images.githubusercontent.com/99464989/230715562-b296d248-8de2-4fb9-b7e7-194343adb563.PNG)
4. Traversal of HashMap

We can use the Iterator interface to traverse over any structure of the Collection Framework. Since Iterators work with one type of data we use Entry< ? , ? > to resolve the two separate types into a compatible format. Then using the next() method we print the entries of HashMap.
![Capture](https://user-images.githubusercontent.com/99464989/230715591-f21da98a-0278-4745-a4a7-8ff84e08d2d4.PNG)
Important Features of HashMap
To access a value one must know its key. HashMap is known as HashMap because it uses a technique called Hashing. Hashing is a technique of converting a large String to small String that represents the same String. A shorter value helps in indexing and faster searches. HashSet also uses HashMap internally.
Few important features of HashMap are: 

HashMap is a part of java.util package.
HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value respectively.
HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
HashMap allows null key also but only once and multiple null values.
This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time. It is roughly similar to HashTable but is unsynchronized.
