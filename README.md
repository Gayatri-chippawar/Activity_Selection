# 📌 Activity Selection Problem – Greedy Approach
## 📖 Overview

This project implements the Activity Selection Problem using the Greedy Algorithm technique.

The goal is:

From a given set of activities (with start time and end time), select the maximum number of non-overlapping activities that can be performed by a single person.

 implemented:

✅ A function that sorts activities by finishing time

✅ A function that handles unsorted 2D array input

✅ Logic to calculate:

Total number of activities performed

Names/IDs of selected activities (stored in an ArrayList)

## 🧠 Problem Statement

Each activity has:

Start Time

End Time

Activity Name / ID

We must select activities such that:

No two selected activities overlap.

Maximum number of activities are selected.

## 💡 Greedy Strategy Used

The greedy choice is:

Always select the activity that finishes earliest.

Why?

Choosing the activity that finishes first leaves more room for future activities.

🔄 Approach
1️⃣ Sorted Approach (By Finish Time)

Steps:

Sort activities based on end time (ascending).

Select the first activity.

For every next activity:

If start_time >= last_selected_end_time

Select it

Store selected activity names in an ArrayList.

## Time Complexity:

Sorting → O(n log n)

Selection → O(n)

Overall → O(n log n)

2️⃣ Unsorted 2D Array Approach

If activities are given in an unsorted 2D array:

[ [start, end],
  [start, end],
  ...
]

Steps:

Convert into structure with index tracking.

Sort based on end time.

Apply same greedy logic.

Store selected indices/names in ArrayList.

## 📂 Example
Input
Activity	Start	End
A1	1	2
A2	3	4
A3	0	6
A4	5	7
A5	8	9
Output
Selected Activities: [A1, A2, A4, A5]
Total Activities Performed: 4
⚙️ Core Logic (Pseudo Code)
sort activities by end time

count = 1
select first activity
store in arraylist

for i from 1 to n:
    if start[i] >= last_end:
        select activity
        add to arraylist
        update last_end
📌 Data Structures Used

ArrayList<String> → To store selected activity names

2D Array → To store start and end times

Custom sorting logic (Comparator or manual sort)

## 🎯 Key Concepts Practiced

Greedy Algorithms

Sorting using Comparator

2D Arrays

ArrayList usage

Time Complexity analysis

## 🚀 Learning Outcome

After completing this project, you understand:

Why greedy works for activity selection

Importance of sorting by finishing time

How to handle unsorted input

How to track selected processes dynamically

## 🏁 Conclusion

The Activity Selection Problem is a classic example where a local optimal choice (earliest finish time) leads to a globally optimal solution (maximum activities).

This implementation demonstrates both:

Pre-sorted input handling

Unsorted 2D array handling
