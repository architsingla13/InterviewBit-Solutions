# [InterviewBit-Solutions](https://www.interviewbit.com/courses/)

Solutions to the InterviewBit problems in Java

## Programming
* [Bit Manipulation](https://github.com/architsingla13/InterviewBit-Solutions#bitmanipulation)
* [Array](https://github.com/architsingla13/InterviewBit-Solutions#array)
* [String](https://github.com/architsingla13/InterviewBit-Solutions#string)
* [Linked List](https://github.com/architsingla13/InterviewBit-Solutions#linkedlist)
* Stack
* Queue
* Heap
* [Tree](https://github.com/architsingla13/InterviewBit-Solutions#tree)
* [Hash Table](https://github.com/architsingla13/InterviewBit-Solutions#hashtable)
* [Math](https://github.com/architsingla13/InterviewBit-Solutions#math)
* Two Pointers
* Sort
* Recursion
* [Binary Search](https://github.com/architsingla13/InterviewBit-Solutions#binarysearch)
* Binary Search Tree
* Breadth-First Search
* Depth-First Search
* Backtracking
* Dynamic Programming
* Greedy
* Graph
* Geometry
* Simulation
* Design


## Array


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Spiral Array](https://www.interviewbit.com/problems/spiral-order-matrix-i/)      | [Java](./Programming/Array/SpiralArray.java)  | _O(n*m)_         | _O(1)_          | Easy         |  |
|2| [Min Steps](https://www.interviewbit.com/problems/min-steps-in-infinite-grid/)      | [Java](./Programming/Array/MinSteps.java)  | _O(n)_         | _O(1)_          | Easy         |  |
|3| [Add One to Number](https://www.interviewbit.com/problems/add-one-to-number/)      | [Java](./Programming/Array/AddOne.java)  | _O(n)_         | _O(1)_          | Easy         |  |
|4| [Max Sum Contiguous Subarray](https://www.interviewbit.com/problems/max-sum-contiguous-subarray/)      | [Java](./Programming/Array/MaxSumContiguous.java)  | _O(n)_         | _O(1)_          | Medium         | Kadane's Algo :- previous MSS should be positive for optimal subarray|
|5| [Maximum Absolute Difference](https://www.interviewbit.com/problems/maximum-absolute-difference/)      | [Java](./Programming/Array/MaxAbsDiff.java)  | _O(n)_         | _O(1)_          | Medium         | Carefully look the given exp and how it can be written down|
|6| [Repeat and Missing Number Array](https://www.interviewbit.com/problems/repeat-and-missing-number-array/)      | [Java](./Programming/Array/RepeatMissing.java)  | _O(n)_         | _O(1)_          | Medium         | Look for overflows and equations|
|7| [Flip](https://www.interviewbit.com/problems/flip/)      | [Java](./Programming/Array/Flip.java)  | _O(n)_         | _O(1)_          | Medium         | |
|7| [Max Non Negative SubArray](https://www.interviewbit.com/problems/max-non-negative-subarray/)      | [Java](./Programming/Array/MaxNonNegativeSub.java)  | _O(n)_         | _O(1)_          | Easy         | Check for overflows and tie constraints properly|
|8| [Spiral Order Matrix II](https://www.interviewbit.com/problems/spiral-order-matrix-ii/)      | [Java](./Programming/Array/Spiral2.java)  | _O(n*n)_         | _O(n*n)_          | Easy         | |
|9| [Pascal Triangle](https://www.interviewbit.com/problems/pascal-triangle/)      | [Java](./Programming/Array/Pascal.java)  | _O(n*n)_         | _O(n*n)_          | Easy         | |
|10| [Kth Row of Pascal's Triangle](https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/)      | [Java](./Programming/Array/KthPascal.java)  | _O(n*n)_         | _O(n)_          | Easy         | Think in terms of if previous calculated list is needed or not |
|11| [Anti Diagonals](https://www.interviewbit.com/problems/anti-diagonals/)      | [Java](./Programming/Array/AntiDiagonals.java)  | _O(n)_         | _O(1)_          | Easy         |  |
|12| [Noble Integer](https://www.interviewbit.com/problems/noble-integer/)      | [Java](./Programming/Array/NobleInteger.java)  | _O(nlogn)_         | _O(1)_          | Easy         |  |
|13| [Triplets with Sum between given range](https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/)      | [Java](./Programming/Array/TripletsSum.java)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked |
|14| [Largest Number](https://www.interviewbit.com/problems/largest-number/)      | [Java](./Programming/Array/LargestNumber.java)  | _O(n)_         | _O(n)_          | Medium         | Comparator |
|15| [Wave Array](https://www.interviewbit.com/problems/wave-array/)      | [Java](./Programming/Array/WaveArray.java)  | _O(nlogn)_         | _O(1)_          | Easy         |  |
|16| [Hotel Bookings Possible](https://www.interviewbit.com/problems/hotel-bookings-possible/)      | [Java](./Programming/Array/HotelBookings.java)  | _O(nlogn)_         | _O(1)_          | Medium         |  Bookmarked|
|17| [Find Duplicate in Array](https://www.interviewbit.com/problems/find-duplicate-in-array/)      | [Java](./Programming/Array/FindDuplicate.java)  | _O(n)_         | _O(1)_          | Easy         |  |
|18| [Max Distance](https://www.interviewbit.com/problems/max-distance/)      | [Java](./Programming/Array/MaxDistance.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked|
|19| [Min Unsorted Subarray](https://www.interviewbit.com/problems/maximum-unsorted-subarray/)      | [Java](./Programming/Array/MinUnsortedArray.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked|
|20| [Maximum Consecutive Gap](https://www.interviewbit.com/problems/maximum-consecutive-gap/)      | [Java](./Programming/Array/MaxConsGap.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked, PigeonHole Sorting using bucket method|
|21| [Rotate Matrix](https://www.interviewbit.com/problems/rotate-matrix/)      | [Java](./Programming/Array/RotateMatrix.java)  | _O(n*n)_         | _O(1)_          | Medium         |  Good Question|
|22| [MAXSPPROD](https://www.interviewbit.com/problems/maxspprod/)      | [Java](./Programming/Array/SpecialProduct.java)  | _O(n)_         | _O(n)_          | Medium         |  Good Question|
|23| [Next Permutation](https://www.interviewbit.com/problems/next-permutation/)      | [Java](./Programming/Array/NextPerm.java)  | _O(nlogn)_(only if already highest perm, else O(n + logn))         | _O(1)_          | Medium         |  Good Question, Analyse diff examples, Bookmarked|
|24| [Find Permutation](https://www.interviewbit.com/problems/find-permutation/)      | [Java](./Programming/Array/FindPerm.java)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, Bookmarked|
|25| [Set Matrix Zeros](https://www.interviewbit.com/problems/set-matrix-zeros/)      | [Java](./Programming/Array/SetMatrix0.java)  | _O(n*m)_         | _O(1)_          | Medium         |  Good Question|
|26| [First Missing Integer](https://www.interviewbit.com/problems/first-missing-integer/)      | [Java](./Programming/Array/FirstMissingInteger.java)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, Bookmarked|
|27| [Merge Overlapping Intervals](https://www.interviewbit.com/problems/merge-overlapping-intervals/)      | [Java](./Programming/Array/MergeOverlappingIntervals.java)  | _O(nlogn)_         | _O(1)_          | Medium         |  Good Question, Bookmarked|
|28| [Merge Intervals](https://www.interviewbit.com/problems/merge-intervals/)      | [Java](./Programming/Array/MergeIntervals.java)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, Good Edge Cases|
|29| [N/3 Repeat Number](https://www.interviewbit.com/problems/n3-repeat-number/)      | [Java](./Programming/Array/Nby3Repeat.java)  | _O(n)_         | _O(1)_          | Medium         |  Good Question, Moore's Voting Algo|


## Math


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [All Factors](https://www.interviewbit.com/problems/all-factors/)      | [Java](./Programming/Math/AllFactors.java)  | _O(sqrt(n))_         | _O(1)_          | Easy         | Keep notice of edge cases - like i^2 = A |
|2| [Binary Representation](https://www.interviewbit.com/problems/binary-representation/)      | [Java](./Programming/Math/BinaryRep.java)  | _O(log(n))_         | _O(1)_          | Easy         |  |
|3| [Prime](https://www.interviewbit.com/problems/prime-numbers/)      | [Java](./Programming/Math/Prime.java)  | _O(sqrt(N)loglog(n))_         | _O(1)_          | Easy         | Sieve of Eratosthenes |
|4| [Verify Prime](https://www.interviewbit.com/problems/verify-prime/)      | [Java](./Programming/Math/VerifyPrime.java)  | _O(sqrt(N))_         | _O(1)_          | Easy         |  |
|5| [Prime Sum](https://www.interviewbit.com/problems/prime-sum/)      | [Java](./Programming/Math/PrimeSum.java)  | _O(sqrt(N)loglog(n) + N)_         | _O(1)_          | Easy         |  |
|6| [Sum of pairwise Hamming Distance](https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/)      | [Java](./Programming/Math/PairWiseHamming.java)  | _O(N)_         | _O(1)_          | Medium         | Good idea on how to use mod for large test cases, and good solution |
