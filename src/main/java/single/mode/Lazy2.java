package single.mode;

public class Lazy2 {
    private volatile static  Lazy2 lazy2;

    public static Lazy2 getInstant() {
        if (lazy2 == null) {
            synchronized (Lazy2.class) {
                lazy2 = new Lazy2();
            }

        }
        return lazy2;

    }
}
