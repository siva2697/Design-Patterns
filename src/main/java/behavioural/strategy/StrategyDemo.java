package behavioural.strategy;

import behavioural.strategy.Character.*;
import behavioural.strategy.Character.Character;
import behavioural.strategy.WeaponBehaviour.AxeBehaviour;
import behavioural.strategy.WeaponBehaviour.BowAndArrowBehaviour;
import behavioural.strategy.WeaponBehaviour.KnifeBehaviour;
import behavioural.strategy.WeaponBehaviour.SwordBehaviour;

public class StrategyDemo {
    public static void main(String[] args) {

        Character kingCharacter = new King();
        Character queenCharacter = new Queen();
        Character trollCharacter = new Troll();
        Character knightCharacter = new Knight();

        kingCharacter.setWeaponBehaviour(new BowAndArrowBehaviour());
        queenCharacter.setWeaponBehaviour(new KnifeBehaviour());
        trollCharacter.setWeaponBehaviour(new AxeBehaviour());
        knightCharacter.setWeaponBehaviour(new SwordBehaviour());

        kingCharacter.fight();
        queenCharacter.fight();
        trollCharacter.fight();
        knightCharacter.fight();
    }
}