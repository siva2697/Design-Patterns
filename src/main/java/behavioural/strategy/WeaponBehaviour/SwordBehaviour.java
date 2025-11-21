package behavioural.strategy.WeaponBehaviour;

public class SwordBehaviour implements IWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
