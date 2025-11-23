package behavioural.strategypattern.Character;

public class Troll extends Character {
    String name;
    public void fight() {
        this.wb.useWeapon();
    }
}
