package epam;

class Animal {
    Number defineAge() {
        System.out.println("I'm a big animal");
        return 10;
    }
}

class Dog extends Animal {

    public Integer defineAge(int age) {
        System.out.println("I'm small");
        return 5;
    }
}
