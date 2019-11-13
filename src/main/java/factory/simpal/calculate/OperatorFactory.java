package factory.simpal.calculate;

import factory.simpal.calculate.operator.FactorOperator;
import factory.simpal.calculate.operator.impl.AddOperator;
import factory.simpal.calculate.operator.impl.DivisOperator;

public class OperatorFactory {
    public static FactorOperator getOperator(String symbol) {
        OperatorEnum operator = OperatorEnum.getSymbolEnumByName(symbol);
        switch (operator) {
            case ADD:
                return new AddOperator();
            case DIVISION:
                return new DivisOperator();
            default:
                return null;
        }
    }
}
