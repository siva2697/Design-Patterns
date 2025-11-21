package structural.decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double getCost() {
        return 89;
    }
}
