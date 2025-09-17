# Develop a software solution for a them park that automates the
# calculation of ticket prices based on the customer's age. The
# program should interactively prompt users to enter their age &
# apply appropriate discounts according to the following guidelines:

# Children under 5 years old: Ticket = $0
# Children aged 5 to 18 years old: Ticket = $20
# Adults aged 18 - 54 years old: Ticket = $60
# Seniors aged 55 years and older: Ticket = $50

# Your task is to design and implement a Python program that efficiently
# determines the ticket price based on the user's input age. This exercise
# will familiarize you with conditional statements & user input handling
# in programming, essential skills for building practical applications.

# Step 1. Create age variables through user input.
# Step 2. Apply costs depending on user input.
# Step 3. Display the new information.

age = int(input('Enter user age: '))
# age variable accepts integers from user input

if age < 5:
    # conditional statement set for user under age 5
    print('Admission costs $0 - FREE!')
    # costs are displayed for the user
elif age <= 18:
    # conditional statement set for user aged 5 - 17
    print('Admission costs $20 please!')
    # costs are displayed for the user
elif age <= 55:
    # conditional statement set for user aged 18 - 55
    print('Admission costs $60 please!')
    # costs are displayed for the user
else:
    # conditional statement for everyone else i.e. 55+
    print('Senior Discount Applied! Admission costs $50 please.')
    # costs are displayed for the user
