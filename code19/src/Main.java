import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //key-value pair (entry)
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Aniya Mayo", 1);
        map1.put("Jericho Frye", 1);
        map1.put("Raya Strickland", 1);
        map1.put("Keegan Santiago", 4);
        map1.put("Nyla Lara", 5);
        map1.put("Caiden Cline", 7);
        map1.put("Lina Case", 199);
        map1.put("Bentlee Porter", 12);
        map1.put("Ryleigh Herman", 51);
        map1.put(null, 12);

        System.out.println(map1.put("Juelz Cantrell", 110));
        System.out.println(map1.put("Juelz Cantrell", 120));
        System.out.println(map1.get("Juelz Cantrell"));
        System.out.println(map1.get("asd"));

        System.out.println(map1);

        System.out.println(map1.containsKey("Ryleigh Herman"));
        System.out.println(map1.containsValue(200));

        int preValue = map1.remove("Caiden Cline");
        System.out.println(preValue);
        System.out.println(map1);

        System.out.println(">>> iterate over the keys");
        for (String key : map1.keySet()) {
            System.out.println(key);
        }

        System.out.println(">>> iterate over the values");
        for (int val : map1.values()) {
            System.out.println(val);
        }

        int[] arr = {12, 21, 33, 14, 65};
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            System.out.print(n);
        }
        System.out.println();

        for (int n : arr) {
            System.out.print(n);
        }
        System.out.println();

        System.out.println(">>> iterate over the entries");
        for (Map.Entry<String, Integer> kalam : map1.entrySet()) {
            System.out.println(kalam.getKey() + " : " +  kalam.getValue());
        }

        System.out.println(map1.getOrDefault("Nyla Lara", -1));
        System.out.println(map1.getOrDefault("Nyla", -1));
        System.out.println(map1.get("Nyla"));

        map1.put("Nyla Lara", 10);
        map1.putIfAbsent("Nyla Lara", 20);
        System.out.println(map1);
    }
}
