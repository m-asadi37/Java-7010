package pack2;

import pack1.Test;

public class Main {

    public static void main1(String[] args) {
        User u1 = new User(1, "user1");
        User u2 = new User(2, "user2");
        User u3 = null;
        Test t1 = new Test();
        User u4 = new User(2, "user3");

        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
        System.out.println(u1.equals(t1));
        System.out.println(u2.equals(u4));

        System.out.println(u1);

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(u4.hashCode());
    }

    public static void main(String[] args) {
        User u1 = new User(1, "amin");
    }
}
