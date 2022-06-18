package Era;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Login {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Insert login: ");
        String login = reader.readLine();

        System.out.println("Insert password: ");
        String pass = reader.readLine();

        reader.close();

        String file = "C:\\users\\alex\\onedrive\\документы\\java_code\\files for tasks\\data.txt";
        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        while (fileReader.ready()) {
            list.add(fileReader.readLine());
        }

        for (String x : list) {
            System.out.println(x);
        }
    }
}
