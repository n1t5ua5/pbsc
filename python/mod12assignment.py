# Mod 12 Assignment: Importing Modules
# YouTube Link: https://youtu.be/GxCXiSkm6no?si=uPT_4D2v9neb78yW

# Create a Python module named vehicle.py that includes three functions: Reliability, Fuel_Efficiency, and Resale_Value.
# Each function will perform specific tasks related to the vehicle characteristics inputted.

# Reliability Function:
# Purpose: Determine if a vehicle is classified as reliable or unreliable based on its age.
# Parameters: Accept a single parameter representing the vehicle’s age (in years).
# Functionality: If the vehicle is older than 10 years, the function should state that the vehicle is unreliable.
# Alternatively, if the vehicle is 10 years old or younger, it should indicate that the vehicle is reliable.

# Fuel_Efficiency Function:
# Purpose: Assess whether a vehicle is fuel efficient.
# Parameters: Accept a single parameter for the vehicle’s miles per gallon (MPG) rating.
# Functionality: If the vehicle’s MPG rating is greater than or equal to 30, classify it as fuel efficient;
# otherwise, print "not fuel efficient."

# Resale_Value Function:
# Purpose: Calculate the current resale value of a vehicle based on its original price and age.
# Parameters: Accept two parameters: the vehicle’s original price and its age (in years).
# Functionality: Apply a 3% annual depreciation to the original price for each year of the vehicle's age.
# For example, a 5-year-old vehicle will be worth 15% less. If the vehicle is 0 years old, the price remains unchanged.
# In your main program, import the vehicle module and call each function. Ensure that each function provides the
# expected information based on sample data.

# Sample console:
# >>Enter the vehicle's age in years. 3
# >>Enter the vehicle's MPG rating. 34
# >>Enter the vehicle's original cost. 45,000
# >>Your car is reliable.
# >>Your car is fuel-efficient.
# >>Your car is now worth $40,950

import vehicle

age = int(input("Enter the vehicle's age in years: "))
mpg = int(input("Enter the vehicle's MPG rating: "))
price = int(input("Enter the vehicle's original cost: "))

print(vehicle.Reliability(age))
print(vehicle.Fuel_Efficiency(mpg))
print(vehicle.Resale_Value(price, age))