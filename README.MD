### Collections:
1. The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
2. Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.
3. Java Collection means a single unit of objects. 
4. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

![img.png](img.png)

### Non-generic Vs Generic Collection in Java
1. Generic Collection: specifying data type (what kind of objects need to be stored).
2. Non-Generic Collection: declare collection without specifying data type.

| Base                  | Generic                                              | Non-generic                        |
|-----------------------|------------------------------------------------------|------------------------------------|
| Syntax                | ```List list = new ArrayList();```                   | ```List<Long> list = new ArrayList();``` |
| Type-Safety           | Can hold any type of data                            | can hold only defined data type objects |
| TypeCasting           | Individual type casting needs to be done at every retrieval. | No typecasting is needed. |
| Compile-Time Checking |	Checked for type safety at runtime.	| Checked for type safety at Compile-time. |