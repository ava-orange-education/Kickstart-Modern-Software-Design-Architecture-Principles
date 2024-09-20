# Function to calculate the sum of squares of numbers in a list
def sum_of_squares(numbers):
    total = 0
    for num in numbers:
        total += num ** 2
    return total

# Function to calculate the sum of cubes of numbers in a list
def sum_of_cubes(numbers):
    total = 0
    for num in numbers:
        total += num ** 3
    return total

# Main function
def main():
    numbers = [1, 2, 3, 4, 5]
    sum_squares = sum_of_squares(numbers)
    sum_cubes = sum_of_cubes(numbers)
    print("Sum of squares:", sum_squares)
    print("Sum of cubes:", sum_cubes)

# Call the main function
main()
