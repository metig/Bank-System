package banking;

import java.util.Observable;
import java.util.Observer;

public class Logger implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Logged");
    }
}
