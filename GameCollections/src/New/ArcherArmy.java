package New;

import java.util.ArrayList;

/**
 * Created by апаив on 31.10.2016.
 */
public class ArcherArmy extends ArrayList<Archer> implements Movable, Fighter {
    @Override
    public void fight(Unit unit) {
        for(Archer archer1 : this){
            archer1.fight(unit);
        }
    }

    @Override
    public void moveTo() {
        for(Archer archer : this){
            archer.moveTo();
        }
    }
}
