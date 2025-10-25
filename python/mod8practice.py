# Mod8 Lecture: Foundations of Object-Oriented Programming
# https://youtu.be/wEdgZF80eso?si=euhwDWEXIRRlCF2l

# class Person:
#     def __init__(self, name, age):
#         self.name = name
#         self.age = age

#     def intro(self):
#         print("Hello", self.name)


# Person1 = Person("Billy", 20)
# Person2 = Person("Mandy", 22)

# print(Person1.name)
# print(Person2.age)

# Person1.intro()
# Person2.intro()


# class mathCalculator:
#     def __init__(self, num1, num2):
#         self.num1 = num1
#         self.num2 = num2

#     def addition(self):
#         sumOfNum = self.num1 + self.num2
#         print("The sum of these numbers is", sumOfNum)

#     def subtraction(self):
#         subtract = self.num1 - self.num2
#         print("The difference between these two numbers is", subtract)

#     def product(self):
#         product = self.num1 * self.num2
#         print("The product of these two numbers are", product)

#     def quotient(self):
#         quotient = self.num1 / self.num2
#         print("The quotient of these two numbers is", quotient)


# Problem1 = mathCalculator(50, 10)
# Problem1.addition()
# Problem1.subtraction()
# Problem1.product()
# Problem1.quotient()

# Problem2 = mathCalculator(100, 7)
# Problem2.addition()
# Problem2.subtraction()
# Problem2.product()
# Problem2.quotient()


# class Car:
#     def __init__(self, make, model, year):
#         self.make = make
#         self.model = model
#         self.year = year

#     def displayInfo(self):
#         print("Your car make is", self.make, ", your car's model is", self.model, " & your car's year is", self.year)


# myCar = Car("Toyota", "Cambo", 2009)
# myCar2 = Car("BMW", "3 Series", 2020)

# myCar.displayInfo()
# myCar2.displayInfo()


# Mod8 Discussion: Python Object Oriented Programming in 10 Minutes
# https://youtu.be/q2SGW2VgwAM?si=PbGk4a4TbKUKqq8-

from mod8practiceB import Car

car_1 = Car("Chevy", "Silverado", 2021, "Blue")
car_2 = Car("Toyota", "Cambo", 2022, "Red")

car_1.drive()
car_2.stop()
