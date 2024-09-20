# Function to calculate the factorial of a number
def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

# Function to check if a number is prime
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

# Main function
def main():
    num = int(input("Enter a number: "))
    fact = factorial(num)
    prime = is_prime(num)
    print("Factorial:", fact)
    print("Is Prime:", prime)

# Call the main function
main()
