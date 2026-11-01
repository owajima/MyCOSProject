# COS 201 — Computer Programming I

Java practical work for COS 201. Each week's programs are in their own folder.

| | |
|---|---|
| **Student Name** | Emmanuel Johnson Owajima |
| **Matriculation Number** | 25/16530 |
| **Programme** | Cyber Security |
| **Course** | COS 201 — Computer Programming I |
| **Language** | Java |

## Repository structure

```
MyCOSProject/
├── README.md
├── .gitignore
├── week01/
│   └── FirstProgram.java
├── week02/
│   ├── HelloWorld.java
│   ├── StudentProfile.java
│   ├── PrintExample.java
│   └── ErrorExample.java
└── week03/
    ├── SimpleCalculator.java
    ├── AverageCalculator.java
    └── ItemCost.java
```

## Requirements

- Java Development Kit (JDK) 8 or later. The programs were tested with OpenJDK 21.
- Check the installation with `javac -version` and `java -version`.

## How to compile and run

Open a terminal in the folder of the week you want, compile the `.java` file with `javac`, then run the class with `java` (no `.java` extension).

```bash
cd week03
javac SimpleCalculator.java
java SimpleCalculator
```

The same two steps work for every program in this repository. `javac` creates a `.class` file; `.gitignore` keeps these compiled files out of the repository.

---

## Week 1

| Program | Description |
|---|---|
| `FirstProgram.java` | My first Java program. Prints a short message showing the basic structure of a Java program: a class, a `main` method and statements ending in semicolons. |

```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

```
This is my first Java program.
Name: Emmanuel Johnson Owajima
Course: COS 201 - Computer Programming I
```

Week 1 Activities A, B and C are handwritten and submitted on paper, as instructed, so they are not in this repository.

---

## Week 2 — Development Environment and First Java Program

| Program | Description |
|---|---|
| `HelloWorld.java` | Prints a greeting to confirm that the JDK is installed and working. |
| `StudentProfile.java` | Displays my student profile as formatted lines of text. |
| `PrintExample.java` | Shows the difference between `print()` and `println()`, escape sequences (`\t`, `\n`, `\"`, `\\`) and joining text with `+`. |
| `ErrorExample.java` | The corrected version of a program written with deliberate errors. The comments record each compiler error and how it was fixed. |

### How to run

```bash
cd week02
javac HelloWorld.java
java HelloWorld
```

Use the same commands with `StudentProfile`, `PrintExample` and `ErrorExample`.

### Sample output

`java HelloWorld`

```
Hello, World!
My Java development environment is working.
```

`java StudentProfile`

```
==========================================
             STUDENT PROFILE
==========================================
Name          : Emmanuel Johnson Owajima
Matric Number : 25/16530
Programme     : Cyber Security
Course        : COS 201
Course Title  : Computer Programming I
Language      : Java
==========================================
```

`java PrintExample`

```
COS 201 - Computer Programming I
This line was printed with println().
So this one starts on a new line.
Tab (\t):       Name	Matric No.
New line (\n):  first line
                second line
Quote (\"):     Java is "case-sensitive".
Backslash (\\): C:\COS201\week02
Student: Emmanuel Johnson Owajima
2 + 3 inside text gives 23
2 + 3 in brackets gives 5
```

The last two lines show that once `+` meets text, it joins instead of adding. Brackets make Java add the numbers first.

### Errors found and fixed (`ErrorExample.java`)

| Compile | Line | Compiler message | Fix |
|---|---|---|---|
| 1st | 3 | `error: ';' expected` | Added the missing semicolon. |
| 1st | 5 | `error: unclosed string literal` | Added the closing double quote. |
| 1st | 6 | `error: reached end of file while parsing` | Added the closing brace `}` of the class. |
| 2nd | 4 | `error: package system does not exist` | Changed `system` to `System`, because Java is case-sensitive. |

The fourth error only appeared after the first three were fixed. `javac` checks punctuation and structure first, so it is best to fix the first error, compile again and repeat.

---

## Week 3 — Variables, Data Types, Expressions and Input/Output

| Program | Description |
|---|---|
| `SimpleCalculator.java` | Reads two numbers and displays their sum, difference, product, quotient and remainder. Checks for a zero divisor before dividing. |
| `AverageCalculator.java` | Reads a student's name and three course scores, then displays the total and average. **Extension:** rejects any score below 0 or above 100. |
| `ItemCost.java` | Reads an item name, quantity and unit price, then prints a purchase summary with the total cost in Naira. Rejects a quantity below 1 and a negative price. |

### How to run

```bash
cd week03
javac SimpleCalculator.java AverageCalculator.java ItemCost.java
java SimpleCalculator
java AverageCalculator
java ItemCost
```

### Concepts used

- **Variables and data types:** `int` for whole numbers (quantity), `double` for numbers with decimals (scores, prices), `String` for text (names).
- **Constants:** `final` values in `AverageCalculator` (`NUMBER_OF_COURSES`, `MIN_SCORE`, `MAX_SCORE`).
- **Expressions:** the arithmetic operators `+`, `-`, `*`, `/` and `%`. In `ItemCost`, `int * double` gives a `double`, so no kobo is lost.
- **Input:** `Scanner` with `nextLine()`, `nextInt()` and `nextDouble()`. The name is read first with `nextLine()` so names with spaces work. `hasNextInt()` and `hasNextDouble()` check the input before reading it, so typing text where a number is expected gives a message instead of a crash.
- **Output:** `println()` and `printf()`. `%.2f` shows 2 decimal places, and `%,.2f` adds thousands separators (4,200.00).

### Sample runs

`java SimpleCalculator`

```
=========== SIMPLE CALCULATOR ===========
Enter the first number: 20
Enter the second number: 6

---------------- RESULTS ----------------
Sum        : 26.00
Difference : 14.00
Product    : 120.00
Quotient   : 3.33
Remainder  : 2.00
=========================================
```

`java SimpleCalculator` with a zero divisor

```
=========== SIMPLE CALCULATOR ===========
Enter the first number: 15
Enter the second number: 0

---------------- RESULTS ----------------
Sum        : 15.00
Difference : 15.00
Product    : 0.00
Quotient   : Cannot divide by zero.
Remainder  : Cannot divide by zero.
=========================================
```

`java AverageCalculator`

```
=========== AVERAGE CALCULATOR ===========
Enter student name: Emmanuel Johnson Owajima
Enter score for Course 1: 70
Enter score for Course 2: 85
Enter score for Course 3: 90

----------------- RESULT -----------------
Student Name   : Emmanuel Johnson Owajima
Course 1 Score : 70.00
Course 2 Score : 85.00
Course 3 Score : 90.00
Total Score    : 245.00
Average Score  : 81.67
==========================================
```

`java AverageCalculator` with a score out of range

```
=========== AVERAGE CALCULATOR ===========
Enter student name: Emmanuel Johnson Owajima
Enter score for Course 1: 101
Enter score for Course 2: 50
Enter score for Course 3: 50
Invalid score. Each score must be between 0 and 100.
```

`java ItemCost`

```
=============== ITEM COST ===============
Enter item name: Exercise Book
Enter quantity: 12
Enter unit price (NGN): 350

=========== PURCHASE SUMMARY ===========
Item       : Exercise Book
Quantity   : 12
Unit Price : NGN 350.00
Total Cost : NGN 4,200.00
========================================
```

`java ItemCost` with an invalid quantity

```
=============== ITEM COST ===============
Enter item name: Exercise Book
Enter quantity: 0
Invalid quantity. Quantity must be at least 1.
```

### Test results

Each program was tested with normal, boundary and invalid inputs. All 20 test cases passed.

| Program | Test type | Input | Expected result | Result |
|---|---|---|---|---|
| SimpleCalculator | Normal | 20, 6 | Sum 26.00, Difference 14.00, Product 120.00, Quotient 3.33, Remainder 2.00 | Pass |
| SimpleCalculator | Boundary | 15, 0 | Sum, difference and product shown; "Cannot divide by zero." | Pass |
| SimpleCalculator | Normal | −8, 3 | Sum −5.00, Difference −11.00, Product −24.00, Quotient −2.67, Remainder −2.00 | Pass |
| SimpleCalculator | Normal | 7.5, 2.5 | Quotient 3.00 | Pass |
| SimpleCalculator | Invalid | abc | "Invalid input. Please enter a number." | Pass |
| AverageCalculator | Normal | 70, 85, 90 | Total 245.00, Average 81.67 | Pass |
| AverageCalculator | Boundary | 0, 0, 0 | Average 0.00 | Pass |
| AverageCalculator | Boundary | 100, 100, 100 | Average 100.00 | Pass |
| AverageCalculator | Invalid | 101, 50, 50 | "Each score must be between 0 and 100." | Pass |
| AverageCalculator | Invalid | 50, −1, 50 | "Each score must be between 0 and 100." | Pass |
| AverageCalculator | Invalid | seventy | "Invalid input. Please enter a number." | Pass |
| AverageCalculator | Invalid | Empty name | "Student name cannot be empty." | Pass |
| ItemCost | Normal | Exercise Book, 12, 350 | Total NGN 4,200.00 | Pass |
| ItemCost | Normal | Rice, 3, 1250.50 | Total NGN 3,751.50 | Pass |
| ItemCost | Boundary | Biro, 1, 0 | Total NGN 0.00 | Pass |
| ItemCost | Invalid | Quantity 0 | "Quantity must be at least 1." | Pass |
| ItemCost | Invalid | Quantity −4 | "Quantity must be at least 1." | Pass |
| ItemCost | Invalid | Quantity 2.5 | "Quantity must be a whole number." | Pass |
| ItemCost | Invalid | Price −50 | "Unit price cannot be negative." | Pass |
| ItemCost | Invalid | Empty item name | "Item name cannot be empty." | Pass |
