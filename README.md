# [InterviewBit-Solutions](https://www.interviewbit.com/courses/)

Solutions to the InterviewBit problems in Java

## Programming
* [Bit Manipulation](https://github.com/architsingla13/InterviewBit-Solutions#bitmanipulation)
* [Array](https://github.com/architsingla13/InterviewBit-Solutions#array)
* [String](https://github.com/architsingla13/InterviewBit-Solutions#string)
* [Linked List](https://github.com/architsingla13/InterviewBit-Solutions#linkedlist)
* [Stack](https://github.com/architsingla13/InterviewBit-Solutions#stack)
* [Queue](https://github.com/architsingla13/InterviewBit-Solutions#queue)
* [Heap](https://github.com/architsingla13/InterviewBit-Solutions#heaps)
* [Trees](https://github.com/architsingla13/InterviewBit-Solutions#trees)
* [Hash Map](https://github.com/architsingla13/InterviewBit-Solutions#hashmap)
* [Hashing](https://github.com/architsingla13/InterviewBit-Solutions#hashing)
* [Math](https://github.com/architsingla13/InterviewBit-Solutions#math)
* [Two Pointers](https://github.com/architsingla13/InterviewBit-Solutions#twopointers)
* Sort
* Recursion
* [Binary Search](https://github.com/architsingla13/InterviewBit-Solutions#binarysearch)
* Binary Search Tree
* Breadth-First Search
* Depth-First Search
* [Backtracking](https://github.com/architsingla13/InterviewBit-Solutions#backtracking)
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
|19| [ZigZag String](https://www.interviewbit.com/problems/zigzag-string/)      | [Java](./Programming/String/ZigZag.java)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked|
|20| [Pretty Json](https://www.interviewbit.com/problems/pretty-json/)      | [Java](./Programming/String/PrettyJson.java)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked|
|21| [Stringoholics](https://www.interviewbit.com/problems/stringoholics/)      | [Java](./Programming/String/Stringoholics.java)  | _O(n*m, n*maxNum)_         | _O(n+m)_ n is input array length, m is average size of each string          | HARD         | Bookmarked, Covers many concepts - KMP, LCM|


## BitManipulation


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Min XOR Value](https://www.interviewbit.com/problems/min-xor-value/)      | [Java](./Programming/BitManipulation/MinXor.java)  | _O(nlogn)_         | _O(1)_          | Easy         | Bookmarked  |
|2| [Single Number](https://www.interviewbit.com/problems/single-number/)      | [Java](./Programming/BitManipulation/SingleNumber.java)  | _O(n)_         | _O(1)_          | Easy         |  |
|3| [Number of 1 Bits](https://www.interviewbit.com/problems/number-of-1-bits/)      | [Java](./Programming/BitManipulation/NumberOf1Bits.java)  | _O(1)_         | _O(1)_          | Easy         | Bookmarked, 2nd Solution with bits trick |
|4| [Reverse Bits](https://www.interviewbit.com/problems/reverse-bits/)      | [Java](./Programming/BitManipulation/ReverseBits.java)  | _O(1)_         | _O(1)_          | Easy         | Bookmarked, 2nd Solution |
|5| [Single Number II](https://www.interviewbit.com/problems/single-number-ii/)      | [Java](./Programming/BitManipulation/SingleNumber2.java)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked, 3x+1 |
|6| [Divide Integers](https://www.interviewbit.com/problems/divide-integers/)      | [Java](./Programming/BitManipulation/DivideIntegers.java)  | _O(log(dividend))_         | _O(1)_          | Medium         | Bookmarked, 1 approach is to subtract divisor, but takes O(dividend) time |
|7| [Different Bits Sum Pairwise](https://www.interviewbit.com/problems/different-bits-sum-pairwise/)      | [Java](./Programming/BitManipulation/DifferentBitsSum.java)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked |


## TwoPointers


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Merge Two Sorted Lists II](https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/)      | [Java](./Programming/TwoPointers/MergeSortedLists2.java)  | _O(n+m)_         | _O(1)_          | Easy         |   |
|2| [Intersection Of Sorted Arrays](https://www.interviewbit.com/problems/intersection-of-sorted-arrays/)      | [Java](./Programming/TwoPointers/IntersectionSortedArrays.java)  | _O(n+m)_         | _O(1)_          | Easy         |   |
|3| [Minimize the absolute difference](https://www.interviewbit.com/problems/minimize-the-absolute-difference/)      | [Java](./Programming/TwoPointers/MinimiseAbsDiff.java)  | _O(maxArrayLength)_         | _O(1)_          | Easy         | Bookmarked, Abs diff can be minimized either decreasing max element or increasing min element  |
|4| [Remove Duplicates from Sorted Array](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/)      | [Java](./Programming/TwoPointers/RemoveDuplicates.java)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked, Removing Element increases complexity, just set elements with 2nd pointer  |
|5| [Remove Duplicates from Sorted Array 2](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array-ii/)      | [Java](./Programming/TwoPointers/RemoveDuplicates2.java)  | _O(n)_         | _O(1)_          | Easy         | Bookmarked  |
|6| [Remove Element from Array](https://www.interviewbit.com/problems/remove-element-from-array/)      | [Java](./Programming/TwoPointers/RemoveElement.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|6| [Remove Element from Array](https://www.interviewbit.com/problems/remove-element-from-array/)      | [Java](./Programming/TwoPointers/RemoveElement.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|7| [Sort by Color](https://www.interviewbit.com/problems/sort-by-color/)      | [Java](./Programming/TwoPointers/SortByColor.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|8| [Diffk](https://www.interviewbit.com/problems/diffk/)      | [Java](./Programming/TwoPointers/DiffK.java)  | _O(n)_         | _O(1)_          | Easy         |  Bookmarked, Start both pointers from 0 and not from opp. extreme ends|
|9| [3 Sum](https://www.interviewbit.com/problems/3-sum/)      | [Java](./Programming/TwoPointers/ThreeSum.java)  | _O(n^2 + nlogn)_         | _O(1)_          | Easy         |  Bookmarked|
|10| [3 Sum Zero](https://www.interviewbit.com/problems/3-sum-zero/)      | [Java](./Programming/TwoPointers/ThreeSum0.java)  | _O(n^2 + nlogn)_         | _O(1)_          | Medium         |  Bookmarked, Handle Duplicates|
|11| [Max Continuous Series of 1s](https://www.interviewbit.com/problems/max-continuous-series-of-1s/)      | [Java](./Programming/TwoPointers/MaxCont1s.java)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked, Keeping window size having zeroes <= B|
|12| [Array 3 Pointers](https://www.interviewbit.com/problems/array-3-pointers/)      | [Java](./Programming/TwoPointers/Array3Pointers.java)  | _O(maxArrayLength)_         | _O(1)_          | Medium         | Bookmarked, Abs diff can be minimized either decreasing max element or increasing min element   |
|13| [Counting Triangles](https://www.interviewbit.com/problems/counting-triangles/)      | [Java](./Programming/TwoPointers/CountingTriangles.java)  | _O(n^2)_         | _O(1)_          | Medium         | Bookmarked, (A+B) > C by sorting the array   |
|14| [Container With Most Water](https://www.interviewbit.com/problems/container-with-most-water/)      | [Java](./Programming/TwoPointers/ContainerMostWater.java)  | _O(n)_         | _O(1)_          | Medium         | Bookmarked   |


## LinkedList


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Intersection of Linked Lists](https://www.interviewbit.com/problems/intersection-of-linked-lists/)      | [Java](./Programming/LinkedLists/Intersection.java)  | _O(n+m)_         | _O(1)_          | Easy         |   |
|2| [Reverse Linked List](https://www.interviewbit.com/problems/reverse-linked-list/)      | [Java](./Programming/LinkedLists/ReverseList.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|3| [Palindrome List](https://www.interviewbit.com/problems/palindrome-list/)      | [Java](./Programming/LinkedLists/Palindrome.java)  | _O(n)_         | _O(n)_          | Easy         |  Use Stack or reverse half linked list |
|4| [Remove Duplicates from Sorted List](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list/)      | [Java](./Programming/LinkedLists/RemoveDuplicates.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|5| [Remove Duplicates from Sorted List 2](https://www.interviewbit.com/problems/remove-duplicates-from-sorted-list-ii/)      | [Java](./Programming/LinkedLists/RemoveDuplicates2.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|6| [Merge Two Sorted Lists](https://www.interviewbit.com/problems/merge-two-sorted-lists/)      | [Java](./Programming/LinkedLists/Merge2SortedLists.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|6| [Merge Two Sorted Lists](https://www.interviewbit.com/problems/merge-two-sorted-lists/)      | [Java](./Programming/LinkedLists/Merge2SortedLists.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|7| [Remove Nth Node from List End](https://www.interviewbit.com/problems/remove-nth-node-from-list-end/)      | [Java](./Programming/LinkedLists/RemoveNthNodeFromEnd.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|8| [Rotate List](https://www.interviewbit.com/problems/rotate-list/)      | [Java](./Programming/LinkedLists/RotateList.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|9| [Reverse Lists 2](https://www.interviewbit.com/problems/reverse-link-list-ii/)      | [Java](./Programming/LinkedLists/ReverseLists2.java)  | _O(n)_         | _O(1)_          | Easy         |  Bookmarked |
|10| [Reorder List](https://www.interviewbit.com/problems/reorder-list/)      | [Java](./Programming/LinkedLists/ReorderList.java)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked, Reverse Half and merge alternate |
|11| [Swap List Nodes in pairs](https://www.interviewbit.com/problems/swap-list-nodes-in-pairs/)      | [Java](./Programming/LinkedLists/SwapAlternate.java)  | _O(n)_         | _O(1)_          | Medium         |   |
|12| [K reverse linked list](https://www.interviewbit.com/problems/k-reverse-linked-list/)      | [Java](./Programming/LinkedLists/KReverse.java)  | _O(n)_         | _O(1)_          | Medium         |   |
|13| [Add Two Numbers as Lists](https://www.interviewbit.com/problems/add-two-numbers-as-lists/)      | [Java](./Programming/LinkedLists/Add2Numbers.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|14| [List Cycle](https://www.interviewbit.com/problems/list-cycle/)      | [Java](./Programming/LinkedLists/ListCycle.java)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked |
|15| [Partition List](https://www.interviewbit.com/problems/partition-list/)      | [Java](./Programming/LinkedLists/PartitionList.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|16| [Sort List](https://www.interviewbit.com/problems/sort-list/)      | [Java](./Programming/LinkedLists/SortList.java)  | _O(nlogn)_         | _O(1)_          | Medium         |   |


## Stack


|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Simplify Directory Path](https://www.interviewbit.com/problems/simplify-directory-path/)      | [Java](./Programming/Stacks/SimplifyDirectory.java)  | _O(n)_         | _O(n)_          | Easy         |   |
|2| [Redundant Braces](https://www.interviewbit.com/problems/redundant-braces/)      | [Java](./Programming/Stacks/RedundantBraces.java)  | _O(n)_         | _O(n)_          | Easy         |   |
|3| [Nearest Smaller Element](https://www.interviewbit.com/problems/nearest-smaller-element/)      | [Java](./Programming/Stacks/NearestSmaller.java)  | _O(n)_         | _O(n)_          | Easy         |   |
|4| [Evaluate Expression](https://www.interviewbit.com/problems/evaluate-expression/)      | [Java](./Programming/Stacks/EvaluateExpression.java)  | _O(n)_         | _O(n)_          | Easy         |   |
|5| [Min Stack](https://www.interviewbit.com/problems/min-stack/)      | [Java](./Programming/Stacks/MinStack.java)  | _O(1)_         | _O(1)_          | Easy         |  Bookmarked, Doing Min in O(1) space is good one|
|6| [Largest Rectangle in Histogram](https://www.interviewbit.com/problems/largest-rectangle-in-histogram/)      | [Java](./Programming/Stacks/LargestRectangleInHistogram.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked, Do read brute force and think in terms of stack|
|7| [Rain Water Trapped](https://www.interviewbit.com/problems/rain-water-trapped/)      | [Java](./Programming/Stacks/RainWaterTrapped.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked |



## Queue

|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Sliding Window Maximum](https://www.interviewbit.com/problems/sliding-window-maximum/)      | [Java](./Programming/Queue/SlidingWindowW.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked, Finding Min is reverse of current logic|



## Backtracking

|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [ReverseLinkedList](https://www.interviewbit.com/problems/reverse-link-list-recursion/)      | [Java](./Programming/Backtracking/ReverseLinkedList.java)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked |
|2| [Modular Expression](https://www.interviewbit.com/problems/modular-expression/)      | [Java](./Programming/Backtracking/ModularExpression.java)  | _O(log(power))_         | _O(1)_          | Easy         |  Bookmarked, Modular Exponentiation |
|3| [Subset](https://www.interviewbit.com/problems/subset/)      | [Java](./Programming/Backtracking/Subset.java)  | _O(2^n)_         | _O(n)_          | Easy         |  Bookmarked, Backtracking general algo |
|4| [Combinations](https://www.interviewbit.com/problems/combinations/)      | [Java](./Programming/Backtracking/Combinations.java)  | _O(nCk)_         | _O(n)_          | Easy         |  Bookmarked, Backtracking general algo |
|5| [Combination Sum](https://www.interviewbit.com/problems/combination-sum/)      | [Java](./Programming/Backtracking/CombinationsSum.java)  | _O(2^n)_         | _O(targetSum)_          | Easy         |  Bookmarked, Backtracking general algo, Use Map for checking duplicates |
|6| [Combination Sum 2](https://www.interviewbit.com/problems/combination-sum-ii/)      | [Java](./Programming/Backtracking/CombinationsSum2.java)  | _O(2^n)_         | _O(targetSum)_          | Easy         |   |
|7| [SubSets 2](https://www.interviewbit.com/problems/subsets-ii/)      | [Java](./Programming/Backtracking/SubSets2.java)  | _O(2^n)_         | _O(n)_          | Easy         |  Bookmarked, Either use hashmap or skip continuous elements in recursion function |
|8| [Letter Phone](https://www.interviewbit.com/problems/letter-phone/)      | [Java](./Programming/Backtracking/LetterPhone.java)  | _O(3^n)_         | _O(n)_          | Easy         |   |
|9| [Palindrome Partitioning](https://www.interviewbit.com/problems/palindrome-partitioning/)      | [Java](./Programming/Backtracking/PalindromePartitioning.java)  | _O(2^n)_         | _O(n)_          | Easy         |  Bookmarked, can maintain 2-D array to keep true/false whether start-end is palindrome or not (DP) |
|10| [Generate all Parentheses II](https://www.interviewbit.com/problems/generate-all-parentheses-ii/)      | [Java](./Programming/Backtracking/GenerateParanthesis.java)  | _O(2^n)_         | _O(2n)_          | Easy         |   |
|11| [Permutations](https://www.interviewbit.com/problems/permutations/)      | [Java](./Programming/Backtracking/Permutations.java)  | _O(n!)_         | _O(n)_          | Medium         | Bookmarked, Either use visited array or remove integer from input array then add back while backtracking  |
|12| [Gray Code](https://www.interviewbit.com/problems/gray-code/)      | [Java](./Programming/Backtracking/GrayCode.java)  | _O(2^n)_         | _O(n)_          | Medium         | Bookmarked, Other Solution of using reverse of (N-1) and prefixing 1 is good  |
|13| [Kth Permutation Sequence](https://www.interviewbit.com/problems/kth-permutation-sequence/)      | [Java](./Programming/Backtracking/KthPermutation.java)  | _O(nk)_         | _O(n)_          | Medium         | Bookmarked, Use Maths plus recursion, first digit = k/(n-1)!+1  |
|14| [NQueens](https://www.interviewbit.com/problems/nqueens/)      | [Java](./Programming/Backtracking/NQueens.java)  | _O(n*n)_         | _O(n)_          | Medium         | Bookmarked  |



## Hashing

|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Colorful Number](https://www.interviewbit.com/problems/colorful-number/)      | [Java](./Programming/Hashing/ColorfulNumber.java)  | _O(n*n)_         | _O(n)_          | Easy         |   |
|2| [Largest Continuous Sequence Zero Sum](https://www.interviewbit.com/problems/largest-continuous-sequence-zero-sum/)      | [Java](./Programming/Hashing/LargestContZero.java)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked, 3 conditions - element 0, sum 0 or sum repeated |
|3| [2 Sum](https://www.interviewbit.com/problems/2-sum/)      | [Java](./Programming/Hashing/TwoSum.java)  | _O(n)_         | _O(1)_          | Easy         |   |
|4| [4 Sum](https://www.interviewbit.com/problems/4-sum/)      | [Java](./Programming/Hashing/FourSum.java)  | _O(n*n+nlogn)_         | _O(n)_          | Medium         |  Bookmarked, Either use n^3 solution using 2 pointers and hashSet for unique sets or or use customised sorting plus hashSet |
|5| [Valid Sudoku](https://www.interviewbit.com/problems/valid-sudoku/)      | [Java](./Programming/Hashing/ValidSudoku.java)  | _O(n*n)_         | _O(n*n)_          | Medium         |  Bookmarked, check row, col and box, keep different maps |
|6| [Diffk II](https://www.interviewbit.com/problems/diffk-ii/)      | [Java](./Programming/Hashing/Diffk.java)  | _O(n)_         | _O(n)_          | Easy         |   |
|7| [Anagrams](https://www.interviewbit.com/problems/anagrams/)      | [Java](./Programming/Hashing/Anagram.java)  | _O(n*m)_ , where m = average length of string       | _O(n)_          | Medium         |  Bookmarked, Good Concept |
|8| [Equal](https://www.interviewbit.com/problems/equal/)      | [Java](./Programming/Hashing/Equal.java)  | _O(n*n)_        | _O(n)_          | Medium         |  Bookmarked |
|9| [Copy List](https://www.interviewbit.com/problems/copy-list/)      | [Java](./Programming/Hashing/CopyList.java)  | _O(n)_        | _O(n)_          | Medium         |   |
|10| [Longest Substring Without Repeat](https://www.interviewbit.com/problems/longest-substring-without-repeat/)      | [Java](./Programming/Hashing/LongestSubstringWithoutRepeat.java)  | _O(n)_        | _O(n)_          | Medium         | Bookmarked  |
|11| [Window String](https://www.interviewbit.com/problems/window-string/)      | [Java](./Programming/Hashing/WindowString.java)  | _O(n)_        | _O(n)_          | Medium         | Bookmarked, Use 2 pointers and map to keep count of characters included - plus and minus   |
|12| [Fraction](https://www.interviewbit.com/problems/fraction/)      | [Java](./Programming/Hashing/Fraction.java)  | _O(n)_        | _O(n)_          | Medium         | Bookmarked   |
|13| [Points on the Straight Line](https://www.interviewbit.com/problems/points-on-the-straight-line/)      | [Java](./Programming/Hashing/MaxPointsOnStraightLine.java)  | _O(n*n)_        | _O(n)_          | Medium         | Bookmarked, Slope should be same, Consider first point as start and rest as end and create map and repeat; Keep edge cases like which slopes are valid and others keep in diff variables   |
|14| [Substring Concatenation](https://www.interviewbit.com/problems/substring-concatenation/)      | [Java](./Programming/Hashing/SubstringConcatenation.java)  | _O(n*n)_        | _O(n)_          | Medium         | Bookmarked, Brute force but just using hashmap for string match   |



## Heaps

|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [N max pair combinations](https://www.interviewbit.com/problems/n-max-pair-combinations/)      | [Java](./Programming/Heaps/NMaxCombinations.java)  | _O(nlogn)_         | _O(n)_          | Medium         |  Bookmarked, Create a min heap and loop through n^2 pairs  |
|2| [Magician and Chocolates](https://www.interviewbit.com/problems/magician-and-chocolates/)      | [Java](./Programming/Heaps/MagiciansAndChocolates.java)  | _O(klogn)_         | _O(n)_          | Easy         |    |
|3| [Merge K Sorted Lists](https://www.interviewbit.com/problems/merge-k-sorted-lists/)      | [Java](./Programming/Heaps/MergeKSortedLists.java)  | _O(Nlogk)_, where k = initial lists and N = total sum of nodes from all lists         | _O(k)_          | Medium         |    |



## HashMap

|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Distinct Numbers in Window](https://www.interviewbit.com/problems/distinct-numbers-in-window/)      | [Java](./Programming/HashMaps/DistinctNumbersOfWindow.java)  | _O(n)_         | _O(n)_          | Easy         |    |
|2| [LRU](https://www.interviewbit.com/problems/lru-cache/)      | [Java](./Programming/HashMaps/LRU.java)  | _O(1)_ for get and O(n) for set         | _O(n)_          | Easy         |    |
|3| [Ways to form Max Heap](https://www.interviewbit.com/problems/ways-to-form-max-heap/)      | [Java](./Programming/HashMaps/MaxHeaps.java)  | _O(log2n^2)_          | _O(log2n)_          | Hard         |  Bookmarked, T(n) = n-1Cl*T(l)*T(r), where r = n-1-l  |



## Trees

|  Id  | Title           |  Solution       |  Time           | Space           | Difficulty    | Note|
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|
|1| [Valid Binary Search Tree](https://www.interviewbit.com/problems/valid-binary-search-tree/)      | [Java](./Programming/Trees/ValidBST.java)  | _O(n)_         | _O(log2n)_          | Easy         |    |
|2| [Next Greater Number BST](https://www.interviewbit.com/problems/next-greater-number-bst/)      | [Java](./Programming/Trees/InorderSucc.java)  | _O(logn)_         | _O(1)_          | Easy         |  Bookmarked, Good Question plus also know inorder using 1 stack  |
|3| [Max Depth of Binary Tree](https://www.interviewbit.com/problems/max-depth-of-binary-tree/)      | [Java](./Programming/Trees/MaxDepth.java)  | _O(n)_         | _O(n)_          | Easy         |    |
|4| [Vertical Order traversal of Binary Tree](https://www.interviewbit.com/problems/vertical-order-traversal-of-binary-tree/)      | [Java](./Programming/Trees/VerticalOrder.java)  | _O(n)_         | _O(n)_          | Easy         |    |
|5| [Inorder Traversal](https://www.interviewbit.com/problems/inorder-traversal/)      | [Java](./Programming/Trees/InorderTraversal.java)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked  |
|6| [PreOrder Traversal](https://www.interviewbit.com/problems/preorder-traversal/)      | [Java](./Programming/Trees/PreOrderTraversal.java)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked  |
|6| [PreOrder Traversal](https://www.interviewbit.com/problems/preorder-traversal/)      | [Java](./Programming/Trees/PreOrderTraversal.java)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked  |
|7| [PostOrder Traversal](https://www.interviewbit.com/problems/postorder-traversal/)      | [Java](./Programming/Trees/PostOrder.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked, Using 2 stacks is easy  |
|8| [Hotel Reviews](https://www.interviewbit.com/problems/hotel-reviews/)      | [Java](./Programming/Trees/HotelReviews.java)  | _O(Sum of all input strings length)_         | _O(n)_          | Medium         |  Bookmarked, Use tries or Hashset   |
|9| [Balanced Binary Tree](https://www.interviewbit.com/problems/balanced-binary-tree/)      | [Java](./Programming/Trees/BalancedTree.java)  | _O(n)_         | _O(n)_          | Easy         |     |
|10| [Identical Binary Trees](https://www.interviewbit.com/problems/identical-binary-trees/)      | [Java](./Programming/Trees/IdenticalTree.java)  | _O(n)_         | _O(n)_          | Easy         |     |
|11| [Symmetric Binary Tree](https://www.interviewbit.com/problems/symmetric-binary-tree/)      | [Java](./Programming/Trees/SymmetricTree.java)  | _O(n)_         | _O(n)_          | Easy         |     |
|12| [Inorder Traversal of Cartesian Tree](https://www.interviewbit.com/problems/inorder-traversal-of-cartesian-tree/)      | [Java](./Programming/Trees/InorderCartesian.java)  | _O(n)_         | _O(n)_          | Easy         |     |
|13| [Sorted Array To Balanced BST](https://www.interviewbit.com/problems/sorted-array-to-balanced-bst/)      | [Java](./Programming/Trees/SortedArrayToBalancedBST.java)  | _O(n)_         | _O(n)_          | Easy         |     |
|14| [Binary Tree From Inorder And Postorder](https://www.interviewbit.com/problems/binary-tree-from-inorder-and-postorder/)      | [Java](./Programming/Trees/BinaryTreeFromInorderPostOrder.java)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked   |
|15| [Construct Binary Tree From Inorder And Preorder](https://www.interviewbit.com/problems/construct-binary-tree-from-inorder-and-preorder/)      | [Java](./Programming/Trees/BinaryTreeFromPreAndInorder.java)  | _O(n)_         | _O(n)_          | Easy         |     |
|16| [Kth Smallest Element In Tree](https://www.interviewbit.com/problems/kth-smallest-element-in-tree/)      | [Java](./Programming/Trees/KthSmallestInBst.java)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked, Can be done without extra space as well   |
|17| [2-Sum Binary Tree](https://www.interviewbit.com/problems/2sum-binary-tree/)      | [Java](./Programming/Trees/TwoSumBinaryTree.java)  | _O(n)_         | _O(logn)_          | Medium         |  Bookmarked, Can be done in O(n) space with sorted array   |
|18| [BST Iterator](https://www.interviewbit.com/problems/bst-iterator/)      | [Java](./Programming/Trees/BSTIterator.java)  | _O(1)_         | _O(logn)_          | Easy         |  Bookmarked, Can be done in O(n) space with array   |
|19| [Recover Binary Search Tree](https://www.interviewbit.com/problems/recover-binary-search-tree/)      | [Java](./Programming/Trees/RecoverBST.java)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked; Morris Algo - attaching current to inorder predecessor, Can be done in O(n) space with array, rest concept is same  |
|20| [Invert the Binary Tree](https://www.interviewbit.com/problems/invert-the-binary-tree/)      | [Java](./Programming/Trees/InvertBinaryTree.java)  | _O(n)_         | _O(n)_          | Easy         |  Bookmarked  |
|21| [ZigZag Level Order Traversal BT](https://www.interviewbit.com/problems/zigzag-level-order-traversal-bt/)      | [Java](./Programming/Trees/ZigZagOrder.java)  | _O(n)_         | _O(n)_          | Easy         |  Can be solved using 2 stacks or queue  |
|22| [Min Depth of Binary Tree](https://www.interviewbit.com/problems/min-depth-of-binary-tree/)      | [Java](./Programming/Trees/MinDepthOfBinaryTree.java)  | _O(n)_         | _O(n)_          | Easy         |    |
|23| [Path Sum](https://www.interviewbit.com/problems/path-sum/)      | [Java](./Programming/Trees/PathSum.java)  | _O(n)_         | _O(n)_          | Easy         |    |
|24| [Sum Root to Leaf Numbers](https://www.interviewbit.com/problems/sum-root-to-leaf-numbers/)      | [Java](./Programming/Trees/SumRootToLeafNumbers.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked,  mod can be used even before number is formed |
|25| [Root to Leaf Paths With Sum](https://www.interviewbit.com/problems/root-to-leaf-paths-with-sum/)      | [Java](./Programming/Trees/RootToLeafPathSum.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked |
|26| [Populate Next Right Pointers Tree](https://www.interviewbit.com/problems/populate-next-right-pointers-tree/)      | [Java](./Programming/Trees/PopulateNextRight.java)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked, If Space was not constant then using queue is very easy |
|27| [Least Common Ancestor](https://www.interviewbit.com/problems/least-common-ancestor/)      | [Java](./Programming/Trees/LeastCommonAncestor.java)  | _O(n)_         | _O(n)_          | Medium         |  Bookmarked |
|28| [Shortest Unique Prefix](https://www.interviewbit.com/problems/shortest-unique-prefix/)      | [Java](./Programming/Trees/ShortestUniquePrefix.java)  | _O(n*m)_         | _O(total unique characters)_          | Medium         |  Bookmarked, either use count of unique flag at each node, update the child's property and not current node |
|29| [Flatten Binary Tree to Linked List](https://www.interviewbit.com/problems/flatten-binary-tree-to-linked-list/)      | [Java](./Programming/Trees/FlattenBinaryTree.java)  | _O(n)_         | _O(1)_          | Medium         |  Bookmarked, Can be solved using stack or recursion |
|30| [Order of People Heights](https://www.interviewbit.com/problems/order-of-people-heights/)      | [Java](./Programming/Trees/OrderOfPeoplesHeight.java)  | _O(nlogn)_         | _O(n)_          | Medium         |  Bookmarked, Solve it like a puzzle, good question |