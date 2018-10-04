package mythical;

import behaviours.Attackable;
import behaviours.Targetable;
import enemies.Enemy;

public class Dragon extends MythicalCreature {

    public Dragon(String name, Double attackValue) {
        super(name, attackValue);
    }

    public void attack(Targetable target){
        if (target instanceof Enemy) {
            Double reduceAmount = this.getAttackValue();
            target.lowerHealthPoint(reduceAmount);
        }
    }
}
