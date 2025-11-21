package behavioural.strategy.WeaponBehaviour;

public class BowAndArrowBehaviour implements IWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Shooting an arrow with a bow");
    }
}
