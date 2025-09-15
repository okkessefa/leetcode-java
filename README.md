# 📘 LeetCode Java Solutions

This repository contains my solutions to selected LeetCode problems written in Java.  
The purpose is to strengthen my **Data Structures & Algorithms (DSA)** skills in Java, aligned with my upcoming college coursework and interview preparation.

---

## 📂 Repository Structure
```
leetcode-java/
├─ src/
│  ├─ TwoSum.java
│  ├─ BestTimeToBuyAndSellStock.java
│  ├─ ValidAnagram.java
│  ├─ IsSubsequence.java
└─ README.md
```

- All solutions are placed inside `src/`.
- Each file is named after the problem (camel case, no spaces).

---

## 🚀 How to Run
Clone the repo:
```bash
git clone https://github.com/<your-username>/leetcode-java.git
cd leetcode-java/src
```

Compile a solution:
```bash
javac TwoSum.java
```

Run it (if it has a main method for testing):
```bash
java TwoSum
```

---

## 📊 Solved Problems

| 1   | Two Sum                             | Easy | `TwoSum.java`                       | O(n)          | O(n)   |
| 14  | Longest Common Prefix               | Easy | `LongestCommonPrefix.java`          | O(S)          | O(1)   |
| 26  | Remove Duplicates from Sorted Array | Easy | `RemoveDuplicatesFromSortedArray.java` | O(n)       | O(1)   |
| 27  | Remove Element                      | Easy | `RemoveElement.java`                | O(n)          | O(1)   |
| 35  | Search Insert Position              | Easy | `SearchInsertPosition.java`         | O(log n)      | O(1)   |
| 66  | Plus One                            | Easy | `PlusOne.java`                      | O(n)          | O(1)   |
| 88  | Merge Sorted Array                  | Easy | `MergeSortedArray.java`             | O(m+n)        | O(1)   |
| 108 | Convert Sorted Array to BST         | Easy | `ConvertSortedArrayToBST.java`      | O(n)          | O(log n) |
| 118 | Pascal’s Triangle                   | Easy | `PascalsTriangle.java`              | O(n²)         | O(n²)  |
| 119 | Pascal’s Triangle II                | Easy | `PascalsTriangleII.java`            | O(n²)/O(n)    | O(n)   |
| 121 | Best Time to Buy and Sell Stock     | Easy | `BestTimeToBuyAndSellStock.java`    | O(n)          | O(1)   |
| 136 | Single Number                       | Easy | `findSingleNumber.java`             | O(n)          | O(1)   |
| 9   | Palindrome Number                   | Easy | `IsPalindromeNumber.java`           | O(n)          | O(1)   |
| 169 | Majority Element                    | Easy | `majorityElement.java`              | O(n)          | O(1)   |
| 28  | First Occurrence in a String        | Easy | `FirstOccurrenceString.java`        | O(n + m)      | O(m)   |
| 217 | Contains Duplicate                  | Easy | `dublicatedNumber.java`             | O(n)          | O(n)   |
| 219 | Contains Duplicate II               | Easy | `Distanceindicate.java`             | O(n)          | O(min(n,k)) |
| 58  | Length of Last Word                 | Easy | `lengthOfLastWord.java`             | O(n)          | O(1)   |
| 69  | Sqrt(x)                             | Easy | `SquareRoot.java`                   | O(log x)      | O(1)   |
| 2327 | Number of People Aware of a Secret | Medium | `HasSecret.java`                  | O(n)          | O(n)   |
| 228 | Summary Ranges                      | Easy | `summaryRanges.java`                | O(1)          | O(n)   |
| 20  | Valid Parantheses                   | Easy | `validParantheses.java`             | O(n)          | O(n)   |
| 3523 | Make Array Non-decreasing          | Medium | `makeArrayNonDecreasing.java`     | O(n)          | O(1)   |

---

## 🎯 Goals
- Practice Java problem solving every day.  
- Build consistency and push solutions directly to GitHub.  
- Progress from **Easy → Medium → Hard** problems over time.  

---

## 🔹 How to Update After Solving a Problem

1. **Add the `.java` file** to `src/` using the problem’s title in CamelCase.  
   Example: for problem **125. Valid Palindrome**, create `ValidPalindrome.java`.

2. **Update the README table**:
   - Add a new row under **📊 Solved Problems**.
   - Fill in:
     - Problem number (`125`)  
     - Name (`Valid Palindrome`)  
     - Difficulty (Easy/Medium/Hard)  
     - File name (`` `ValidPalindrome.java` ``)  
     - Time complexity (e.g., `O(n)`)  
     - Space complexity (e.g., `O(1)`)

   Example row to paste:
   ```markdown
   | 125 | Valid Palindrome | Easy | `ValidPalindrome.java` | O(n) | O(1) |
   ```

3. **Commit and push**:
```bash
git add src/ValidPalindrome.java README.md
git commit -m "Solved 125. Valid Palindrome"
git push
```
