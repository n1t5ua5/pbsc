# Mod 10 Assignment
# https://youtu.be/72uVUU1boKo?si=DLs8glDLI5JLgGek

# Determine the summation of all odd integers ranging from 1 to n using recursion. To achieve
# this, implement a recursive function that adds the current odd integer to the sum of the
# subsequent odd integers until the upper limit n is reached. Ensure that your function
# correctly handles the base case and properly accumulates the result.

# Sample Console:
# >>Enter a positive integer: 7
# >>The sum of all odd integers from 1 to 7 is: 16

# adds current odd int to sum of subsequent odd integers until upper limit n


def moduleTen(n):
    if n <= 0:
        return 0
    elif n % 2 == 0:
        return moduleTen(n-1)
    else:
        return n + moduleTen(n-2)
    
try:
    n = int(input("Enter a positive integer: "))
    if n < 1:
        print("Please only use positive integers.")
    else:
        result = moduleTen(n)
        print(f"The sum of all odd integers from 1 to {n} is: {result}")
        
except ValueError:
    print("Please try again later, thank you kindly.")