public class Task {
    private static int idCounter = 0;
    private int id;
    private String name;

    public Task(String name) {
        this.id = ++idCounter;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{id=" + id + ", name='" + name + '\'' + '}';
    }
}

