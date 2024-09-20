import copy

class PrototypeExample:
    def clone(self):
        pass
class ConcretePrototypeExample(PrototypeExample):
    def __init__(self, name):
        self.name = name
    def clone(self):
        return copy.deepcopy(self)
    def get_name(self):
        return self.name

if __name__ == "__main__":
    original = ConcretePrototypeExample("Original Prototype")
    copy = original.clone()

    print("Original:", original.get_name())
    print("Copy:", copy.get_name())
