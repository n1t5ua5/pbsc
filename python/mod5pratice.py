# Module 05: Efficient Control Flow with Python Loops
# https://youtu.be/LJjqt8_RYS0?si=jcxrMigvGtezR9gc

for i in range(5):
    print(i)

print("_____________________")

for i in range(2, 6):
    print(i)

print("_____________________")

for i in range(1, 8, 2):
    print(i)

print("_____________________")

for letter in "Hello World":
    print(letter)

print("_____________________")

# theSum = 0

# for i in range(3):
#     num = int(input("Enter a number: "))
#     theSum = theSum + num

# print(theSum)

print("_____________________")

num = 2
while num < 10:
    print(num)
    num = num + 2

print("_____________________")

name = "Jack"

while name == "Jack":
    print("You are Jack!")
    name = input("Enter another name to see if you are also Jack.")

print("_____________________")

GPA = float(input("What is your GPA? "))
while GPA < 0 or GPA > 4.00:
    GPA = float(input("Invalid GPA. Please enter a valid GPA. "))
print("Thank you.")
