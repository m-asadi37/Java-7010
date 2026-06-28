import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list0 = new ArrayList<>();

        List<String> list1 = new LinkedList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("d");
        list1.add("e");
        list1.add(null);
        list1.add(null);

        System.out.println(list1.get(5));
        System.out.println(list1.indexOf("d"));

        List<String> list2 = list1.subList(2, 5);
        System.out.println(list1);
        System.out.println(list2);

        for (String s : list1) {
            System.out.println("list1 contains this element: " + s);
        }

    }
}
