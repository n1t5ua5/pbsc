# Develop a software solution for a movie theater that automates the
# calculation of ticket prices based on the customer's age and the
# time of day. The program should interactively prompt users to
# enter their age and the movie time (matinee or evening) and
# apply appropriate discounts according to the following guidelines:

# Matinee Show (before 5:00 PM):
# Children under 12 years old: Tickets are $8.
# Adults aged 12 and older: Tickets are $12.
# Evening Show (5:00 PM and later):
# Children under 12 years old: Tickets are $10.
# Adults aged 12 to 64 years old: Tickets are $15.
# Seniors aged 65 years and older: A special price of $10 applies.

# Your task is to design and implement a Python program that efficiently
# determines the ticket price based on the user's input age and showtime.
# This exercise will familiarize you with nested conditional statements
# and user input handling in programming, essential skills for
# building practical applications.

# Step 1. Create age & showtime variables through user input
# Step 2. Apply discount to user input.
# Step 3. Display the new information.

age = int(input('Enter user age: '))
showtimes = int(input('Enter 1 for Matinee or 2 for Evening: '))
if showtimes == 1:
    if age >= 12:
        print('One adult matinee ticket purchased for $12!')
    else:
        print('One youth matinee ticket purchased for $8!')
else:
    if age < 12:
        print('One youth evening ticket purchased for $10!')
    elif age > 65:
        print('One senior evening ticket purchased for $10!')
    else:
        print('One adult evening ticket purchased for $15!')

