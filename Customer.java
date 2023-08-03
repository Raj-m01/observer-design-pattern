public class Customer implements Observer{

    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Hey "+name+", You have new message: "+message);
    }
}