"""
    Exchange the value of variable a to variable b and vice versa
"""


def variable_exchange1():
    favourite_food1 = "Noodles"
    favourite_food2 = "Meatball"
    favourite_food_temp = ""

    print("Favourite Food 1 Before : ", favourite_food1)
    print("Favourite Food 2 Before : ", favourite_food2)

    favourite_food_temp = favourite_food1
    favourite_food1 = favourite_food2
    favourite_food2 = favourite_food_temp

    print("Favourite Food 1 After : ", favourite_food1)
    print("Favourite Food 2 After : ", favourite_food2)


def variable_exchange2():
    a = 34
    b = 84

    print("Value of a before : ", a)
    print("value of b before : ", b)

    a = a + b
    b = a - b
    a = a - b

    print("Value of a after : ", a)
    print("value of b after : ", b)


variable_exchange1()
variable_exchange2()
