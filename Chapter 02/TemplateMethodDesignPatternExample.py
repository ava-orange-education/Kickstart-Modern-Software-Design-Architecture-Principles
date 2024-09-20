class Sport:
    def initialize(self):
        pass
    def start_play(self):
        pass
    def end_play(self):
        pass
    def play(self):
        self.initialize()
        self.start_play()
        self.end_play()

class Basketball(Sport):
    def initialize(self):
        print("Basketball court is ready! Start playing.")
    def start_play(self):
        print("Basketball Game Started. Enjoy the game!")
    def end_play(self):
        print("Basketball Game Finished!")

class Pickleball(Sport):
    def initialize(self):
        print("Pickleball court is ready! Start playing.")
    def start_play(self):
        print("Pickleball Game Started. Enjoy the game!")
    def end_play(self):
        print("Pickleball Game Finished!")

if __name__ == "__main__":
    basketball_game = Basketball()
    pickleball_game = Pickleball()

    print("Playing Basketball...")
    basketball_game.play()

    print("\nPlaying Pickleball...")
    pickleball_game.play()
