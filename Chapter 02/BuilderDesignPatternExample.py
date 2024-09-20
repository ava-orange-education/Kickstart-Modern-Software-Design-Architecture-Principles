class Truck:
    def __init__(self):
        self.engine = None
        self.color = None
        self.seating = None
    def __str__(self):
        return f"Truck Configuration:\nEngine: {self.engine}\nColor: {self.color}\nSeating: {self.seating}

class TruckBuilder:
    def __init__(self):
        self.truck = Truck()
    def with_engine(self, engine):
        self.truck.engine = engine
        return self
    def with_color(self, color):
        self.truck.color = color
        return self
    def with_seating(self, seating):
        self.truck.seating = seating
        return self
    def build(self):
        return self.truck

if __name__ == "__main__":
    builder = TruckBuilder()
    truck = builder.with_engine("EcoBoost")\
                     .with_color("White Gold")\
                     .with_seating(6)\
                     .build()
    print(truck)
