def Reliability(age):
    if age > 10:
        print("Your car is unreliable.")
    else:
        print("Your car is reliable.")
    return True

def Fuel_Efficiency(mpg_rating):
    if mpg_rating >= 30:
        print("Your car is fuel efficient.")
    else:
        print("Not fuel efficient")
    return True

def Resale_Value(price, age):
        if age > 0:
            depreciation = price * 0.03 * age
            current_value = price - depreciation
            print(f"Your car is now worth ${current_value}.")
        else:
            print("Price remains unchanged.")
        return True