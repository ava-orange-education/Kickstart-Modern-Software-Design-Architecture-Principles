import asyncio

async def greet(name):
    print(f"Welcome, {name}!")
    await asyncio.sleep(3)  # Simulate a non-blocking I/O operation
    print(f"Goodbye, {name}!")

async def main():
    await asyncio.gather(
        greet("Neo"),
        greet("Trinity"),
        greet("Morpheus")
    )

if __name__ == "__main__":
    asyncio.run(main())
