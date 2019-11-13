package visitor.mode.visitor;

public abstract class Person {
    private String name;
    private String state;

    abstract public void doAction();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
