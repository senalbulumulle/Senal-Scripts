# display-calendar.py

import calendar

# Make a variable called yy which contains the year
yy = 2020

# Make a variable called mm which contains the month 
mm = 12

# To take month and year input from the user 
# yy = int(input("Enter year: "))
# mm = int(input("Enter month: "))

# Display the calendar based from the yy variable and 
# the mm variable 
print(calendar.month(yy, mm))