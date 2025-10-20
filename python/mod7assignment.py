# Module 7 Python Assignment 💻
# https://youtu.be/gOMW_n2-2Mw?si=he8P5Zjfj5yXQukR

# Assignment 1.

# Create a program that accepts a list of 5 integers as input and rearranges
# it by swapping the first and last numbers. Employ a loop to input these
# integers into the list, then display the updated list as a whole.
# (See example below)

# Sample console:
# >>Enter a string of numbers. 2
# >>Enter a string of numbers. 4
# >>Enter a string of numbers. 6
# >>Enter a string of numbers. 8
# >>Enter a string of numbers. 10
# >>The first and last numbers swapped is: [10, 4, 6, 8, 2]

int_list = []
count = 0

while count < 5:
    user_response = input(f"Enter 5 numbers, one at a time {count + 1}: ")
    int_list.append(int(user_response))
    count += 1

int_list[0], int_list[-1] = int_list[-1], + int_list[0]

print(f"The new list has the first & last numbers swapped: {int_list}")


# Assignment 2.
# https://youtu.be/gOMW_n2-2Mw?si=he8P5Zjfj5yXQukR

# Create a program that prompts the user to input a list of numbers, separated
# by commas. The program should then calculate and display the total and
# average of these numbers. Additionally, the program should identify and
# display the largest and smallest numbers in the list.

user_response = input("Input list of numbers, separated by comma: ").split(',')
num_list = [float(num.strip()) for num in user_response]

if num_list:
    list_total = sum(num_list)
    list_average = list_total / len(num_list)
    largest_num = max(num_list)
    smallest_num = min(num_list)

    print(f"The total number from your list is: {list_total}")
    print(f"The average number from your list is: {list_average}")
    print(f"The largest number from your list is: {largest_num}")
    print(f"The smallest number from your list is: {smallest_num}")

else:
    print("Please clear the terminal & try again later.")
