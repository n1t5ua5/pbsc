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
#         print("Your car make is", self.make, ", your car's model is",
#         self.model, " & your car's year is", self.year)


# myCar = Car("Toyota", "Cambo", 2009)
# myCar2 = Car("BMW", "3 Series", 2020)

# myCar.displayInfo()
# myCar2.displayInfo()


# Mod8 Discussion: Python Object Oriented Programming in 10 Minutes
# https://youtu.be/q2SGW2VgwAM?si=PbGk4a4TbKUKqq8-

# from mod8practiceB import Car

# car_1 = Car("Chevy", "Silverado", 2021, "Blue")
# car_2 = Car("Toyota", "Cambo", 2022, "Red")

# car_1.drive()
# car_2.stop()


# Mod8 Assignment Practice: Object Oriented Programming (OOP)
# https://youtu.be/JeznW_7DlB0?si=N4z84uN8HoCIyySa


# EXAMPLE 1
# class Dog:

#     def __init__(self, name, age):
#         self.name = name
#         self.age = age

#     def get_name(self):
#         return self.name

#     def get_age(self):
#         return self.age

#     def set_age(self, age):
#         self.age = age


# d = Dog("Sparky", 34)
# d.set_age(23)
# print(d.get_age())


# class Student:
#     def __init__(self, name, age, grade):
#         self.name = name
#         self.age = age
#         self.grade = grade  # 0 - 100

#     def get_grade(self):
#         return self.grade


# EXAMPLE 2
# class Course:
#     def __init__(self, name, max_students):
#         self.name = name
#         self.max_students = max_students
#         self.students = []

#     def add_student(self, student):
#         if len(self.students) < self.max_students:
#             self.students.append(student)
#             return True
#         return False

#     def get_average_grade(self):
#         value = 0
#         for student in self.students:
#             value += student.get_grade()

#         return value / len(self.students)


# s1 = Student("Tim", 19, 95)
# s2 = Student("Bill", 20, 75)
# s3 = Student("Jill", 21, 85)

# course = Course("Science", 2)
# course.add_student(s1)
# course.add_student(s2)
# print(course.add_student(s3))
# print(course.get_average_grade())


# EXAMPLE 3
# class Animal:
#     def __init__(self, name, age):
#         self.name = name
#         self.age = age

#     def show(self):
#         print(f"I am {self.name} & I am {self.age} years old.")

#     def speak(self):
#         print("I don't know what I say...")


# class Cat(Animal):
#     def __init__(self, name, age, color):
#         super().__init__(name, age)
#         self.color = color

#     def speak(self):
#         print("Meow!")

#     def show(self):
#         print(f"I'm {self.name}, I'm {self.age} years old & "
#               f"I'm {self.color}!")


# class Dog(Animal):
#     def speak(self):
#         print("Bark!")


# class Fish(Animal):
#     pass


# a = Animal("Spot", 25)
# a.speak()
# c = Cat("Lucy", 35, "Brown")
# c.show()
# d = Dog("Bruno", 45)
# d.speak()
# f = Fish("Bubbles", 55)
# f.speak()


# EXAMPLE 4
# class Person:
#     number_of_people = 0
#     GRAVITY = -9.8

#     def __init__(self, name):
#         self.name = name
#         Person.add_person()

#     @classmethod
#     def number_of_people_(cls):
#         return cls.number_of_people

#     @classmethod
#     def add_person(cls):
#         cls.number_of_people += 1


# p1 = Person("Tim")
# p2 = Person("Jim")
# print(Person.number_of_people_())


# EXAMPLE 5
# class Math:

#     @staticmethod
#     def add5(x):
#         return x + 5

#     @staticmethod
#     def add10(x):
#         return x + 10

#     @staticmethod
#     def pr():
#         print("run")


# Math.pr()


# define variables
# ask user via input() method to enter total # of software licenses
# plus, how many they might need for a team
# program calculates data based on input
# try block executes to ask the questions below
# if user enters zero, raise zerodivision error
# if user enter wrong data type, raise indexerror
# if user enters more requests than is available, raise keyerror
# include except Exception block to catch unexpected errors
# program displays the new correct data if there are no errors
