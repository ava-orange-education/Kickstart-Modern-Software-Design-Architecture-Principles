abstract class Sport {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}


class Basketball extends Sport {
    void initialize() {
        System.out.println("Basketball court is ready! Start playing.");
    }

    void startPlay() {
        System.out.println("Basketball game started. Enjoy the game!");
    }

    void endPlay() {
        System.out.println("Basketball game finished!");
    }
}

class Pickleball extends Sport {
    void initialize() {
        System.out.println("Pickleball court is ready! Start playing.");
    }

    void startPlay() {
        System.out.println("Pickleball Game Started. Enjoy the game!");
    }

    void endPlay() {
        System.out.println("Pickleball Game Finished!");
    }
}


public class TemplateMethodDesignPatternExample {
    public static void main(String[] args) {
        Sport basketballGame = new Basketball();
        Sport pickleballGame = new Pickleball();

        System.out.println("Playing Basketball...");
        basketballGame.play();

        System.out.println("\nPlaying Pickleball...");
        pickleballGame.play();
    }
}

