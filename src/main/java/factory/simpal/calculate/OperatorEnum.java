package factory.simpal.calculate;

public enum OperatorEnum {
    ADD("+"),SUBTRACTION("-"),MULTI("*"),DIVISION("/");

    private String symbol;

    private OperatorEnum(String symbol) {
        this.symbol = symbol;
    }

    public static OperatorEnum getSymbolEnumByName(String symbolName) {
        for (OperatorEnum operator : OperatorEnum.values()) {
            if (operator.symbol.equals(symbolName)) {
                return operator;
            }
        }
        throw new RuntimeException("运算符输入有误");
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
