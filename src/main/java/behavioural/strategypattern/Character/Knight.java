package behavioural.strategypattern.Character;

public class Knight extends Character {
    String name;
    public void fight() {
        this.wb.useWeapon();
    }
}
