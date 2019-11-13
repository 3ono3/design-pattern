package factory.simpal.calculate.operator.impl;


import factory.simpal.calculate.operator.FactorOperator;

public class AddOperator extends FactorOperator<Integer> {

    public Integer doOperator() {
        return this.numB + this.numA;
    }
}
