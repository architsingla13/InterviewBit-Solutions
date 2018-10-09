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
|7| [FizzBuzz](https://www.interviewbit.com/problems/fizzbuzz/)      | [Java](./Programming/Math/FizzBuzz.java)  | _O(N)_         | _O(1)_          | Easy         |  |
|8| [Power Of Two Integers](https://www.interviewbit.com/problems/power-of-two-integers/)      | [Java](./Programming/Math/IsPower.java)  | _O(sqrt(N)*log(N))_         | _O(1)_          | Easy         | Think easy solution |
|9| [Excel Column Number](https://www.interviewbit.com/problems/excel-column-number/)      | [Java](./Programming/Math/ExcelColumn.java)  | _O(N)_         | _O(1)_          | Easy         | |
|10| [Excel Column Title](https://www.interviewbit.com/problems/excel-column-title/)      | [Java](./Programming/Math/ExcelColumnTitle.java)  | _O(logn)_         | _O(1)_          | Easy         | Good Question|
|11| [Palindrome Integer](https://www.interviewbit.com/problems/palindrome-integer/)      | [Java](./Programming/Math/Palindrome.java)  | _O(number of digits)_         | _O(1)_          | Easy         | |
|12| [Reverse Integer](https://www.interviewbit.com/problems/reverse-integer/)      | [Java](./Programming/Math/ReverseInteger.java)  | _O(number of digits)_         | _O(1)_          | Easy         | |
|13| [GCD](https://www.interviewbit.com/problems/greatest-common-divisor/)      | [Java](./Programming/Math/GCD.java)  | _O(log(min a,b))_         | _O(1)_          | Easy         | Eucledian Algo, Good Question|
|14| [Trailing Zeroes](https://www.interviewbit.com/problems/trailing-zeros-in-factorial/)      | [Java](./Programming/Math/TrailingZeros.java)  | _O((A)^1/5)_         | _O(1)_          | Easy         | Good Question|
|15| [Sorted Permutation Rank](https://www.interviewbit.com/problems/sorted-permutation-rank/)      | [Java](./Programming/Math/SortedRank.java)  | _O(A^2)_         | _O(1)_          | Medium         | Good Question, Consider usage of factorial in case of modulo|
|16| [Largest Coprime Divisor](https://www.interviewbit.com/problems/largest-coprime-divisor/)      | [Java](./Programming/Math/LargestCoPrime.java)  | _O(A^2)_         | _O(1)_          | Medium         | Bookmarked|
|17| [Sorted Permutation Rank with Repeats](https://www.interviewbit.com/problems/sorted-permutation-rank-with-repeats/)      | [Java](./Programming/Math/SortRankRepeat.java)  | _O(A^2)_         | _O(1)_          | Medium         | Bookmarked, Multiplicative Inverse Modulo(use long in case of modulo) |
|18| [ReArrange Array](https://www.interviewbit.com/problems/rearrange-array/)      | [Java](./Programming/Math/RearrangeArray.java)  | _O(A)_         | _O(1)_          | Medium         | Bookmarked, Encoding 2 values in one |
|19| [Grid Unique Paths](https://www.interviewbit.com/problems/grid-unique-paths/)      | [Java](./Programming/Math/GridUniquePaths.java)  | _O(min(row,col))_         | _O(1)_          | Easy         | Bookmarked, DP or Combinatorial |
|20| [Numbers of length N and value less than K](https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/)      | [Java](./Programming/Math/NumberLessThanK.java)  | _O(B)_         | _O(1)_          | Medium         | Bookmarked |


## BinarySearch


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [SQRT](https://www.interviewbit.com/problems/square-root-of-integer/)      | [Java](./Programming/BinarySearch/SQRT.java)  | _O(log(n))_         | _O(1)_          | Easy         | Keep check for out of range in case of Multiplication else use division  |
|2| [Count Element Occurence](https://www.interviewbit.com/problems/count-element-occurence/)      | [Java](./Programming/BinarySearch/CountElements.java)  | _O(log(n))_         | _O(1)_          | Easy         |   |
|3| [Rotated Array](https://www.interviewbit.com/problems/rotated-array/)      | [Java](./Programming/BinarySearch/RotateArray.java)  | _O(log(n))_         | _O(1)_          | Easy         |  Bookmarked |
|4| [Matrix Median](https://www.interviewbit.com/problems/matrix-median/)      | [Java](./Programming/BinarySearch/MatrixMedian.java)  | _O(log(2^32)*r*log(c))_ = O(32 * r * log(c))         | _O(1)_          | Medium         |  Bookmarked |
|5| [Matrix Search](https://www.interviewbit.com/problems/matrix-search/)      | [Java](./Programming/BinarySearch/MatrixSearch.java)  | _O(log(rc))_ = O(log(r) + log(c))         | _O(1)_          | Easy         |  Bookmarked |
|6| [Sorted Insert Position](https://www.interviewbit.com/problems/sorted-insert-position/)      | [Java](./Programming/BinarySearch/SortedInsert.java)  | _O(log(n))_          | _O(1)_          | Easy         |   |
|7| [Implement Power Function](https://www.interviewbit.com/problems/implement-power-function/)      | [Java](./Programming/BinarySearch/PowerFunction.java)  | _O(log(power))_          | _O(1)_          | Easy         |  Handle Negative value carefully, Bookmarked |
|8| [Rotated Sorted Array Search](https://www.interviewbit.com/problems/rotated-sorted-array-search/)      | [Java](./Programming/BinarySearch/RotatedArraySearch.java)  | _O(log(n))_          | _O(1)_          | Easy         |   |
|9| [Search for a Range](https://www.interviewbit.com/problems/search-for-a-range/)      | [Java](./Programming/BinarySearch/SearchRange.java)  | _O(log(n))_          | _O(1)_          | Easy         |   |
|10| [Painter's Partition Problem](https://www.interviewbit.com/problems/painters-partition-problem/)      | [Java](./Programming/BinarySearch/PainterPartition.java)  | _O(Nlog(sum(array)))_          | _O(1)_          | Medium         | Bookmarked, Example to use BS in monotonic functions   |
|11| [Allocate Books](https://www.interviewbit.com/problems/allocate-books/)      | [Java](./Programming/BinarySearch/AllocateBooks.java)  | _O(Nlog(sum(array)))_          | _O(1)_          | Medium         | Bookmarked, Example to use BS in monotonic functions   |
|12| [Median of Array](https://www.interviewbit.com/problems/median-of-array/)      | [Java](./Programming/BinarySearch/Median2Sorted.java)  | _O(log(m+n))_          | _O(1)_          | Hard         | Bookmarked   |


## String


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Palindrome String](https://www.interviewbit.com/problems/palindrome-string/)      | [Java](./Programming/String/Palindrome.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|2| [Longest Common Prefix](https://www.interviewbit.com/problems/longest-common-prefix/)      | [Java](./Programming/String/LongestCommonPrefix.java)  | _O(n*min(String Length))_         | _O(1)_          | Easy         |   |
|3| [Count And Say](https://www.interviewbit.com/problems/count-and-say/)      | [Java](./Programming/String/CountAndSay.java)  | _O(n*max(String Length))_         | _O(1)_          | Easy         |   |
|4| [Minimum Characters required to make a String Palindromic](https://www.interviewbit.com/problems/minimum-characters-required-to-make-a-string-palindromic/)      | [Java](./Programming/String/MinCharsToPalindrome.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|5| [Longest Palindromic Substring](https://www.interviewbit.com/problems/longest-palindromic-substring/)      | [Java](./Programming/String/LongestPalindromeSubString.java)  | _O(n*n)_         | _O(1)_          | Medium         |  Bookmarked, 1 length is always palindrome |
|6| [StrStr](https://www.interviewbit.com/problems/implement-strstr/)      | [Java](./Programming/String/StrStr.java)  | _O(n)_         | _O(m)_          | Medium         |  Bookmarked, KMP Algo |
|7| [Compare Version Numbers](https://www.interviewbit.com/problems/compare-version-numbers/)      | [Java](./Programming/String/CompareVersions.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked|
|8| [Atoi](https://www.interviewbit.com/problems/atoi/)      | [Java](./Programming/String/Atoi.java)  | _O(n)_         | _O(1)_          | Easy         |  Bookmarked|
|9| [Length of Last Word](https://www.interviewbit.com/problems/length-of-last-word/)      | [Java](./Programming/String/LastWord.java)  | _O(n)_         | _O(1)_          | Easy         |  |
|10| [Reverse the String](https://www.interviewbit.com/problems/reverse-the-string/)      | [Java](./Programming/String/ReverseString.java)  | _O(n)_         | _O(n)_          | Easy         | Bookmarked, Ask if split function can be used|
|11| [Valid Number](https://www.interviewbit.com/problems/valid-number/)      | [Java](./Programming/String/ValidNumber.java)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Lots of corner cases|
|12| [Valid Ip Addresses](https://www.interviewbit.com/problems/valid-ip-addresses/)      | [Java](./Programming/String/ValidIp.java)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Placing 3 dots|
|13| [Roman To Integer](https://www.interviewbit.com/problems/roman-to-integer/)      | [Java](./Programming/String/RomanToInt.java)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked|
|14| [Integer To Roman](https://www.interviewbit.com/problems/integer-to-roman/)      | [Java](./Programming/String/IntToRoman.java)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Ask if you can have diff arrays to store value|
|15| [Add Binary Strings](https://www.interviewbit.com/problems/add-binary-strings/)      | [Java](./Programming/String/AddBinary.java)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Shorter Solution|
|16| [Power of 2](https://www.interviewbit.com/problems/power-of-2/)      | [Java](./Programming/String/PowerOf2.java)  | _O(logn)_         | _O(1)_          | Easy         | Bookmarked, Use of CompareTo function|
|17| [Multiply Strings](https://www.interviewbit.com/problems/multiply-strings/)      | [Java](./Programming/String/MultiplyStrings.java)  | _O(n*m)_         | _O(1)_          | Easy         | Bookmarked|
|18| [Justified Text](https://www.interviewbit.com/problems/justified-text/)      | [Java](./Programming/String/JustifiedText.java)  | _O(n*n)_         | _O(n)_          | HARD         | Bookmarked, Used Greedy Approach|