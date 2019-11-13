package observer.mode.observer.impl;

import observer.mode.observer.Observer;

public class Ob2 implements Observer {
    public void update() {
        System.out.println("我是 Ob2,我收到通知了");
    }
}
