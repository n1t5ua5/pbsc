# Mod8 Assignment: Object Oriented Programming (OOP)
# https://youtu.be/JeznW_7DlB0?si=N4z84uN8HoCIyySa

# Create a class named BankSystem that simulates basic banking operations. The
# class should have two attributes: customer_name and starting_balance, which
# are set when the class is instantiated.

# Your class should include functions that are able to:
# Calculate Deposits: Adds a specified amount to the customer's balance.
# Process Withdrawals: Deduct a specified amount from the customer's balance.
# If the withdrawal amount exceeds the current balance, display a message
# indicating that the transaction cannot be completed. Ensure that NO funds
# are withdrawn if the balance would drop below zero.
# Display Customer Information: Returns the customer’s name & current balance.
# These items should be returned/printed from the function.
# After implementing the class, write code to:

# Create 2 BankSystem objects w different customer names & starting balances.
# Perform a deposit operation on 1 object & withdrawal operation on the other.
# Display Customer Information for both objects to show their final balances.

# Sample Console:
# (Based on an Object with a name of Devin and a starting value of $1,000. )
# >>What is your deposit amount? 200
# >>1200
# >>What is your withdrawal amount? 1300
# >>Insufficient Funds.
# >>Hello Devin. Your current Balance is $1,200.


class BankSystem:
    """
        The BankSystem class performs basic banking functions like...
        Withdrawing money, depositing money & displaying customer data!
        Attributes: customer_name & starting_balance.
    """

    def __init__(self, name, balance):
        self.customer_name = name
        self.starting_balance = balance

    def deposit(self, total):
        self.starting_balance = self.starting_balance + total

    def withdraw(self, total):
        if total > self.starting_balance:
            print("We regret to inform you that you have insufficient funds.")
        else:
            self.starting_balance = self.starting_balance - total

    def display_balance(self):
        print("Good day", self.customer_name)
        print("Your total balance is $", self.starting_balance)


b1 = BankSystem("Landon", 1000)
b1.withdraw(10000)
b1.display_balance()
