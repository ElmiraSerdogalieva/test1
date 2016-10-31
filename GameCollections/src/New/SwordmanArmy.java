package New;

import java.util.ArrayList;

/**
 * Created by апаив on 31.10.2016.
 */
public class SwordmanArmy extends ArrayList<Swordman> implements Movable, Fighter {
    @Override
    public void moveTo() {

        for (Swordman sword : this){
            sword.moveTo();
        }

    }

    @Override
    public void fight(Unit archer1) {

        for(Swordman sw : this){
            sw.fight(archer1);
        }

    }
}
