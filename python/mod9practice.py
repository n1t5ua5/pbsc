# Create a hardware inventory system that asks the user to enter the total number of software licenses available
# and the number of licenses they want to assign to a team. The program should then calculate how
# many licenses will remain unassigned.
# Your program should use try-except blocks to handle potential exceptions that may arise.
# Your try-except blocks should be able to handle:

# If the user enters zero as the number of total available licenses, raise a ZeroDivisionError with a
# clear message to notify the user of the issue. If the user inputs a value with the incorrect data type
# for the available licenses or the number of licenses they wish to assign, raise an IndexError with
# a clear message to inform the user of the issue. If the user requests more licenses to assign than
# what is available, raise a KeyError with a message to inform the user of the mistake. Make sure to
# include an "except Exception:" block to catch any unexpected errors that might happen.
# This program should handle these errors effectively and give clear instructions to the user.
# If the user provides valid numbers for both the total number of licenses and the number of
# licenses they want to assign, and no errors occur, the program should correctly calculate
# and display the number of licenses remaining after the assignment under the except block.

# Sample Console: (Example below entails a situation of KeyError exception handling.)
# Enter the total number of software licenses available: 10 Enter the number of licenses to assign: 15 Error:
# Assignment cannot exceed the total number of available licenses.
# asks the user to enter total number of software licenses available + number of licenses for team
# execute try-except-else code block
# try block executes which,
# then except block handles three exceptions: ZeroDivisionError, IndexError, KeyError

# input first try statement
# ask user via input() method to enter total # of software licenses
# plus, how many they might need for a team
# if user enter wrong data type, raise indexerror
# if user enters zero, raise zerodivision error
# if user enters more requests than is available, raise keyerror
# program calculates data based on input & puts value in new variable
# except blocks execute & also include one block to catch unexpected errors
# if no errors persist, the program displays a message & the new updated license count

# try:
#     try:
#         licenseCount = int(input('Enter the total number of licenses available: '))
#         teamCount = int(input('Enter the total number of licenses your team needs: '))

#     except ValueError:
#         raise IndexError('Error: You must only enter an integer, please try again.')

#     if licenseCount == 0:
#         raise ZeroDivisionError('Error: You must enter an integer that is greater than 0.')

#     if teamCount > licenseCount:
#         raise KeyError('Error: Team count must not be greater than license count.')

#     updatedCount = licenseCount - teamCount

# except ZeroDivisionError as e:
#     print(f"\nError: {e}")

# except IndexError as e:
#     print(f"\nError: {e}")

# except KeyError as e:
#     print(f"\nError: {e}")

# except Exception as e:
#     print(f"\nUh oh... something's not right here...: {e}")

# else:
#     print(f"Success! New amount of licenses remaining: {updatedCount}")


# Determine the summation of all positive integers ranging from $1$ to $n$ using recursion.
# To achieve this, implement a recursive function that adds the current integer to the sum of
# the subsequent integers until $1$ is reached (counting down) or $n$ is reached (counting up).
# You must define the problem using the downward recursion approach
# (from $n$ down to $1$):$$S(n) = n + S(n-1)
# $$Sample Console:>>Enter a positive integer:
# 5>>The sum of all integers from 1 to 5 is: 15

# implement function, recursion,
# add and int

# def recursion(n):
#     if n <= 1:
#         return n
#     else:
#         return n + recursion(n-1)

# try:
#     n = int(input("Enter any integer: "))
#     print(recursion(n))

# except ValueError:
#     print("Please enter only whole numbers, thank you.")
