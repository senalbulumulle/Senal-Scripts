# leap-year.py

# Make a variable called year to specify a year
year = 2021

# To get year (integer input) from the user 
# year = int(input("Enter a year: "))

# Make an if-else statement
if (year % 4) == 0:
    if (year % 100) == 0:
        if (year % 400) == 0:
            print("{0} is a leap year".format(year))
        else:
            print("{0} is not a leap year".format(year))
    else:
        print("{0} is a leap year".format(year))
else:
    print("{0} is not a leap year".format(year))