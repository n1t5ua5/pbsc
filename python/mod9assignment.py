# Module Nine Assignment
# Lesson: https://youtu.be/PHzm_Iox1mE


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
    print(f"Alrighty then! The updated number of cars available is now: {updatedCount}")
