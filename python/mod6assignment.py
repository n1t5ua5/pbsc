# Please complete BOTH Assignment 1 and Assignment 2.

# Assignment 1.

# Develop a program that takes input values in USD dollars and converts them
# into three different currencies: Pound Sterling, Japanese Yen, and Canadian
# Dollar. The program should include three distinct functions named
# pound_conversion, japanese_conversion, and canadian_conversion, all of which
# should be called within the main part of the code and return the appropriate
# exchange amounts. Conversion rates are provided below:

# $1.00 USD --> $0.77 Pound Sterling
# $1.00 USD --> $157.50 Japanese Yen
# $1.00 USD --> $1.37 Canadian Dollar
# (Values are based as of August 2024)

# def pound_converter(dollar_amount):
#     return dollar_amount * 0.77

# def yen_converter(dollar_amount):
#     return dollar_amount * 157.50

# def canadian_converter(dollar_amount):
#     return dollar_amount * 1.37

# dollar_amount = float(input("Please enter a currency amount in U.S. dollars: "))
# print(pound_converter(dollar_amount))
# print(yen_converter(dollar_amount))
# print(canadian_converter(dollar_amount))

# Assignment 2.

# Create a program that uses a function to calculate the gross pay for
# full-time employees in an organization. The program should first prompt
# users to enter their hourly rate and the number of hours worked. A function
# should then be defined to accept two parameters: the hourly rate and the
# hours worked, with a default value of 40 hours representing a standard
# workweek. The function should compute the gross pay, where the base pay for
# regular hours is the hourly rate, and any hours worked beyond 40 hours are
# paid at a 1.5x rate of the regular hourly pay; it should then return the
# total gross pay when called within the main program.

def calculate_gross_pay(hours_worked=0, hourly_rate=100.00, bonus_rate=1.5):
    if hours_worked > 40:
        print("Congratulations, you're getting a bonus for working overtime!")
        return hours_worked * hourly_rate * bonus_rate
    else:
        print("Sorry, you didn't qualify for a bonus amount, but you still got paid!")
        return hourly_rate * hours_worked


employee_total = float(input("Please input the number of hours you worked: "))
total_hours_worked = calculate_gross_pay(employee_total)
print("Your gross pay for this week:", total_hours_worked)
