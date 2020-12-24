# simple-calculator.py

# Add a function called add
def add(a, b):
    return a + b

# Add a function called subtract
def subtract(a, b):
    return a - b

# Add a function called multiply
def multiply(a, b):
    return a * b

# Add a function called divide
def divide(a, b):
    return a / b

# Create a menu 
print("Please select operation") 
print("+")
print("-")
print("*")
print("/")

# Take input from the user 
choice = input("Enter operator to use:")
A = int(input("Enter first number: "))
B = int(input("Enter second number: "))
if choice  == '+':
    print(A, "+", B, "=", add(A,B))
elif choice == '-':
    print(A,"-",B,"=", subtract(A,B))
elif choice == "*": 
	print(A,"-",B,"=", multiply(A,B))					
elif choice == '/':
	print(A,"/",B,"=", divide(A,B))					
else:
	print("Invalid input")
