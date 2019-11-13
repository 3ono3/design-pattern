package proxy.mode;

public class Suitors implements GiveGift{

    private SchoolGirl mm;

    public Suitors(SchoolGirl mm) {
        this.mm = mm;
    }

    public void giveDoll() {
        System.out.println("送给" + mm.getName() + "洋娃娃");
    }

    public void giveFlower() {
        System.out.println("送给" + mm.getName() + "鲜花");
    }

    public void giveChocolate() {
        System.out.println("送给" + mm.getName() + "巧克力");
    }
}
