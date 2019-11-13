package single.mode;

public class NotLazy {
    private static NotLazy notLazy = new NotLazy();
    public static NotLazy getInstance() {
        return notLazy;
    }
}
