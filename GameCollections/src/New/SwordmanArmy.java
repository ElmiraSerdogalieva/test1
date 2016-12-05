package New;

import java.util.ArrayList;

/**
 * Created by апаив on 31.10.2016.
 */
public class SwordmanArmy extends ArrayList<Swordman> implements Movable, Fighter {

    int x = 0, y = 0;

    @Override
    public void fight(Unit archer1) {

        for(Swordman sw : this){
            sw.fight(archer1);
        }
    }

    @Override // ?
    public void moveTo(int x, int y) {

        for (Swordman sword : this){
            sword.moveTo(x,y);
        }
    }
}
