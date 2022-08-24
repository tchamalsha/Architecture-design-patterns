package com.company;

import com.company.Decorator.decorators.RedShapeDecorator;
import com.company.Decorator.shapes.Circle;
import com.company.Decorator.shapes.Rectangle;
import com.company.Decorator.shapes.Shape;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }


}
