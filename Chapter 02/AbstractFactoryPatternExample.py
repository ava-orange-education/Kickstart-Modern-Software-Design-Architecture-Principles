class Dog:
    def draw(self):
        pass
class Corgi(Dog):
    def draw(self):
        print("Drawing a Corgi.")
class Retriever(Dog):
    def draw(self):
        print("Drawing a Retriver.")

class Color:
    def fill(self):
        pass
class Tricolor(Color):
    def fill(self):
        print("Filling with Tricolor color.")
class Gold(Color):
    def fill(self):
        print("Filling with Gold color.")

class AbstractFactory:
    def create_dog(self):
        pass
    def create_color(self):
        pass

class DogFactory(AbstractFactory):
    def create_dog(self):
        return Corgi()
    def create_color(self):
        return Tricolor()

class ColorFactory(AbstractFactory):
    def create_dog(self):
        return Retriever()
    def create_color(self):
        return Gold()

if __name__ == "__main__":
    dog_factory = DogFactory()
    corgi = dog_factory.create_dog()
    tricolor = dog_factory.create_color()
    corgi.draw()
    tricolor.fill()

    color_factory = ColorFactory()
    retriever = color_factory.create_dog()
    gold = color_factory.create_color()
    retriever.draw()
    gold.fill()
