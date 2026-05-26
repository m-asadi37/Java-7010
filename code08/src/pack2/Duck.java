package pack2;

import pack1.Animal;

public class Duck extends Animal {

    @Override
    public void showInfo() {
        System.out.println("I am Duck");
//        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
}
