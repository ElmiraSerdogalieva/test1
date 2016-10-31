package New;

import java.util.ArrayList;

/**
 * Created by апаив on 31.10.2016.
 */
public class Game {
    public static void main(String args[]){
        ArrayList<Archer> archerList = new ArrayList<Archer>();
        Archer archer1 = new Archer();
        Archer archer2 = new Archer();
        Archer archer3 = new Archer();
        Archer archer4 = new Archer();
        Archer archer5 = new Archer();

        archerList.add(archer1);
        archerList.add(archer2);
        archerList.add(archer3);
        archerList.add(archer4);
        archerList.add(archer5);

        ArcherArmy army = new ArcherArmy();
        army.add(archer1);
        army.add(archer2);
        army.add(archer3);
        army.add(archer4);
        army.moveTo();

		/*for (Archer ar : archerList){
			ar.moveTo();
		}*/

        ArrayList<Swordman> swordmanList = new ArrayList<Swordman>();
        Swordman sword1 = new Swordman();
        Swordman sword2 = new Swordman();
        Swordman sword3 = new Swordman();
        Swordman sword4 = new Swordman();
        Swordman sword5 = new Swordman();

        //sword.fight(archer1);
        SwordmanArmy army1 = new SwordmanArmy();
        army1.add(sword1);
        army1.add(sword2);
        army1.add(sword3);
        army1.add(sword4);
        army1.add(sword5);
        army1.moveTo();

        army1.fight(archer1);

		/*for (Swordman sw : swordmanList){
			sw.moveTo();
		}*/
    }
}
