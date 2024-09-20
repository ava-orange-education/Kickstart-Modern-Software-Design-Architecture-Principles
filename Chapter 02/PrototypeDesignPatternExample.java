interface PrototypeExample {
    PrototypeExample clone();
}


class ConcretePrototypeExample implements PrototypeExample {
    private String name;
    public ConcretePrototypeExample(String name) {
        this.name = name;
    }
    public PrototypeExample clone() {
        return new ConcretePrototypeExample(this.name);
    }
    public String getName() {
        return name;
    }
}

public class PrototypeDesignPatternExample {
    public static void main(String[] args) {
        PrototypeExample original = new ConcretePrototypeExample("Original Prototype");
        PrototypeExample copy = original.clone();

        System.out.println("Original: " + original.getName());
        System.out.println("Copy: " + copy.getName());
    }
}
