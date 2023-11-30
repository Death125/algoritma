"""
    Guess the odd or even number
"""

input_number = int(input("Input a number : "))


def guess_odd_or_even_number():
    if input_number % 2 == 0:
        print("EVEN")
    else:
        print("ODD")


guess_odd_or_even_number()
