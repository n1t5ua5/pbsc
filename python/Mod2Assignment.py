# Design a program that prompts the user to enter two numbers & displays their
# sum, difference, product, & quotient (if divisible), formatted to
# two decimal places.

a = float(input("Enter first number: "))
# declare first variable by entering float via input
b = float(input("Enter second number: "))
# declare second variable by entering float via input

print("Sum:", a + b)
# display sum of two numbers
print("Difference:", a - b)
# display difference of two numbers
print("Product:", a * b)
# display product of two numbers
if b != 0:
    # check if second number is NOT zero to avoid DivisionByZeroError
    print("Quotient:", a / b)
    # display quotient of two numbers
