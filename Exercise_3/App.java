public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "davion";
        

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "rylai";
       

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        mage.name = "traxex";
        

Character Assassin = new Character();
Assassin.strength = 10;
Assassin.agility = 50;
Assassin.intelligence = 5;
Assassin.name = "PhantomAssassin";
Assassin.sayMyName();



            Weapon junjunsword = new Weapon();

            junjunsword.Name = "junjun";
            junjunsword.damage = 100;
            junjunsword.rarity = "very rare";
            junjunsword.WeaponName();
            System.out.println(junjunsword.ShowNameAndRarity());
            junjunsword.WeaponDamage();
            junjunsword.AddDamage(5);
            junjunsword.Attack();
       

    }
}
