/**
 * Created by апаив on 23.10.2016.
 */
public class Sword extends Unit implements Movable, Fighter {

    @Override
    public void create() {
        System.out.println("Create!");
    }

    @Override
    public void moveTo() {
        System.out.println("Move!");
    }

    public void fight(Unit unit){
        Attack a = new Attack(30);
        a.attack(unit);
        System.out.println("Attack!");

    }
}
