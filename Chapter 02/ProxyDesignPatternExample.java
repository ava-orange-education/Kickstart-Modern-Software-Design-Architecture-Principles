interface Picture {
    void display();
}


class RealPicture implements Picture {
    private String filename;

    public RealPicture(String filename) {
        this.filename = filename;
        loadFromDisk();
    }
    private void loadFromDisk() {
        System.out.println("Loading picture: " + filename);
    }
    public void display() {
        System.out.println("Displaying picture: " + filename);
    }
}


class ProxyPicture implements Picture {
    private RealPicture realPicture;
    private String filename;

    public ProxyPicture(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realPicture == null) {
            realPicture = new RealPicture(filename);
        }
        realPicture.display();
    }
}


public class ProxyDesignPatternExample {
    public static void main(String[] args) {
        Picture picture1 = new ProxyPicture("picture1.png");
        Picture picture2 = new ProxyPicture("picture2.png");
        picture1.display();
        picture1.display();
        picture2.display();
    }
}
