package behavioural.strategypattern.WeaponBehaviour;

public class AxeBehaviour implements IWeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe");
    }
}
