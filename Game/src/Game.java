import java.util.ArrayList;

/**
 * Created by апаив on 23.10.2016.
 */
public class Game {

    public static void main(String args[]){
        ArrayList<Unit> archer = new ArrayList<Unit>();
        //Archer archer = new Archer();
        Sword sword = new Sword();
        sword.fight(archer);
    }
}
