/**
 * Created by апаив on 23.10.2016.
 */
public class Attack {

    int damage;

    public Attack(int damage) {
        this.damage = damage;
    }
    public void attack(Unit unit){
        int b = unit.currentHp - this.damage;
        System.out.println("b = " + b);
    }
}
