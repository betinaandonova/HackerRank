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

---

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

---

## 🧑‍💻 Example Implementation (Python)

```python
def count_greater_than_avg(responseTimes):
    n = len(responseTimes)
    if n <= 1:
        return 0

    count = 0
    total_sum = responseTimes[0]

    for i in range(1, n):
        avg = total_sum / i
        if responseTimes[i] > avg:
            count += 1
        total_sum += responseTimes[i]

    return count


# Example usage
n = int(input())
if n == 0:
    print(0)
else:
    arr = [int(input()) for _ in range(n)]
    print(count_greater_than_avg(arr))
```

---

## 🚀 Tips

* Avoid recalculating averages using loops — use a running sum instead.
* Be careful with integer vs floating-point division.
* Works efficiently even for large values (up to `10^9`).
