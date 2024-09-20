abstract class Corgi {
    protected Color color;

    public Corgi(Color color) {
        this.color = color;
    }

    abstract void paint();
}


class Tail extends Corgi {
    private int length;

    public Tail(Color color, int length) {
        super(color);
        this.length = length;
    }

    void paint() {
        System.out.print("Painting a tail with ");
        color.applyColor();
        System.out.println("Length: " + length);
    }
}


interface Color {
    void applyColor();
}

class Black implements Color {
    public void applyColor() {
        System.out.print("Black Color");
    }
}

class Gold implements Color {
    public void applyColor() {
        System.out.print("Gold Color");
    }
}


public class BridgeDesignPatternExample {
    public static void main(String[] args) {
        Corgi blackTail = new Tail(new Black(), 15);
        Corgi goldTail = new Tail(new Gold(), 18);

        blackCorgi.paint();
        goldCorgi.paint();
    }
}

