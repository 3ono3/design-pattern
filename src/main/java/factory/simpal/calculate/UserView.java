package factory.simpal.calculate;

import factory.simpal.calculate.operator.FactorOperator;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args){
        Scanner readInput = new Scanner(System.in);

        System.out.println("输入数字A:");
        Integer numA = readInput.nextInt();
        System.out.println("输入数字B:");
        Integer numB = readInput.nextInt();
        System.out.println("输入操作符:");
        String symbol = readInput.next();

        FactorOperator operator= OperatorFactory.getOperator(symbol);
        operator.setNumA(numA);
        operator.setNumB(numB);
        Integer x = (Integer) operator.doOperator();
        System.out.println(x);
    }

    @Test
    public void doOperator() {
        Scanner readInput = new Scanner(System.in);

        System.out.println("输入数字A:");
        Integer numA = readInput.nextInt();
        System.out.println("输入数字B:");
        Integer numB = readInput.nextInt();
        System.out.println("输入操作符:");
        String symbol = readInput.next();

        FactorOperator operator= OperatorFactory.getOperator(symbol);
        operator.setNumA(numA);
        operator.setNumB(numB);
        Integer x = (Integer) operator.doOperator();
        System.out.println(x);
    }
}
