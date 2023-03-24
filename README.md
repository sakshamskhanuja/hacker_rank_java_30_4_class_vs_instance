## 30 Days of Code - Day 4 - Class vs Instance

### Objective

In this challenge, we're going to learn about the difference between a class and an instance; because this is an Object
Oriented concept, it's only enabled in certain languages.

### Task

Write a ```Person``` class with an instance variable, <i>age</i> , and a constructor that takes an integer, <i>
initialAge</i> , as a parameter. The constructor must assign <i>initialAge</i> to <i>age</i> after confirming the
argument passed as <i>initialAge</i> is not negative; if a negative argument is passed as <i>initialAge</i>, the
constructor should set <i>age</i> to 0 and print ```Age is not valid, setting age to 0.```. In addition, you must write
the following instance methods:

1. ```yearPasses()``` should increase the <i>age</i> instance variable by 1.
2. ```amIOld()``` should perform the following conditional actions:<ul><li>If <i>age < 13</i>,
   print ```You are young.```.</li><li>If <i>age >= 13</i> and <i>age < 18</i>,
   print ```You are a teenager.```.</li><li>Otherwise, print ```You are old.```</li></ul>

### Input Format

Input is handled for you by the stub code in the editor.

The first line contains an integer, <i>T</i> (the number of test cases), and the <i>T</i> subsequent lines each contain
an integer denoting the <i>age</i> of a Person instance.

### Constraints

<ul>
<li>1 <= <i>T</i> < 4</li>
<li>-5 <= <i>age</i> <= 30</li>
</ul>

### Output Format

Complete the method definitions provided in the editor so they meet the specifications outlined above; the code to test
your work is already in the editor. If your methods are implemented correctly, each test case will print 2 or 3 lines (
depending on whether or not a valid <i>initialAge</i> was passed to the constructor).

### Sample Input

```
4
-1
10
16
18
```

### Sample Output

```
Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.
```

### Explanation

Test Case 0: <i>initialAge</i> = -1<br>
Because <i>initialAge</i> < 0, our code must set <i>age</i> to 0 and print the "Age is not valid..." message followed by
the young message. Three years pass and <i>age</i> = 3, so we print the young message again.

Test Case 1: <i>initialAge</i> = 10<br>
Because <i>initialAge</i> < 13, our code should print that the person is young. Three years pass and <i>age</i> = 13, so
we print that the person is now a teenager.

Test Case 2: <i>initialAge</i> = 16<br>
Because 13 <= <i>initialAge</i> < 18, our code should print that the person is a teenager. Three years pass and <i>
age</i> = 19, so we print that the person is old.

Test Case 3: <i>initialAge</i> = 18<br>
Because <i>initialAge</i> > 18, our code should print that the person is old. Three years pass and the person is still
old at <i>age</i> = 21, so we print the old message again.
