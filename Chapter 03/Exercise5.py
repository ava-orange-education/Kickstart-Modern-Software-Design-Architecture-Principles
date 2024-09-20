def calculate_triangle_area(base, height):
    """
    Calculates the area of a triangle.

    Parameters:
    base (float): The length of the base of the triangle.
    height (float): The height of the triangle.

    Returns:
    float: The area of the triangle.
    """
    area = 0.5 * base * height
    return area

def main():
    """
    Main function to calculate and display the area of a triangle.
    """
    base = float(input("Enter the length of the base of the triangle: "))
    height = float(input("Enter the height of the triangle: "))
    area = calculate_triangle_area(base, height)
    print("The area of the triangle is:", area)

if __name__ == "__main__":
    main()
