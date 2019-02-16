package pl.sda.creational.factory;

public class WeaponFactory {
    public Weapon create(Profession profession,int damage){
        switch (profession){
            case ARCHER:
                return new Bow(damage);
            case WIZARD:
                return new Wand(damage);
            case SWORDSMAN:
                return new Sword(damage);
            default:
                throw new IllegalStateException("Profession is not exist");
        }
    }
}
