interface Dog {
    void draw();
}
class Corgi implements Dog {
    public void draw() {
        System.out.println("Drawing a Corgi.");
    }
}
class Retriever implements Dog {
    public void draw() {
        System.out.println("Drawing a Retriever.");
    }
}


interface Color {
    void fill();
}
class Gold implements Color {
    public void fill() {
        System.out.println("Filling with Gold color.");
    }
}
class Tricolor implements Color {
    public void fill() {
        System.out.println("Filling with Tricolor color.");
    }
}


interface AbstractFactory {
    Dog createDog();
    Color createColor();
}
class DogFactory implements AbstractFactory {
    public Dog createDog() {
        return new Corgi();
    }
    public Color createColor() {
        return new TriColor();
    }
}
class ColorFactory implements AbstractFactory {
    public Dog createDog() {
        return new Retriever();
    }
    public Color createColor() {
        return new Gold();
    }
}


public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        AbstractFactory dogFactory = new DogFactory();
        Dog corgi = dogFactory.createDog();
        Color tricolor = dogFactory.createColor();

        corgi.draw();
        tricolor.fill();

        AbstractFactory colorFactory = new ColorFactory();
        Dog retriever = colorFactory.createDog();
        Color gold = colorFactory.createColor();

        retriever.draw();
        gold.fill();
    }
}
