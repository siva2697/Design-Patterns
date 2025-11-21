package behavioural.strategy.WeaponBehaviour;

public class KnifeBehaviour implements IWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Cutting with a knife");
    }
}
