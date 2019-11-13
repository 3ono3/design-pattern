package factory.simpal.calculate.operator;

public abstract class FactorOperator<T> {
    protected T numA;
    protected T numB;

    public abstract T doOperator();

    public T getNumA() {
        return numA;
    }

    public void setNumA(T numA) {
        this.numA = numA;
    }

    public T getNumB() {
        return numB;
    }

    public void setNumB(T numB) {
        this.numB = numB;
    }
}
