package New;

/**
 * Created by апаив on 31.10.2016.
 */
public class Swordman extends Unit implements Movable, Fighter {

    int x = 0, y = 0;

    @Override
    public void fight(Unit unit) {
        Attack a = new Attack(20);
        a.fight(unit);
        System.out.println("Attack!");
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Move!");
    }

    @Override
    public void create() {
        System.out.println("Create!");
    }
}
