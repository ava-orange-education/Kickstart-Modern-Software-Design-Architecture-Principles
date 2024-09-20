def factorial(n):
    if n == 0:
        return 1
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

def main():
    number = 8
    result = factorial(number)
    print(f"Factorial of {number} is: {result}")

if __name__ == "__main__":
    main()
