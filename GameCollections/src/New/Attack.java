package New;

/**
 * Created by апаив on 31.10.2016.
 */
public class Attack {

    int damage;
    public Attack(int damage)
    {
        this.damage = damage;
    }

    public void fight(Unit unit)
    {
        int b = unit.currentHp - this.damage;
        //System.out.println("b = " + b);
    }

}
