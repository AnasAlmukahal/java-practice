# Practice Java
This Repo is mainly for me to practice Java after finish learning it through Youtube, the projects won't be functional like my other projects, rather it will utilize a main data structure to do something specific(eg. frequency count on a Hashmap).
I will also explain each data structure before starting the practice.

## Data Structure That Will Be Used
- List / ArrayList
- Map(Hashmap)
- Stack
- Trees
- Graphs
### List
List is an ordered collection, like a dynamic array that can grow and shrink in size.
Its part of the java collections framework which provides a rich set of methods to manipulate data.
**Characteristics of List:**
- Ordered.
- Index-Based Access: you can directly access, insert and remove elements by their index.
- Duplicates Allowed.
- Null values Allowed.
- Dynamic Sizing.
In java, List is an interface and not a class, which means it defines what operations a List can do, but not how they are implemented, basically you can't create an instance of a List
eg:
`List<String> myList = ArrayList<>();`
**Common Implementations:**
- `ArrayList`: most common implementation, very fast for random access(getting element by index) but slower for inserting and removing elements in the middle of the list.
- `LinkedList`: backed by a doubly-linked list, faster for inserting/removing elements at the beginning and middle of list, since it only requires changing node pointers, but its slower for random access because it must traverse the list from start or end to reach the index
- `Vector`: older, thread-safe implementation, similar to `ArrayList` but with synchronized methods, which makes it slower for single-threaded scenarios, its considered legacy so keep with `ArrayList` unless thread safety is needed, there are other alternatives such as `CopyOnWriteArrayList`.
**Time Complexity:**
	-`ArrayList`:
		- `get(int index)`: `O(1)` direct array instantaneous
		- `add(E element)` (append to end): `O(1)` usually, occasionally O(n) when internal array needs to be resized and copied
		- `add(int index, E element)` (insert at position): `O(n)`requires shifting all subsequent elements to the right
		- `remove(int index)` (remove by position): `O(n)`requires shifting all subsequent elements to the left
		- `remove(Object o)` ( remove by value): `O(n)` must search entire list in the worst case to find the element and an additional cost for shifting
		- `contains(Object o)` (search): `O(n)` must check each element one by one in the worst case
		- `set(int index)` (replace at position): `O(1)` direct array assignment by index
	- `LinkedList`:
		- `get(int index)`: `O(n)` must traverse the list from head or tail until it reaches index
		- `add(E element)` (append to end):  `O(1)` creates a new node and updates tail's `next` pointer
		- `add(int index, E element)` (insert at position): `O(1) if at head/tail, O(n) otherwise` once the correct node is found `O(n)`, insertion itself is just changing pointers `O(1)`
		- `remove(int index)` (remove by position): `O(1) if at head/tail, O(n) otherwise` similar to insertion, finding node is O(n), actual removal is O(1)
		- `remove(Object o)` ( remove by value): `O(n)` must search entire list in worst case to find element
		- `contains(Object o)` (search): `O(n)` must check each element one by one in worst case  
		- `set(int index)` (replace at position): `O(n)` must traverse to the node at given index
**When to use each?**
- We use `ArrayList` if:
	- we're doing a lot of random access
	- primarily add/remove only at the end of the list
	- we're iterating over the list frequently
	- memory is a priority, as it has less memory overhead per element because it only stores the data and an index
- We use `LinkedList` if:
	- frequently add/remove elements from the beginning of the list.
	- a lot of insertion/removal in the middle of a large list and we're using an iterator.
