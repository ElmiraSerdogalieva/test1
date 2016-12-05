package New;

import java.util.ArrayList;

/**
 * Created by апаив on 31.10.2016.
 */
public class ArcherArmy extends ArrayList<Archer> implements Movable, Fighter {

    int x = 0, y = 0;

    @Override
    public void fight(Unit unit) {
        for(Archer archer1 : this){
            archer1.fight(unit);
        }
    }

    @Override // ?
    public void moveTo(int x, int y) {
        for(Archer archer : this){
            archer.moveTo(x,y);
        }
    }
}
