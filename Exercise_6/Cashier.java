public class Cashier {
    public void checkOut(GroceryItem item){
        System.out.println("you have bought " + item.name);

    }
    public void showPrice(GroceryItem item){
        System.out.println("the price of this " + item.name + " is " + item.price);
    }
    
}
