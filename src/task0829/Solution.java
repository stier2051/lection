package task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();

        while (true) {
            String city = reader.readLine();
            String family = reader.readLine();
                    if (city.isEmpty() || family.isEmpty()) {
                        break;
                    }
            map.put(city, family);
        }

        String cityName = reader.readLine();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();

            if (cityName.equals(key)) {
                System.out.println(value);
                break;
            }
        }

    }
}
