package kg.geektech.game.players;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        int n = 20;

        for (Hero hero : heroes) {
            hero.setDamage(hero.getDamage() + n);
            System.out.println(this.getName() + " Uvelichil uron : " + hero.getName() + " - " + (hero.getDamage() + n));
        }

    }


}




