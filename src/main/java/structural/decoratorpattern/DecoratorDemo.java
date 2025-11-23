package structural.decoratorpattern;

import structural.decoratorpattern.Beverage.Beverage;
import structural.decoratorpattern.Beverage.Espresso;
import structural.decoratorpattern.Beverage.HouseBlend;
import structural.decoratorpattern.Decorator.MochaDecorator;
import structural.decoratorpattern.Decorator.SoyDecorator;

public class DecoratorDemo {
    public static void main(String[] args) {


        Beverage b1 = new Espresso();
        System.out.println(b1.getDescription() + " $" + b1.getCost());

        Beverage b2 = new HouseBlend();
        b2 = new MochaDecorator(b2);
        b2 = new SoyDecorator(b2);

        System.out.println(b2.getDescription() + " $ " + b2.getCost());

    }
}