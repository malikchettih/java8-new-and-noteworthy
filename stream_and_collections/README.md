# Stream API & Collectors

## What is Map/Filter/Reduce pattern

### Map

http://web.mit.edu/6.005/www/fa15/classes/25-map-filter-reduce/

Map applies a unary function to each element in the sequence and returns a new sequence containing the results, in the same order:
<b>map : (E → F) × Seq<‍E> → Seq<‍F></b>
### Filter
Our next important sequence operation is filter, which tests each element with a unary predicate. Elements that satisfy the predicate are kept; those that don’t are removed. A new list is returned; filter doesn’t modify its input list.
<b>filter : (E → boolean) × Seq<‍E> → Seq<‍E></b>
### Reduce
Our final operator, reduce, combines the elements of the sequence together, using a binary function. In addition to the function and the list, it also takes an initial value that initializes the reduction, and that ends up being the return value if the list is empty.
<b>reduce : (F × E → F) × Seq<‍E> × F → F</b>
