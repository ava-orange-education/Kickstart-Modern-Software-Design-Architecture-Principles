class ProductExample:
    def produce(self):
        pass
class ConcreteProductOne(ProductExample):
    def produce(self):
        print("Producing Concrete Product One.")
class ConcreteProductTwo(ProductExample):
    def produce(self):
        print("Producing Concrete Product Two.")
class CreatorExample:
    def factory_method(self):
        pass
    def operation(self):
        product = self.factory_method()
        product.produce()
class ConcreteCreatorOne(CreatorExample):
    def factory_method(self):
        return ConcreteProductOne()

class ConcreteCreatorTwo(CreatorExample):
    def factory_method(self):
        return ConcreteProductTwo()

if __name__ == "__main__":
    creatorOne = ConcreteCreatorOne()
    creatorTwo = ConcreteCreatorTwo()

    creatorOne.operation()
    creatorTwo.operation()
