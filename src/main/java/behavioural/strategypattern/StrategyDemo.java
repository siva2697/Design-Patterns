package behavioural.strategypattern;

import behavioural.strategypattern.Character.*;
import behavioural.strategypattern.Character.Character;
import behavioural.strategypattern.WeaponBehaviour.AxeBehaviour;
import behavioural.strategypattern.WeaponBehaviour.BowAndArrowBehaviour;
import behavioural.strategypattern.WeaponBehaviour.KnifeBehaviour;
import behavioural.strategypattern.WeaponBehaviour.SwordBehaviour;

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