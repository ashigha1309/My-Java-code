# Missing Number Finder (Java)

This Java program finds the **missing number** in a sequence of natural numbers.

## 🧠 Problem Statement:
Given an array of `n-1` integers in the range `1 to n`, where one number is missing, find that missing number.

### ✅ Example:
Input array: `[1, 2, 3, 5]`  
Missing number: `4`

## 📄 Code Explanation:
- Calculates the expected total sum from `1 to n` using formula: `n*(n+1)/2`
- Subtracts the actual sum of the array elements from this total
- Prints the missing number
