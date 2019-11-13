package factory.simpal.calculate.operator.impl;

import factory.simpal.calculate.operator.FactorOperator;

public class DivisOperator extends FactorOperator<Integer> {
    public Integer doOperator() {
        if (this.numB == 0) {
            throw new RuntimeException("除数为0");
        }
        return this.numA/this.numB;
    }
}
