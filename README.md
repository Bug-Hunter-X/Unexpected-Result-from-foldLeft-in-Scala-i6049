# Scala foldLeft Bug
This repository demonstrates a common error when using the `foldLeft` function in Scala.  The example shows how an improper use of foldLeft can lead to an incorrect result due to an issue with handling the accumulator and the operations on elements. The solution provides a corrected approach to achieve the intended outcome.

## Bug Description
The provided `foldLeft` incorrectly handles odd and even numbers, leading to an unexpected negative sum instead of the expected sum. The problem arises from directly subtracting odd numbers from the accumulator instead of a more robust approach.

## Solution
The solution uses a more clear approach, separating the handling of odd and even numbers for better clarity and correctness.  It prevents the subtraction issue and produces the intended outcome.
