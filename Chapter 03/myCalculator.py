class MyCalculator:
    """This is a simple class representing a mathematical operation."""

    def add(self, x, y):
        """
        Adds two numbers.

        Parameters:
        x (int): The first number.
        y (int): The second number.

        Returns:
        int: The sum of x and y.
        """
        return x + y  # This line adds x and y


# Full line comment: Instantiate MyClass
my_calculator = MyCalculator()

# Block comment: Perform addition operation
result = my_calculator.add(300, 19)

# Print the result
print("The result of addition is:", result)
