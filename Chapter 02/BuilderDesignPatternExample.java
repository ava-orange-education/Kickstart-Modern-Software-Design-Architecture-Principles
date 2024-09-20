class Truck {
    private String engine;
    private String color;
    private int seating;

    private Truck() {}

    public String getEngine() {
        return engine;
    }
    public String getColor() {
        return color;
    }
    public int getSeating() {
        return seating;
    }

    
    static class Builder {
        private Truck truck = new Truck();
        public Builder withEngine(String engine) {
            truck.engine = engine;
            return this;
        }
        public Builder withColor(String color) {
            truck.color = color;
            return this;
        }
        public Builder withSeating(int seating) {
            truck.seating = seating;
            return this;
        }
        public Truck build() {
            return truck;
        }
    }
}


public class BuilderDesignPatternExample {
    public static void main(String[] args) {
        Truck truck = new Truck.Builder()
                .withEngine("EcoBoost")
                .withColor("White Gold")
                .withSeating(6)
                .build();

        System.out.println("Truck Configuration:");
        System.out.println("Engine: " + truck.getEngine());
        System.out.println("Color: " + truck.getColor());
        System.out.println("Seating: " + truck.getSeating());
    }
}
