class Cake:
    def get_description(self):
        pass
    def cost(self):
        pass
class Sponge(Cake):
    def get_description(self):
        return "Sponge"
    def cost(self):
        return 2.0
class CakeDecorator(Cake):
    def __init__(self, decorated_cake):
        self.decorated_cake = decorated_cake
    def get_description(self):
        return self.decorated_cake.get_description()
    def cost(self):
        return self.decorated_cake.cost()
class FrostingDecorator(CakeDecorator):
    def get_description(self):
        return super().get_description() + ", with Frosting"
    def cost(self):
        return super().cost() + 0.5
class SprinklesDecorator(CakeDecorator):
    def get_description(self):
        return super().get_description() + ", with Sprinkles"
    def cost(self):
        return super().cost() + 0.2
if __name__ == "__main__":
    sponge = Sponge()
    print("Cost of Sponge Cake: $" + str(sponge.cost()))
    frosting_coffee = FrostingDecorator(sponge)
    print("Cost of Cake with Frosting: $" + str(frosting_cake.cost()))
    sprinkles_frosting_cake = SprinklesDecorator(frosting_cake)
    print("Cost of Cake with Frosting and Sprinkles: $" + str(sprinkles_frosting_cake.cost()))
