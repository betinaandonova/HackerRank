# 📊 Count Elements Greater Than Previous Average

## 🧩 Problem Description

Given an array of positive integers `responseTimes`, determine how many elements are **strictly greater than the average of all previous elements**.

* The **first element is always skipped** since it has no previous elements.
* For each subsequent element, compare it with the **average of all elements before it**.

---

## 📥 Input Format

* The first line contains an integer `n` — the number of elements (days).
* If `n > 0`, the next `n` lines each contain an integer `responseTimes[i]`.

```
n
responseTimes[0]
responseTimes[1]
...
responseTimes[n-1]
```

---

## 📤 Output Format

* A single integer representing the count of elements that are **strictly greater than the average of previous elements**.

---

## ⚙️ Constraints

* `0 ≤ n ≤ 1000`
* `1 ≤ responseTimes[i] ≤ 10^9`

---

## 🧠 Example

### Input

```
4
100
200
150
300
```

### Output

```
2
```

### Explanation

* Day 0: `100` → skipped (no previous elements)
* Day 1: `200 > avg(100) = 100` → ✅ count = 1
* Day 2: `150 > avg(100, 200) = 150` → ❌ not greater → count = 1
* Day 3: `300 > avg(100, 200, 150) = 150` → ✅ count = 2

👉 Final answer: **2**

---

## 🧪 Sample Cases

### Sample Input 0

```
0
```

### Sample Output 0

```
0
```

---

### Sample Input 1

```
1
100
```

### Sample Output 1

```
0
```

## 💡 Approach

* Maintain a running sum of previous elements.
* For each index `i > 0`:

  * Compute average = `sum / i`
  * Compare current element with the average.
* Update the sum as you iterate.

### Time Complexity

* **O(n)**

### Space Complexity

* **O(1)**

