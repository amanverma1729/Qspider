package OOPS.foodApp;

class foodItem {

    String name;
    double price;
    int qty;

    foodItem(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    double totalPrice() {
        return price * qty;
    }

    void display() {
        System.out.println("Item : " + name);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + qty);
        System.out.println("Total : " + totalPrice());
    }
}