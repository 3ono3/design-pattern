package proxy.mode;

public class Proxy implements GiveGift {

    private Suitors suitors;
    Proxy(SchoolGirl mm) {
        this.suitors = new Suitors(mm);
    }
    public void giveDoll() {
        suitors.giveDoll();
    }

    public void giveFlower() {
        suitors.giveFlower();
    }

    public void giveChocolate() {
        suitors.giveChocolate();
    }
}
