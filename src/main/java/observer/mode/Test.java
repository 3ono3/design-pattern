package observer.mode;

import observer.mode.observable.Observable;
import observer.mode.observer.impl.Ob1;
import observer.mode.observer.impl.Ob2;

public class Test {
    public static void main(String[] strs) {
        Observable observable = new Observable();
        observable.addObserver(new Ob1());
        observable.addObserver(new Ob2());
        observable.sendMsg();
    }
}
