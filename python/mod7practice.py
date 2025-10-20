# Module 7 Python Practice 💻
# https://youtu.be/gOMW_n2-2Mw?si=he8P5Zjfj5yXQukR

# Assignment 1. 🖥️

# Create a program that accepts a list of 7 integers as input and rearranges
# it by shifting all elements one position to the left, with the first element
# wrapping around to become the new last element. Employ a while loop to input
# these integers into the list, then display the updated list as a whole.
# (See example below)

# Sample console:
# >>Enter integer number 1 of 7: 11
# >>Enter integer number 2 of 7: 22
# >>Enter integer number 3 of 7: 33
# >>Enter integer number 4 of 7: 44
# >>Enter integer number 5 of 7: 55
# >>Enter integer number 6 of 7: 66
# >>Enter integer number 7 of 7: 77
# >>The list shifted one position to the left is: [22, 33, 44, 55, 66, 77, 11]

# create a list of integers as input
# rearrange list by shifting elements to the left & the 1st becomes last
# use a while loop to input integers in list
# print updated list

# int_list = []
# count = 0

# while count < 7:
#     user_response = input(f"Please enter seven unique integers {count + 1}: ")
#     int_list.append(int(user_response))
#     count += 1

# int_list = int_list[1:] + int_list[:1]

# print(f"New list with integers moved over one spot to the left is: {int_list}")


# Assignment 2. 🔢
# https://youtu.be/gOMW_n2-2Mw?si=he8P5Zjfj5yXQukR

# Create a program that prompts the user to input a list of names, separated
# by a semicolon (;). The program should then count and display the total
# number of names entered. Additionally, the program should identify and
# display the name that would come first (alphabetically) and the name that
# would come last (alphabetically) in the list.
# (See example below)

# Sample console:
# >>Enter a list of names, separated by semicolons: Alice;Bob;Charlie;David
# >>Total number of names entered: 4
# >>The name that comes first alphabetically is: Alice
# >>The name that comes last alphabetically is: David

# user_response = input("Enter a list of names, separated by semicolons: ")
# name_list = [name.strip() for name in user_response.split(';')]
# count = len(name_list)

# if name_list:
#     first_alphabetical = min(name_list)
#     last_alphabetical = max(name_list)
# else:
#     first_alphabetical = "Please exit the program & try again."
#     last_alphabetical = "Please exit the program & try again."

# print(f"The total number of names entered are: {count}")
# print(f"The name that comes first alphabetically is: {first_alphabetical}")
# print(f"The name that comes last alphabetically is: {last_alphabetical}")
