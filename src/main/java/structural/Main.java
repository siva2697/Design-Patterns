package org.example;

import structural.decorator.Beverage.Beverage;
import structural.decorator.Beverage.Espresso;
import structural.decorator.Beverage.HouseBlend;
import structural.decorator.Decorator.MochaDecorator;
import structural.decorator.Decorator.SoyDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Beverage b1 = new Espresso();
        System.out.println(b1.getDescription() + " $" + b1.getCost());

        Beverage b2 = new HouseBlend();
        b2 = new MochaDecorator(b2);
        b2 = new SoyDecorator(b2);

        System.out.println(b2.getDescription() + " $ " + b2.getCost());

    }
}