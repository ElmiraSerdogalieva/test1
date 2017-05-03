/**
 * Created by апаив on 23.10.2016.
 */
public class Attack {

    int damage;

    public Attack(int damage) {
        this.damage = damage;
    }
    public void attack(Unit unit){
        /*
         * при этом unit.currentHp не изменится
         */
        int b = unit.currentHp - this.damage;
        System.out.println("b = " + b);
    }
}
