package weapons;

public abstract class Weapon {

    private WeaponType weaponType;
    private Double attackValue;

    public Weapon(WeaponType weaponType, Double attackValue) {
        this.weaponType = weaponType;
        this.attackValue = attackValue;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public Double getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(Double attackValue) {
        this.attackValue = attackValue;
    }
}
