public class Car {

    MySelf Owner;
    String Name;
    int Speed;

   

    
    Car(String CarName, MySelf CarOwner, int CarSpeed ){
        this.Name = CarName;
        this.Speed = CarSpeed;
        this.Owner = CarOwner;

    }

    void ShowCar() {
        System.out.println("My name is " + Owner.Name + " my car is " + this.Name + " my " + this.Name + " speed is " + this.Speed + " km per hour" );

    }
    
}
