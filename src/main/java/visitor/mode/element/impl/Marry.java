package visitor.mode.element.impl;

import visitor.mode.element.Action;

import javax.accessibility.Accessible;

public class Marry implements Action {
    public void MaleAction() {
        System.out.println("男人结婚");
    }

    public void FemaleAction() {
        System.out.println("女人结婚");
    }
}
