package New;

/**
 * Created by апаив on 31.10.2016.
 */
public class Archer extends Unit implements Movable, Fighter {

    @Override
    public void fight(Unit unit) {
        Attack a = new Attack(20);
        a.fight(unit);
        System.out.println("Attack!");
    }

    @Override
    public void moveTo() {
        System.out.println("Move!");
    }

    @Override
    public void create() {
        System.out.println("Create!");
    }


}
