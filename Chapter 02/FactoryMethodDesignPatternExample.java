interface ProductExample {
    void produce();
}


class ConcreteProductOne implements ProductExample {
    public void produce() {
        System.out.println("Producing Concrete Product One.");
    }
}
class ConcreteProductTwo implements ProductExample {
    public void produce() {
        System.out.println("Producing Concrete Product Two.");
    }
}


abstract class CreatorExample {
    abstract ProductExample factoryMethod();

    void operation() {
        ProductExample product = factoryMethod();
        product.produce();
    }
}

class ConcreteCreatorOne extends CreatorExample {
    Product factoryMethod() {
        return new ConcreteProductOne();
    }
}

class ConcreteCreatorTwo extends CreatorExample {
    Product factoryMethod() {
        return new ConcreteProductTwo();
    }
}


public class FactoryMethodDesignPatternExample {
    public static void main(String[] args) {
        CreatorExample creatorOne = new ConcreteCreatorOne();
        CreatorExample creatorTwo = new ConcreteCreatorTwo();

        creatorOne.operation();
        creatorTwo.operation();
    }
}
