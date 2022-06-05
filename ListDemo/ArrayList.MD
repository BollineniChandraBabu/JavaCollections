### ArrayList
1. The ArrayList class implements the List interface. 
2. It uses a dynamic array to store the duplicate element of different data types. 
3. The ArrayList class maintains the insertion order and is non-synchronized. 
4. The elements stored in the ArrayList class can be randomly accessed.

### Methods available in ArrayList:
S.NO | Method                               | Description
----|--------------------------------------|---------
1 | boolean add(Object)                  | It is used to insert an element in to the collection.
2 | boolean addAll(list)                 | It is used to insert one collection objects in to other collection.
3 | boolean remove(index)                | It is used to remove an object based on index.
4 | boolean remove(Object)               | It is used to remove given object from collection.
5 | boolean removeAll(List)              | It is used to remove all the given list of objects from other collection.
6 | boolean removeIf(predicate condition) | It is used to remove objects based on predicate condition.
7 | boolean retainAll(list)              | It is used to filter common elements of the list.
8 | int size() | It gives the size of the array.
9 | void clear() | clears all the objects in the collection.
10 | boolean contains(Object) | It will returns true if the array contains given object or else false.
11 | boolean containsAll(list) | It will returns true if the array contains all the given objects or else false.
12 | Object[] toArray() | It converts list into array of Object type.
13 | <T> T[] toArray(T[] a) | It converts list into array of specified data type.