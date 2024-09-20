interface TargetExample {
    void request();
}

e.
class AdapteeExample {
    void specificRequest() {
        System.out.println("This is from the adaptee's specific request.");
    }
}

class AdapterExample implements TargetExample {
    private AdapteeExample adaptee;

    public AdapterExample(AdapteeExample adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        System.out.println("This is the adapter's request");
        adaptee.specificRequest();
    }
}

public class AdapterDesingPatternExample {
    public static void main(String[] args) {
        AdapteeExample adaptee = new AdapteeExample();
        TargetExample adapter = new AdapterExample(adaptee);

        adapter.request();
    }
}
