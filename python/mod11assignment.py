# Module 11 Assignment: Utilizing Files in Python 📂
# https://youtu.be/Uh2ebFW8OYM?si=RX_jApddSwlhEA1w
# https://www.onlinegdb.com/KDZ_avKDI

# Create a Python program that interacts with the user to collect 5 float numbers
# representing GPAs of students. The program should validate each GPA to ensure
# it falls within the acceptable range of 0 to 4.00. If an invalid GPA is entered,
# the program should prompt the user to re-enter it (see sample output for example).

# During each iteration of the GPA entry process, the program will check if the GPA
# entered is 2.00 or higher. If a GPA meets this criterion, the program will prompt
# the user to enter the student's name. The names of these high-achieving students
# should be stored in a file named 'ConfirmedGraduate.txt'. For GPAs that are
# BELOW 2.00, the program will simply acknowledge the GPA and move on to the next input.

# By the program's conclusion, 'ConfirmedGraduate.txt' should contain the names of
# all students who achieved a GPA over 2.00.". Sample console below:

# >> Please enter student's GPA. 900
# >>Invalid GPA. Please try again. 3.2
# >>What is this student's name? Devin
# >>Please enter student's GPA. 2.3
# >>Noted. Thank you. 
# >>Please enter student's GPA. 3.4
# >>What is this student's name? Miranda

students = 5
gpa_threshold = 2.00
file_name = 'ConfirmedGraduates.txt'

def graduate_calculator():
    """
    The program accepts input from user regarding their current GPA.
    """
    while True:
        try:
            GPA = float(input("Please enter student's GPA: "))
            graduate_list = float(GPA)
            if 0 <= graduate_list <= 4.00:
                return graduate_list
            else:
                print("Invalid GPA. Please try again.")
        except:
            ValueError
            print("Invalid input, enter GPA as a floating point (decimal) number.")


def file_store(student_names):
    """
    Stores the high performing GPAs into the 'ConfirmedGraduates.txt' file.
    """ 
    try:
        with open(file_name, 'w') as f:
            for student_name in student_names:
                f.write(f"{student_name}, \n")
        print("Successfully saved users to the 'ConfirmedGraduates.txt' file.")
    except:
        TypeError
        print("Please only input .txt file types next time.")


if __name__ == "__main__":

    full_grad_list = []

    for i in range(students):
        grade_figures = graduate_calculator()

        if grade_figures >= gpa_threshold:

            student_name = input("What is this student's name? ")

            full_grad_list.append(student_name)

        else:
            print("Noted. Thank you.")

    file_store(full_grad_list)

print(f"Alrighty then! Here is the full list of graduates: {full_grad_list}.")