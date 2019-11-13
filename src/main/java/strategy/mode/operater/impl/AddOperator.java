package strategy.mode.operater.impl;

import strategy.mode.operater.Operator;

public class AddOperator implements Operator<Integer> {
    public Integer doOperator(Integer a, Integer b) {
        return a+b;
    }
}
