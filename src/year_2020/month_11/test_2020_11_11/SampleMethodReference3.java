package year_2020.month_11.test_2020_11_11;

import java.util.function.Function;

public class SampleMethodReference3 {
    public static void main(String[] args) {
        final Person person = new Person("Joe");

        final Function<String, Person> createByLambda = name -> new Person(name);
        createByLambda.apply("Joe");

        final Function<String, Person> createByMethodRef = Person::new;
        createByMethodRef.apply("Joe");

    }
}


class Person {
    private String name;

    public Person(){}
    public Person(String name){ this.name = name;}
    public String getName(){ return this.name;}
    public void setName(String name){ this.name = name;}
}

