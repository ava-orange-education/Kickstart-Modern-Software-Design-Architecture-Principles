class Calculator2:
    """Represents a simple calculator class."""

    def add(self, x, y):
        """
        Adds two numbers.

        Parameters:
        x (int): The first number.
        y (int): The second number.

        Returns:
        int: The sum of x and y.
        """
        return x + y

    def subtract(self, x, y):
        """
        Subtracts one number from another.

        Parameters:
        x (int): The number to subtract from.
        y (int): The number to subtract.

        Returns:
        int: The result of subtracting y from x.
        """
        return x - y

# Create a Calculator instance
calculator = Calculator2()

# Perform addition and subtraction operations
add_result = calculator.add(300, 19)
subtract_result = calculator.subtract(2024, 2008)

# Print the results
print("Addition result:", add_result)
print("Subtraction result:", subtract_result)
