package strategy.mode.calculator;

import strategy.mode.operater.Operator;

public class Calculator<T> {
    private Operator<T> operator;

    public Calculator(Operator<T> operator) {
        this.operator = operator;
    }

    public T doOperator(T a, T b) {
        return this.operator.doOperator(a, b);
    }
}
