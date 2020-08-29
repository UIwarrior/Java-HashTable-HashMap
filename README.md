# Java-HashTable-HashMap

A hash table is a data structure that stores records (or elements) according to its associated “keys”. 
This is done by designing a hash function that takes the given keys as input and outputs array indices at which the records are stored. In other words, each record is stored using the array index obtained by hashing its key.

Note that hash tables stores data in the form of key and value. Each array contains a hashed key along with a pointer that tells you the location at which the associated record is stored.

One important feature that a hash function must have is that it must compute fast, since a time-expensive hash function would defeat the overall purpose of a fast retrieval of a hash table. Now that you know what a hash function is, let’s move on to a different mathematical hash function to add a new dimension to this topic.

A hash function should be interpreted as a black box that takes keys as input and gives array indices as output.

Consider a hash table of size 10 which is initially empty, with a starting index of zero, and a hash function:

H(x) = (5x + 4) mod 10 (x being the key to be hashed) .

The sequence of keys - ‘3, 10’ - are is inserted into the hash table using the hash function H(x) .

3 gets hashed to (5 * 3 + 4)mod10 = 19mod10 = 9; 10 gets hashed to (5 * 10 + 4)mod 10 = 4.

 A hash function is any function that
can be used for mapping arbitrarily sized data to fixed size data. As you can see in the figure below, the cardinality
of the input set is infinite, whereas the output is a range with a fixed size M, where 0<M<=N (N is the set of natural
numbers).


 For a given application, a good hash function should be
designed with the following characteristics in mind:
1. It should use all the keys.
2. It should distribute the keys uniformly across the array indices.
3. It should output different hash values for similar, yet unequal, keys.




Similarities between Hashtable and HashMap are as follows:

1. Both are the implementations of Map interface in java.

2. Both of them perform similar functions.

3. Both do not maintain any order of elements.

Differences between Hashtable and HashMap are as follows:

Hashtable	
It is used in the older versions of Java.	
It doesn’t allow a key to be null.	
It doesn’t allow to store a null value.
It is a bit slower.

HashMap

It exists only in newer versions of Java i.e., it is part of Java since version 1.2
It allows at most one key to be null.
It allows storing any number of null values.
It is faster.

We declare the HashMap in Java by using the below instruction:

HashMap<keyDataType, valueDataType> hashMapName = new HashMap<keyDataType, valueDataType>();


put(key,value) = 	This method adds the specified key with the specified value to the HashMap.
remove(key) = If the key is present in the HashMap, then it removes the key along with the value mapped to it.
containsKey(key)	= If there is any mapping to the specified key, then it returns true.
size()	= This returns the number of key-value mappings present in the HashMap.
isEmpty()	= If there is no key-value mapping present in the HashMap, it returns true.
clear()	= Removes all mappings present in the HashMap.
get(key)  = Returns the value mapped to the specified key in the HashMap.
keySet()  = Returns the set of keys present in the HashMap.


Implementations of the Set

There are three implementations of the Set interface in Java they are:

HashSet:

This is the most commonly used implementation of the set. Here the elements are stored randomly, and duplicates are not allowed.

LinkedHashSet

Here, the order of the elements is maintained on the basis of their insertion order, and no duplicates are allowed.

TreeSet

Here, the order of the elements is maintained by the inbuilt ordering or by the explicit comparator (which can arrange it in any sorted order) of TreeSet. Here as well duplicates are not allowed.