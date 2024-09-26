# Java Problem Set Solution

#**Matriculation Number:** 7213424

## Project Description

This project contains the solutions to four Java programming problems, which involve topics like language basics, control flow, object basics, character and string analysis, and sorting algorithms. Each problem addresses a specific concept in Java, from basic math operations to object-oriented programming and file handling.

### Problem 1: Language Basics - Volume Calculation
This problem calculates the volume of the Earth and the Sun, and the ratio of the volume of the Sun to the Earth, treating both as spheres. The formula used for the volume of a sphere is:
\[ V = \frac{4}{3} \pi r^3 \]
Where `r` is the radius of the sphere.

**Input:**
- Diameter of the Earth: 7600 miles
- Diameter of the Sun: 865,000 miles

**Output:**
- The volume of the Earth in cubic miles
- The volume of the Sun in cubic miles
- The ratio of the volume of the Sun to the volume of the Earth

### Problem 2: Language Basics - Prime Number Calculation
This problem involves checking for prime numbers up to a given value (50 in this case). The code is optimized to check divisors only up to the square root of the number and uses labeled `continue` statements for flow control.

**Features:**
- No `isPrime` variable is used.
- Prime checking is optimized using the square root of the number.
- Uses a labeled `continue` for skipping non-prime numbers.

### Problem 3: Object Basics - Character Analysis
This problem involves analyzing a Shakespearean soliloquy to count the number of vowels, consonants, and spaces. The program iterates over each character of the string to perform the counting.

**Text Analyzed:**
- "To be or not to be, that is the question; Whether 'tis nobler in the mind to suffer..."

**Output:**
- Total number of vowels
- Total number of consonants
- Total number of spaces

### Problem 4: Object Basics - Sorting Words
This problem extracts words from the soliloquy analyzed in Problem 3 and sorts them alphabetically. The sorting is performed using a bubble sort algorithm, which iteratively compares and swaps adjacent elements.

**Definition of a Word:**
- A word is defined as any sequence of alphanumeric characters separated by non-alphanumeric characters.

**Output:**
- A list of words from the soliloquy, sorted in alphabetical order.

## Development Environment

- **Java Version:** OpenJDK 11
- **IDE:** IntelliJ IDEA 2023.1 / Eclipse / Visual Studio Code
- **Operating System:** Windows 10 / Linux Ubuntu 20.04

## How to Run the Program

1. Clone the repository from GitHub.
2. Compile and run the individual classes for each problem:
   - `SphereVolume.java` for Problem 1
   - `PrimeNumbers.java` for Problem 2
   - `StringCharacters.java` for Problem 3
   - `SortWords.java` for Problem 4
3. The results for each problem will be printed in the console or saved in files where applicable.

## Files

- `SphereVolume.java`: Solution to Problem 1.
- `PrimeNumbers.java`: Solution to Problem 2.
- `StringCharacters.java`: Solution to Problem 3.
- `SortWords.java`: Solution to Problem 4.
- `README.md`: This file containing the project description.

## Notes

If you make any assumptions while solving the problems, they are documented in the respective code comments. All solutions adhere to the problem descriptions and use standard Java libraries for execution.
