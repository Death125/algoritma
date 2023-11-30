"""
    Search max and min value of an array
"""


def find_min_max_weight():
    STUDENTS_WEIGHT = [50, 60, 65, 49, 80, 82, 71, 65, 55, 51]
    highest_weight_index = STUDENTS_WEIGHT[0]
    lowest_weight_index = STUDENTS_WEIGHT[0]
    highest_weight = 0
    lowest_weight = 0

    print("List of student weights : ")
    print(STUDENTS_WEIGHT[0], end=" ")

    for i in range(1, len(STUDENTS_WEIGHT)):
        print(STUDENTS_WEIGHT[i], end=" ")

        if highest_weight_index > STUDENTS_WEIGHT[i]:
            highest_weight = highest_weight_index
        else:
            highest_weight_index = STUDENTS_WEIGHT[i]
            highest_weight = STUDENTS_WEIGHT[i]

        if lowest_weight_index < STUDENTS_WEIGHT[i]:
            lowest_weight = lowest_weight_index
        else:
            lowest_weight_index = STUDENTS_WEIGHT[i]
            lowest_weight = STUDENTS_WEIGHT[i]

    print("")
    print("-------------------------")
    print("Highest Weight : ", highest_weight)
    print("Lowest Weight : ", lowest_weight)


find_min_max_weight()
