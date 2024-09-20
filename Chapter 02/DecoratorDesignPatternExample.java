interface Cake {
    String getDescription();
    double cost();
}


class Sponge implements Cake {
    public String getDescription() {
        return "Sponge";
    }
    public double cost() {
        return 2.0;
    }
}

abstract class CakeDecorator implements Cake {
    protected Cake decoratedCake;
    public CakeDecorator(Cake decoratedCake) {
        this.decoratedCake = decoratedCake;
    }
    public String getDescription() {
        return decoratedCake.getDescription();
    }
    public double cost() {
        return decoratedCake.cost();
    }
}

class FrostingDecorator extends CakeDecorator {
    public FrostingDecorator(Cake decoratedCake) {
        super(decoratedCake);
    }
    public String getDescription() {
        return super.getDescription() + ", with Frosting";
    }
    public double cost() {
        return super.cost() + 0.5;
    }
}
class SprinklesDecorator extends CakeDecorator {
    public SprinklesDecorator(Cake decoratedCake) {
        super(decoratedCake);
    }
    public String getDescription() {
        return super.getDescription() + ", with Sprinkles";
    }
    public double cost() {
        return super.cost() + 0.2;
    }
}


public class DecoratorDesignPatternExample {
    public static void main(String[] args) {
        Cake sponge = new Sponge();
        System.out.println("Cost of Sponge Cake: $" + sponge.cost());

        Cake frostingCake = new FrostingDecorator(sponge);
        System.out.println("Cost of Cake with Frosting : $" + frostingCake.cost());

        Cake sprinklsSpongeCake = new SprinklesDecorator(frostingCake);
        System.out.println("Cost of Cake with Frosting and Sprinkles: $" + sprinklesFrostingCake.cost());
    }
}

