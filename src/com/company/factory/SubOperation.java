package com.company.factory;

public class SubOperation implements Operation {
    @Override
    public Integer execute(Integer[] numbers) {
        System.out.println("Numbers Subtracted!!");
        return numbers[0]-numbers[1];
    }
}
