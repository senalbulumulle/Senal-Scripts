## area-of-triangle.py

## Make a variable called a
a = 5

## Make a variable called b
b = 6

## Make a variable called c
c = 7

## Uncomment below to take inputs from the user 
# a = float(input('Enter first side: '))
# b = float(input('Enter second side: '))
# c = float(input('Enter third side: '))

## Calculate the semi-perimeter
s = (a + b + c) / 2

## Calculate the area
area = (s*(s-a)*(s-b)*(s-c))** 0.5

## Display the area of the triangle
print('The area of the triangle is %0.2f' %area)
