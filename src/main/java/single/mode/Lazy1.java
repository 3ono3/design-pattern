package single.mode;

public class Lazy1 {
    private static Lazy1 lazy1;

    public static synchronized Lazy1 getInstant() {
        if (lazy1 == null) {

            lazy1 = new Lazy1();

        }
        return lazy1;

    }
}
