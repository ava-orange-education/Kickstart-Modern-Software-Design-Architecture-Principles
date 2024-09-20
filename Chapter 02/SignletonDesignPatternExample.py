class SingletonExample:
    _instance = None
    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(SingletonExample, cls).__new__(cls)
        return cls._instance

if __name__ == "__main__":
    singleton1 = SingletonExample()
    singleton2 = SingletonExample()
    print(singleton1 is singleton2)
