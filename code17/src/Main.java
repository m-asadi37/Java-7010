import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(4);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(null);
        set1.add(null);
        set1.add(7);
        System.out.println(set1);
//        System.out.println(set1.get(1));
//        System.out.println(set1.indexOf(4));

        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");
        set2.add("a");
        set2.add("b");
        set2.add("c");
        System.out.println(set2);

        Set<Person> set3 = new HashSet<>();
        set3.add(new Person("behzad"));
        set3.add(new Person("bahar"));
        set3.add(new Person("negar"));

        Person p1 = new Person("ali");
        p1.id = 4;
        System.out.println(p1.hashCode());
        set3.add(p1);

        Person p2 = new Person("bahman");
        p2.id = 4;
        System.out.println(p1.hashCode());
        set3.add(p2);


        System.out.println(p1.equals(p2));

        System.out.println(set3);
    }
}
