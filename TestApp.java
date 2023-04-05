public class TestApp {
    public static void main(String[] args) {
        CoffeeKiosk kiosk1 = new CoffeeKiosk();

        // fill menu
        kiosk1.addMenuItem("banana", 2);
        kiosk1.addMenuItem("coffee", 1.5);
        kiosk1.addMenuItem("latte", 4.5);
        kiosk1.addMenuItem("cappuccino", 3);
        kiosk1.addMenuItem("muffin", 4);

        // start a new order on kiosk1
        kiosk1.newOrder();
    }
}