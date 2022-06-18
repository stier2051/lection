package epam;

import java.math.BigDecimal;

class task1 {}
class B extends task1 {}
class C extends B {}
class Main {
    public static void main(String[] args) {
        task1 object1 = new task1();
        C object2 = new C();
        //C object3 = (C) object1;
        object1 = object2;
        object1 = (B) object2;
    }
}