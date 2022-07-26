package com.company.factory;

public class MulOperation implements Operation {
    @Override
    public Integer execute(Integer[] numbers) {
        System.out.println("Numbers multiplied!!!");
        return numbers[0]*numbers[1];
    }
}
