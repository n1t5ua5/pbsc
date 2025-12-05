# Create a Python module named employee_performance.py that includes three functions:
# Attendance_Score, Project_Completion, and Bonus_Calculation. Each function will perform
# specific tasks related to an employee's work metrics.

# The Attendance_Score function will accept the number of unexcused absences (integer)
# as input. If the absences are greater than 5, the function should print that the employee's
# attendance is 'Poor'; otherwise, it should print 'Good'.

# The Project_Completion function will accept the number of projects completed (integer)
# and the total number of assigned projects (integer). If the completion rate (completed / total)
# is less than 0.75 (75%), the function should print that the employee needs 'Improvement'
# in project completion; otherwise, it should print 'Excellent'.

# The Bonus_Calculation function will accept the employee's base salary (float or integer)
# and their years of service (integer). The function should calculate and print the total
# bonus amount by applying a $0.5\%$ increase to the base salary for each year of service.
# For instance, a 10-year veteran receives an additional $5\%$ of their base salary as a bonus.

# In your main program, import the employee_performance module and call each function using
# sample data that demonstrates the functionality of each, ensuring the output for the
# sample data provided reflects 4 unexcused absences, a project completion rate of
# 4 out of 5 projects, and a base salary of $60,000 with 8 years of service.

import employee_performance 

print(employee_performance.Attendance_Score(4))
print(employee_performance.Project_Completion(4, 5))
print(employee_performance.Bonus_Calculation(60000, 8))