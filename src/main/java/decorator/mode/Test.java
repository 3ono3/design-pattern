package decorator.mode;

import decorator.mode.decorator.Person;
import decorator.mode.decorator.or.SillyPerson;

public class Test {
    public static void main(String[] strs) {
        Person wang = new Person();
        wang.setName("wang");
        wang.said();
        Person sillyWang = new SillyPerson(wang);
        sillyWang.said();
    }
}
