public class Pet {

    String name;
    Person owner;

    Pet(String petName, Person ownerName){
        this.name = petName;
        this.owner = ownerName;
    }

    void ShowOwnerName() {
        System.out.println("My Friend is " + owner.Name + " his pet is " + this.name );

    }

    

}
