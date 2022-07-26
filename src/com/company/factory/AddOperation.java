package com.company.factory;

public class AddOperation implements Operation {

    @Override
    public Integer execute(Integer[] numbers) {
        System.out.println("Numbers added!!");
        return numbers[0]+numbers[1];
    }
}
