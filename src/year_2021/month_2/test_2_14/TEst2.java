package year_2021.month_2.test_2_14;

public class TEst2 {

    public static void main(String[] args) {
        new TEst2().test();
    }

    void test () {
        Animal a = new Animal();

        a.name = "test";

        test2(a);

        System.out.println(a);
    }

    void test2 (Animal a) {

        a = new Animal();

        a.name ="test2";

        System.out.println(a);
    }
}

class Animal  {
    public String name;

    public String toString() {
        return name;
    }
}
