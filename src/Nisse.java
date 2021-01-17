public class Nisse {

    String name;
    Nisse parent;
    Nisse children[];

    Nisse(String name, int n) {
        children = new Nisse[n];
        this.name = name;

    }

    public Nisse(String name, Nisse parent, int i) {
        children = new Nisse[i];
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nisse getParent() {
        return parent;
    }

    public void setParent(Nisse parent) {
        this.parent = parent;
    }

    public Nisse[] getChildren() {
        return children;
    }

    public void setChildren(Nisse[] children) {
        this.children = children;
    }







}