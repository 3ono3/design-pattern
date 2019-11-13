package decorator.mode.decorator.or;

import decorator.mode.decorator.Person;

public class SillyPerson extends Person {
    public Person person;

    public SillyPerson(Person person) {
        this.person = person;
    }

    @Override
    public void said () {
        System.out.println("I am a silly and my name is " + person.getName());
    }
}
