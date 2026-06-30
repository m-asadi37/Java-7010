import java.util.*;

public class Main {

    public static void main1(String[] args) {
//        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set1 = new TreeSet<>();
        set1.add("P");
        set1.add("R");
        set1.add("A");
        set1.add("D");
//        set1.add(null);
        set1.add("C");
        set1.add("F");
        set1.add("Y");
        set1.add("M");
        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(30);
            System.out.print(n + " - ");
            set2.add(n);
        }
        System.out.println(set2);

        Set<Student> set3 = new TreeSet<>();
        set3.add(new Student("ali", 19.5));
        set3.add(new Student("amir", 18.75));
        set3.add(new Student("reza", 17.5));
        set3.add(new Student("taraneh", 16));
        set3.add(new Student("masoud", 18));
        System.out.println(set3);

        set3.stream()
                .filter(student -> student.grade > 10)
                .map(student -> student.name)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        //data-type name = value;
        int i1 = 10;
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);

        //key-value pair
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Capture A : Hello World!", 1);
        map1.put("Ch B : Variables", 20);
        map1.put("Ch C : Loops", 30);
        System.out.println(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Hello", "سلام");
        map2.put("Phone", "موبایل");
        map2.put("Air", "هوا");
        map2.put("Cloud", "ابر");


        System.out.println(map2);
        System.out.println(map2.get("Air"));
        System.out.println(map2.containsValue("ابر"));
    }
}
