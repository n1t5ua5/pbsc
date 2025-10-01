# Assignment 1: International Currency Exchange Program 🌍
# Develop a program that takes an input value in US Dollars (USD)
# and converts it into three different foreign currencies: Euro,
# Chinese Yuan, and South Korean Won.

# The program must include three distinct functions, each accepting the USD
# amount as input and returning the calculated foreign currency amount:

# euro_converter
# def euro_converter(dollar_value):
#     return dollar_value * .86
# # yuan_converter
# def yuan_converter(dollar_value):
#     return dollar_value * 7.13
# # won_converter
# def won_converter(dollar_value):
#     return dollar_value * 1410.00

# All three functions should be called within the main part of the code.
# Use the following conversion rates:

# $1.00 USD→0.86 Euro
# $1.00 USD→7.13 Chinese Yuan
# $1.00 USD→1410.00 South Korean Won

# use input method for us currency
# define euro, yuan & won currency value compared with dollar
# display calculated information

# euro_converter
# def euro_converter(dollar_value):
#     return dollar_value * .86
# # yuan_converter
# def yuan_converter(dollar_value):
#     return dollar_value * 7.13
# # won_converter
# def won_converter(dollar_value):
#     return dollar_value * 1410.00

# dollar_value = float(input("Please type the dollar value here: "))
# print(euro_converter(dollar_value))
# print(yuan_converter(dollar_value))
# print(won_converter(dollar_value))

#################################################

# Assignment 2: Sales Commission Calculator Program 💰
# Create a program that uses a function to determine the total sales
# commission earned by a salesperson. The program should first prompt
# users to enter the salesperson's monthly sales total and their
# commission rate (as a decimal).
# A function, named calculate_commission, should be defined to accept
# two parameters: the monthly sales total and the commission rate,
# with a default value of 0.05 (5%) for the commission rate.
# The function should compute the total commission, applying a bonus
# multiplier for high performance:
# The base commission is the monthly sales total multiplied by the commission
# rate. If the monthly sales total is greater than $10,000, the salesperson
# earns a 1.25x bonus on their base commission (i.e., the final commission
# is 1.25 times the base commission). The function must then return the
# total final commission when called within the main program.

def calculate_commission(monthly_sales = 0, commission_rate = .05, bonus_amount = 1.25):
    if monthly_sales > 10000:
        print("Congratulations, you're getting a bonus this year!")
        return monthly_sales * commission_rate * bonus_amount
    else:
        print("Sorry, you didn't qualify for a bonus amount this year!")
        return monthly_sales * commission_rate

employee_total = float(input("Please type monthly sales total here: "))
commission = calculate_commission(employee_total)
print("Your total commission is:", commission)

# create calculate_commission function to find total sales earned by salesperson 
# user prompt for salesperson's monthly sales total & commission rate of .05 (float)
# conditional statement asking if commission total is greater than 10000 or not (else)
# include bonus for high performance of 1.25x the normal commission rate of .05
# return final total of commission by calling calculate_commission function