package Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        String str;
        Temperature temperature = new Temperature();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        str = reader.readLine();
        double temp;

        Matcher matcher = Pattern.compile("\\b([0-9]+) *([CF])\\b").matcher(str);

        if (matcher.find()) {
            temp = Double.parseDouble(matcher.group(1));
            if (matcher.group(2).equals("C")) {
                temperature.celsius = temp;
                temperature.fahrenheit = temperature.celsius * 9 / 5 + 32;
                System.out.println(temperature.toString());
            } else if (matcher.group(2).equals("F")) {
                temperature.fahrenheit = temp;
                temperature.celsius = (temp - 32) *5 / 9;
                System.out.println(temperature.toString());
            }
        }

//        if (matcher.find()) {
//            temperature.celsius = Double.parseDouble(str);
//            temperature.fahrenheit = temperature.celsius * 9 / 5 + 32;
//            System.out.println(temperature.toString());
//        } else {
//            System.out.println("Unknown format!");
//        }
    }
}

class Temperature {

    double celsius;
    double fahrenheit;

    @Override
    public String toString() {
        return celsius + " Celsius" + " is " + fahrenheit + " Fahrenheit";
    }
}
