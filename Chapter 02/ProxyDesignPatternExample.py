class Picture:
    def display(self):
        pass
class RealPicture(Picture):
    def __init__(self, filename):
        self.filename = filename
        self.load_from_disk()
    def load_from_disk(self):
        print(f"Loading picture: {self.filename}")
    def display(self):
        print(f"Displaying picture: {self.filename}")
class ProxyPicture(Picture):
    def __init__(self, filename):
        self.filename = filename
        self.real_picture = None
    def display(self):
        if self.real_picture is None:
            self.real_picture = RealImage(self.filename)
        self.real_picture.display()
if __name__ == "__main__":
    picture1 = ProxyPicture("picture1.png")
    picture2 = ProxyPicture("picture2.png")
    picture1.display()
    picture1.display()
    picture2.display()
