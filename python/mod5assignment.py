# Module 5 Assignment

# Write a Python program that determines whether a user qualifies for a
# mortgage based on their credit score, debt amount, and annual salary. To
# determine if a user qualifies for a mortgage, the program needs to verify
# that the information being entered is valid. Your loops must be used in
# these scenarios to check the validity of the information:
# If the credit score is below 400 or above 850, prompt the user to re-enter
# it until a valid score within this range is provided. If the total debt
# amount is less than $0, it cannot be accepted because negative debt amounts
# are not possible. Prompt the user to enter a valid debt amount. If the
# entered salary is less than $0, it is invalid because negative salaries are
# not permissible. Prompt the user again to enter a valid salary. Your program
# should specify the nature of invalid credit score entries, indicating
# whether they are too high or too low. For example, if a score of 399 is
# entered, the program should indicate that it is too low; if 900 is entered,
# it should indicate that it is too high. (See sample output for more details)
# Once these values are all accepted and valid, your program should now
# utilize an if statement to determine if the user qualifies for the mortgage.
# The user qualifies for the mortgage if:
# Credit score is 720 or more.
# Debt amount is $1,000 or less.
# Salary is $60,000 or more.

credit_score = float(input("What is your credit score?: "))
debt_amount = float(input("What is your debt amount?: "))
yearly_salary = float(input("What is your salary?: "))

while credit_score > 850 or credit_score < 400:
    if credit_score > 850:
        credit_score = float(input("Credit score too high, enter score < 850: "))
    if credit_score < 400:
        credit_score = float(input("Credit score too low, enter score > 400: "))

while debt_amount < 0:
    debt_amount = float(input("Debt amount too low, enter amount > 0: "))

while yearly_salary < 0:
    yearly_salary = float(input("Salary is too low, enter positive integer: "))

if credit_score > 400 and credit_score < 850 and debt_amount > 0 and yearly_salary > 60000:
    print("Congratulations, your application has been approved!")
else:
    print("Unfortunately, your application has not been approved, please try again.")

# Sample console:
# >>What is your credit score? 890
# >>Invalid credit score. This score is too high. Please enter a valid credit score. 730
# >>What is your debt amount? -1
# >>Your debt amount cannot be less than 0. Please enter a valid debt amount. 100
# >>What is your salary? -20
# >>Your salary cannot be negative. Please enter a valid salary. 70000
# >>Based on the information you entered, you qualify for a mortgage.
