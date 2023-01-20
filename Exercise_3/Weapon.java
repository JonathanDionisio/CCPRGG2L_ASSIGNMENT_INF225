public class Weapon {

    String Name;
    int damage;
    String rarity;


    public void WeaponName() {
    System.out.println("The name of my weapon is " + Name);
    }
    public void WeaponDamage(){
        System.out.println("My " + Name + " deals " + damage);
    }
    
    public void Attack(){
        System.out.println("I'am Attacking");
    }
    public void AddDamage(int Damageincreased){
        int newDamage = this.damage + Damageincreased;
        System.out.println("Damage increased from " + damage +"to"+ newDamage);
        this.damage = newDamage;
    }

    public String ShowNameAndRarity(){
        return this.Name + " " + this.rarity;
    }
}
