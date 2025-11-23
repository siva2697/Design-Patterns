package behavioural.strategypattern.Character;

import behavioural.strategypattern.WeaponBehaviour.IWeaponBehaviour;

public class Character {
    IWeaponBehaviour wb;

    public void fight() {};
    public void setWeaponBehaviour(IWeaponBehaviour wb) {
        this.wb = wb;
    }

}
