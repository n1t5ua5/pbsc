# # Module 05: Efficient Control Flow with Python Loops
# # https://youtu.be/LJjqt8_RYS0?si=jcxrMigvGtezR9gc

# for i in range(5):
#     print(i)

# print("_____________________")

# for i in range(2, 6):
#     print(i)

# print("_____________________")

# for i in range(1, 8, 2):
#     print(i)

# print("_____________________")

# for letter in "Hello World":
#     print(letter)

# print("_____________________")

# # theSum = 0

# # for i in range(3):
# #     num = int(input("Enter a number: "))
# #     theSum = theSum + num

# # print(theSum)

# print("_____________________")

# num = 2
# while num < 10:
#     print(num)
#     num = num + 2

# print("_____________________")

# name = "Jack"

# while name == "Jack":
#     print("You are Jack!")
#     name = input("Enter another name to see if you are also Jack.")

# print("_____________________")

# GPA = float(input("What is your GPA? "))
# while GPA < 0 or GPA > 4.00:
#     GPA = float(input("Invalid GPA. Please enter a valid GPA. "))
# print("Thank you.")


# Module 5 Assignment Prep

# Write a Python program that determines whether a user is approved for a car
# loan based on their credit history length, monthly expenses, and monthly
# income. To approve the user, the program must first verify that the
# information being entered is valid. Your loops must be used in these
# scenarios to check the validity of the information: If the credit history
# length (in years) is less than 1 or greater than 50, prompt the user to
# re-enter it until a valid length within this range is provided. If the
# monthly expenses are less than $0, they cannot be accepted because negative
# expenses are not possible. Prompt the user to enter a valid amount. If the
# entered monthly income is less than $0, it is invalid because a negative
# income is not permissible. Prompt the user again to enter a valid income.
# Your program should specify the nature of invalid credit history entries,
# indicating whether they are too high or too low. For example, if a length of
# 0 is entered, the program should indicate that it is too low; if 60 is
# entered, it should indicate that it is too high. Once these values are all
# accepted and valid, your program should now utilize an if statement to
# determine if the user is approved for the loan. The user is approved if:
# Credit history length is 5 years or more.
# Monthly expenses are $1,500 or less.
# Monthly income is $2,500 or more.

credit_history = float(input("Enter credit history length: "))
monthly_expenses = float(input("Enter monthly expenses: "))
monthly_income = float(input("Enter monthly income: "))

while credit_history < 1 or credit_history > 50:
    if credit_history < 1:
        credit_history = float(input("Credit history length is too short, must be at least 1 year: "))
    if credit_history > 50:
        credit_history = float(input("Credit history length is too long, must be no more than 50 years: "))

while monthly_expenses < 0:
    monthly_expenses = float(input("Monthly expenses cannot be less than zero, enter new expense total: "))

while monthly_income < 0:
    monthly_income = float(input("Monthly income cannot be less than zero, enter new income total: "))

if credit_history >= 5 and monthly_expenses <= 1500 and monthly_income >= 2500:
    print("Congratulations, your application has been approved!")
else:
    print("Unfortunately, your credit application was not approved, please try again next year.")

# Sample console:

# >>How many years is your credit history? 0
# >>Invalid credit history. This length is too low. Please enter a valid length. 55
# >>Invalid credit history. This length is too high. Please enter a valid length. 7
# >>What are your total monthly expenses? -100
# >>Your monthly expenses cannot be less than 0. Please enter a valid amount. 1000
# >>What is your monthly income? -50
# >>Your monthly income cannot be negative. Please enter a valid income. 3000
# >>Based on the information you entered, you are approved for the loan.
