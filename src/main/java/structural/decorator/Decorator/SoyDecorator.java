package structural.decorator.Decorator;

import structural.decorator.Beverage.Beverage;

public class SoyDecorator extends CondimentDecorator {

    Beverage b;

    public SoyDecorator(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDescription() {
        return b.getDescription() + " , soy";
    }

    public double getCost() {
        return this.b.getCost() + 3;
    }
}
