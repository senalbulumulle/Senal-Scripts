'''
This is a remix, which is used as a modifification allowing the ability
to output the numbers into a .txt file. 

'''


import math
import os
import sys
import json
import time

first_number  = 20
second_number = 20


first_container = first_number + second_number


print(first_container)


os.system("touch result.txt")


with open("result.txt", "a") as result_file:    
    result_file.write("\n\n" + str(first_container))