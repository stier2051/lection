package Regex;

public class Test3 {
    public static void main(String[] args) {
        String phone = "+7(777)298-75-8 5";
        phone = phone.replaceAll("[^0-9]","");
        System.out.println(phone);
    }
}
