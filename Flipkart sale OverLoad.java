class FlipkartCart {

void addItem(String productName, double price, int quantity) {

double total = price quantity:

System.out.println("Added "+ quantity + " x " + productName +

* Total: " + total),

}

void addItem(String productName, double price, int quantity, boolean republicDayOffer) {

double total price* quantity;

double discount = 0;

if (republic DayOffer && total > 50000) {

discount = total 0.10,

}

double finalAmount = total discount;

System.out.println("Added " + quantity + "x" + productName +

Original+total +

Discount: " + discount +

Final Amount: " + finalAmount);

}

}

public class FlipkartSale OverLoad {

public static void main(String[] args) {

FlipkartCart cart = new FlipkartCart). cart.addItem("Washing Machine", 18000, 1), cart addItem("iPhone", 65000, 1, true), cart addItem("Headphones", 2000, 2, true),

}

}
