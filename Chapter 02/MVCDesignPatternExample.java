class CorgiModel {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


class CorgiView {
    public void displayCorgiDetails(String corgiName) {
        System.out.println("Corgi Name: " + corgiName);
    }
}


class CorgiController {
    private CorgiModel model;
    private CorgiView view;

    public CorgiController(CorgiModel model, CorgiView view) {
        this.model = model;
        this.view = view;
    }

    public void updateCorgiName(String name) {
        model.setName(name);
    }

    public void displayCorgiDetails() {
        String corgiName = model.getName();
        view.displayCorgiDetails(corgiName);
    }
}


public class MVCDesignPatternExample {
    public static void main(String[] args) {
        CorgiModel model = new CorgiModel();
        CorgiView view = new CorgiView();
        CorgiController controller = new CorgiController(model, view);

        controller.updateCorgiName("Muzz");
        controller.displayCorgiDetails();
    }
} 

