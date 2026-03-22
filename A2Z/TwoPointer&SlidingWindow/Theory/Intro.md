## What is pointer  
A variable representing an index or position within a data structure such as an array, string, or list. Pointers are commonly used to traverse data efficiently without extra memory.

Example:  
In an array arr = [10, 20, 30], a pointer i = 0 refers to the element 10. When i is incremented, it moves to the next position.

## What is Two Pointer  
Two pointer is a problem-solving approach that uses two indices (pointers) to traverse a data structure in a coordinated manner. This technique is primarily used to reduce time complexity from O(n²) to O(n).

The two-pointer approach is effective when working with arrays or strings and is commonly applied to searching, comparison, and range-based problems.

There are different category in two pointer approach.

### DifferentCategory

- Converging pointer  
  Pointers start at opposite ends of the data structure and move toward each other. This pattern is useful when comparing elements symmetrically.

  Example:  
  Check whether a string is a palindrome.

  s = "madam"  
  left = 0, right = 4  

  m == m → move inward  
  a == a → move inward  
  d == d → palindrome  

  Common use cases:  
  - Palindrome checking  
  - Pair sum in a sorted array  
  - Reverse traversal comparisons  

- Parallel Pointer  
  A parallel pointer approach uses two or more pointers that move together (in parallel) across one or more data structures. Their movement is synchronized—when one pointer advances, the others advance in a predictable way. The pointers are not reacting to conditions; they move as part of a fixed traversal strategy.

  Example:  
  Compare two arrays to check if they are equal.

  arr1 = [1, 2, 3]  
  arr2 = [1, 2, 3]  

  i = 0, j = 0  
  compare arr1[i] and arr2[j]  
  move both pointers forward together  

  Common use cases:  
  - Comparing two arrays or strings  
  - Merging two sorted arrays  
  - Traversing multiple data sources simultaneously  

- Trigger-Based Pointers  
  A trigger-based pointer moves only when a specific condition (trigger) is met. One pointer usually moves continuously, while the other pointer moves reactively to maintain a constraint. This approach is commonly used in sliding window problems.

  Example:  
  Find the longest subarray with sum less than or equal to K.

  nums = [2, 1, 5, 1, 3], K = 7  

  right pointer expands the window  
  left pointer moves only when sum > K  

  Common use cases:  
  - Sliding window problems  
  - Longest or shortest subarray or substring  
  - Constraint-based optimization problems  
