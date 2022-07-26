package com.company.factory;

public class OperationFactory {



    public Operation getOperation(String type){

        if (type=="add"){
            return new AddOperation();
        }else if (type=="sub"){
            return new SubOperation();
        }else {
            return new MulOperation();
        }

    }


}
