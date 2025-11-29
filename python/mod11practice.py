# Module 11 Practice: Utilizing Files in Python 📂
# https://youtu.be/Uh2ebFW8OYM?si=TThz3t18heb7fdUz

# Create a Python program that interacts with the user to collect 7 integer numbers representing the monthly sales figures
# (in thousands of dollars) for employees. The program should validate each sales figure to ensure it falls within the
# acceptable range of 0 to 100000. If an invalid figure is entered, the program must prompt the user to re-enter it (see
# sample output for example). During each iteration of the sales figure entry process, the program will check if
# the sales figure entered is 50,000 or higher. If a sales figure meets this criterion, the program will prompt the
# user to enter the student's ID number (which can be a string, like 'E1005'). The ID numbers of these
# high-performing employees should be stored in a file named 'high-performers.txt'. For sales figures
# that are BELOW 50000, the program will simply acknowledge the figure and move on to the next input.

# By the program's conclusion, 'high-performers.txt' should contain the ID numbers of all employees
# who achieved a sales figure of 50000 or higher. Sample console below:

# Please enter the employee's monthly sales (0-100k): 120000 Invalid sales figure. Please try again (0-100k).
# Please enter the employee's monthly sales (0-100k): 55 What is this employee's ID? E203
# Please enter the employee's monthly sales (0-100k): 78 What is this employee's ID? E199


num_of_employees = 7
high_performance_bar = 50000
file_name = 'high-performers.txt'

def get_monthly_sales():
    """
    The program accepts input from a user regarding a monthly sales total.
    """
    while True:
        try: 
            sales = input("Please enter the employee's monthly sales (0-100k): ")
            monthly_sales = int(sales)
            if 0 <= monthly_sales <= 100000:
                return monthly_sales
            else:
                print("Invalid sales figure. Please try again (0-100k): ")
        except:
            ValueError
            print("Invalid input, enter whole numbers only please.")


def file_store(id_list):
    """
    Stores high performer list into high-performers.txt' file.
    """
    try:
        with open(file_name, 'w') as f:
            for employee_id in id_list:
                f.write(f"{employee_id}, \n")
        print("Successfully saved users to the high performer list file.")       
    except:
        TypeError
        print("Please only input .txt file types next time.")


if __name__ == "__main__":

    high_performers_ids = []
    high_performers_sales = []

    for i in range(num_of_employees):
        sales_figure = get_monthly_sales()

        if sales_figure >= high_performance_bar:

            employee_id = input("Please input their employee ID: ")
    
            high_performers_ids.append(employee_id)
            high_performers_sales.append(sales_figure)

        else:
            pass
    
    file_store(high_performers_ids)

    print(f"Alrighty then! Here is the list of high performers: {len(high_performers_ids)} - {high_performers_sales}.")