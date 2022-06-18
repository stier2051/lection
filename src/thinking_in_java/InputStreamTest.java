package thinking_in_java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int max = 0;
        Map<Integer, Byte> map = new TreeMap<>();
        ArrayList<Byte> list = new ArrayList<>();
        ArrayList<Integer> repeatList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[inputStream.available()];

        while (inputStream.available() > 0) {
            count = inputStream.read(buffer);
        }

        for (byte b : buffer) {
            list.add(b);
        }

//        for (Byte x : list) {
//            System.out.print(x + " ");
//        }

        for (int i = 0; i < list.size()-1; i++) {
            count = 0;
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            map.put(count, list.get(i));
        }

        for (Map.Entry<Integer, Byte> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        for (Map.Entry<Integer, Byte> pair : map.entrySet()) {
            repeatList.add(pair.getKey());
        }

        for (Integer a : repeatList) {
            System.out.println(a);
        }

        System.out.println(map.get(repeatList.get(repeatList.size()-1)));


    }
}
