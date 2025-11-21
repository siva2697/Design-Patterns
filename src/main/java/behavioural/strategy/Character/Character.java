package behavioural.strategy.Character;

import behavioural.strategy.WeaponBehaviour.IWeaponBehaviour;

public class Character {
    IWeaponBehaviour wb;

    public void fight() {};
    public void setWeaponBehaviour(IWeaponBehaviour wb) {
        this.wb = wb;
    }

}
