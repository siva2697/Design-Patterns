package structural.decorator.Decorator;

import structural.decorator.Beverage.Beverage;

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
