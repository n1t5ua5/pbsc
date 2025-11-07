# Create a car rental system that asks the user to enter the total number of cars available
# and the number of cars they want to rent. The program should then calculate how many cars will remain available.
# Your program should use try-except blocks to handle potential exceptions that may arise.
# Your try-except blocks should be able to handle:

# If the user enters zero as the number of available cars, raise a ValueError with a clear message to notify the user of the issue.
# If the user inputs a value with the incorrect data type for the available cars or the number of cars they wish to rent,
# raise a TypeError with a clear message to inform the user of the issue.
# If the user requests more cars than what is available, raise a SyntaxError with a message to inform the user of the mistake.
# Make sure to include an "except Exception:" block to catch any unexpected errors that might happen.
# This program should handle these errors effectively and give clear instructions to the user.
# If the user provides valid numbers for both the total number of cars and the number of cars they want to rent,
# and no errors occur, the program should correctly calculate and display the number of cars
# remaining after the rental under the except block.

# Sample Console:
# (Example below entails a situation of ValueError exception handling.)
# >>Enter the total number of cars available for rent: 0
# >>Error: The number of available cars cannot be zero.

try:
    carsAvailable = int(input('Please enter the total number of cars available: '))
    rentalTotal = int(input('Please enter the total number of cars you want to rent: '))

        if carsAvailable == 0:
            raise ValueError('Error: The number of available cars cannot be zero.')

        if rentalTotal > carsAvailable:
            raise SyntaxError('Error: You cannot enter a rental total that is greater than the number of cars available.')

        updatedCount = carsAvailable - rentalTotal

except ValueError as e:
    print(f"\nError: {e}")

except TypeError as e:
    print(f"\nError: {e}")

except SyntaxError as e:
    print(f"\nError: {e}")

except Exception as e:
    print(f"\nUh oh... something's not right here... {e}")

else:
    print(f"Alrighty then! The updated number of cars available is: {updatedCount}")