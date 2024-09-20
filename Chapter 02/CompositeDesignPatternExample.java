interface Component {
    void operation();
}


class TreeLeaf implements Component {
    private String name;

    public TreeLeaf(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println("Tree leaf: " + name);
    }
}


class TreeBranch implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public TreeBranch(String name) {
        this.name = name;
    }
    public void add(Component component) {
        children.add(component);
    }
    public void remove(Component component) {
        children.remove(component);
    }
    public void operation() {
        System.out.println("Tree branch: " + name);
        for (Component child : children) {
            child.operation();
        }
    }
}


public class CompositeDesignPatternExample {
    public static void main(String[] args) {
        Component treeLeaf1 = new TreeLeaf("Tree Leaf 1");
        Component treeLeaf2 = new TreeLeaf("Tree Leaf 2");

        Component treeBranch1 = new TreeBranch("Tree Branch 1");
        treeBranch1.add(treeLeaf1);
        treeBranch1.add(treeLeaf2);

        Component treeLeaf3 = new TreeLeaf("Tree Leaf 3");

        Component treeBranch2 = new TreeBranch("Tree Branch 2");
        treeBranch2.add(treeLeaf3);
        treeBranch2.add(treeBranch1);

        treeBranch2.operation();
    }
}

