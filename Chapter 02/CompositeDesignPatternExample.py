class Component:
    def operation(self):
        pass
class TreeLeaf(Component):
    def __init__(self, name):
        self.name = name
    def operation(self):
        print(f"Tree Leaf: {self.name}")
class TreeBranch(Component):
    def __init__(self, name):
        self.name = name
        self.children = []
    def add(self, component):
        self.children.append(component)
    def remove(self, component):
        self.children.remove(component)
    def operation(self):
        print(f"Tree Branch: {self.name}")
        for child in self.children:
            child.operation()
if __name__ == "__main__":
    treeLeaf1 = TreeLeaf("Tree Leaf 1")
    treeLeaf2 = TreeLeaf("Tree Leaf 2")
    treeBranch1 = TreeBranch("Tree Branch 1")
    treeBranch1.add(treeLeaf1)
    treeBranch1.add(treeLeaf2)
    treeLeaf3 = TreeLeaf("Tree Leaf 3")
    treeBranch2 = TreeBranch("Tree Branch 2")
    treeBranch2.add(treeLeaf3)
    treeBranch2.add(treeBranch1)
    treeBranch2.operation()
