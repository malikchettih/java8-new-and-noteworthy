# Stream API & Collectors

## What is Map/Filter/Reduce pattern

* http://web.mit.edu/6.005/www/fa15/classes/25-map-filter-reduce/
* https://medium.com/jsguru/javascript-functional-programming-map-filter-and-reduce-846ff9ba492d

### Map
Map applies a unary function to each element in the sequence and returns a new sequence containing the results, in the same order:
```
<b>map : (E → F) × Seq<‍E> → Seq<‍F></b>
```
The map() method creates a new array with the results of calling a provided function on every element in the calling array.
```
const numbers = [2, 4, 8, 10];
const halves = numbers.map(x => x / 2);
```

### Filter
Our next important sequence operation is filter, which tests each element with a unary predicate. Elements that satisfy the predicate are kept; those that don’t are removed. A new list is returned; filter doesn’t modify its input list.
```
<b>filter : (E → boolean) × Seq<‍E> → Seq<‍E></b>
```
The filter() method creates a new array with all elements that pass the test implemented by the provided function.
```
const words = ["spray", "limit", "elite", "exuberant", "destruction", "present"];

const longWords = words.filter(word => word.length > 6);
// longWords is ["exuberant", "destruction", "present"]
```
### Reduce
Our final operator, reduce, combines the elements of the sequence together, using a binary function. In addition to the function and the list, it also takes an initial value that initializes the reduction, and that ends up being the return value if the list is empty.
```
<b>reduce : (F × E → F) × Seq<‍E> × F → F</b>
```
The reduce() method applies a function against an accumulator and each element in the array (from left to right) to reduce it to a single value.
```
const total = [0, 1, 2, 3].reduce((sum, value) => sum + value, 1);
// total is 7
```
The really cool thing about reduce is that it passes the result of one callback function invocation to the next one allowing us to do some crazy ass shenanigans like…
