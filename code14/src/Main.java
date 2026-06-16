import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main1(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }

        //sample code for arr.add(3, 10)
        int ind = 3;
        int num = 10;
        int[] arr2 = new int[11];
        arr2[ind] = num;
        for (int i = 0; i < ind; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = ind; i < arr1.length; i++) {
            arr2[i + 1] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //sample code for arr.contains(10)
        int num2 = 10;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == 10){
                System.out.println(true);
                break;
            }
        }
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        System.out.println(list1.size());

        list1.add("a");
        list1.add("b");
        list1.add("b");
        list1.add("c");
        list1.add("c");
        list1.add("c");
        list1.add("d");
        list1.add(null);
        list1.add(null);
        System.out.println(list1);
        System.out.println(list1.get(3));

        //add item in special index
        list1.add(3, "e");
        System.out.println(list1);

        //update value of a special index
        list1.set(3, "E");
        System.out.println(list1);

        System.out.println(list1.size());

        list1.remove("d");
        list1.remove(0);
        System.out.println(list1);

        System.out.println(list1.contains("E"));
    }

}
