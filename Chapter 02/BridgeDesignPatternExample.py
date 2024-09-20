class Corgi:
    def __init__(self, color):
        self.color = color
    def paint(self):
        pass
class Tail(Corgi):
    def __init__(self, color, length):
        super().__init__(color)
        self.length = length
    def paint(self):
        print(f"Painting a tail with {self.color.apply_color()} - Length: {self.length}")
class Color:
    def apply_color(self):
        pass
class Black(Color):
    def apply_color(self):
        return "Black Color"
class Gold(Color):
    def apply_color(self):
        return "Gold Color"
if __name__ == "__main__":
    black_tail = Tail(Black(), 15)
    gold_tail = Tail(Gold(), 18)

    black_tail.paint()
    gold_tail.paint()
