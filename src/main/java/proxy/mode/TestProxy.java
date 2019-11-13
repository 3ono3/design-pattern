package proxy.mode;

import org.junit.Test;

public class TestProxy {
    @Test
    public void suit() {
        SchoolGirl sg = new SchoolGirl();
        sg.setName("李娇娇");
        Proxy proxy = new Proxy(sg);
        proxy.giveChocolate();
        proxy.giveDoll();
        proxy.giveFlower();
    }
}
