package observer.mode.observable;

import javafx.beans.binding.ObjectExpression;
import observer.mode.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    public List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void sendMsg() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
