package visitor.mode.element.impl;

import visitor.mode.element.Action;

public class Success implements Action {
    public void MaleAction() {
        System.out.println("男人成功时");
    }

    public void FemaleAction() {
        System.out.println("女人成功时");
    }
}
