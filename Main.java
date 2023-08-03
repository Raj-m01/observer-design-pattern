public class Main {

    public static void main(String[] args) {

        Shop dmart = new Shop();
        Customer customer1 = new Customer("Tom");
        Customer customer2 = new Customer("Pheebs");
        Customer customer3 = new Customer("Ross");
        Customer customer4 = new Customer("Joey");

        dmart.subscribe(customer1);
        dmart.subscribe(customer2);
        dmart.subscribe(customer3);
        dmart.subscribe(customer4);

        dmart.notify("Muffins are back in stock!!");

        dmart.unsubscribe(customer3);
        System.out.println("---");

        dmart.notify("Fresh Apples available now!!");

    }
}
