package structural.decoratorpattern.Decorator;

import structural.decoratorpattern.Beverage.Beverage;

public class MochaDecorator extends CondimentDecorator {

    Beverage b;

    public MochaDecorator(Beverage b) {
        this.b = b;
    }

    public String getDescription() {
        return b.getDescription() + ". Mocha";
    }

    public double getCost() {
        return this.b.getCost() + 2;
    }
}
