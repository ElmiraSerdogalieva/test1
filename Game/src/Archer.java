/**
 * Created by апаив on 23.10.2016.
 */
public class Archer extends Unit implements Movable, Fighter {

    @Override
    public void create() {
        System.out.println("Create!");
    }

    @Override
    public void moveTo() {
        System.out.println("Move!");
    }

    public void fight(Unit unit){
        Attack a = new Attack(20);
        a.attack(unit);
        System.out.println("Attack!");
    }
}

