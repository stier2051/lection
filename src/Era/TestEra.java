package Era;

import java.util.Random;

public class TestEra {
    public static void main(String[] args) {
        int a = -10;
        int b = 10;
        Random random = new Random();
        System.out.println((a + random.nextInt(b-a+1)));
    }
}
