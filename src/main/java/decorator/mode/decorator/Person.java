package decorator.mode.decorator;

public class Person {
    private String name;

    private int cost;

    public void said () {
        System.out.println("I am " + name);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
