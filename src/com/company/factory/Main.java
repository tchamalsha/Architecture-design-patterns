package com.company.factory;

public class Main {


    public static void main(String[] args) {

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getOperation("add");

        Integer[] numbers = {1,2};
        System.out.println(operation.execute(numbers));

    }
}
