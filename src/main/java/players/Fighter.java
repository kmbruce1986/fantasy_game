package players;

import behaviours.Attackable;
import behaviours.Targetable;
import weapons.Weapon;

public abstract class Fighter extends Player implements Attackable, Targetable {

    private Weapon weapon;

    public Fighter(String name, Double healthPoint, Weapon weapon) {
        super(name, healthPoint);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
