package behavioural.strategy.WeaponBehaviour;

public class AxeBehaviour implements IWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe");
    }
}
