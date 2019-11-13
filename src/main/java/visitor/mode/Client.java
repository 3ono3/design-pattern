package visitor.mode;

import org.junit.Test;
import visitor.mode.element.impl.Success;

public class Client {
    @Test
    public void testVisitor() {
        Success success = new Success();
        success.MaleAction();
        success.FemaleAction();
    }
}
