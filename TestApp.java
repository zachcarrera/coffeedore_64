public class TestApp {
    public static void main(String[] args) {
        CoffeeKiosk kiosk1 = new CoffeeKiosk();
        kiosk1.addMenuItem("banana", 2);
        kiosk1.addMenuItem("coffee", 1.5);
        kiosk1.addMenuItem("latte", 4.5);
        kiosk1.addMenuItem("cappuccino", 3);
        kiosk1.addMenuItem("muffin", 4);


        kiosk1.newOrder();
    }
}