import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject{

    private List<Observer> customerList = new ArrayList<>();


    @Override
    public void subscribe(Observer observer) {
        customerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
            customerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer: customerList){
            observer.update(message);
        }
    }
}
