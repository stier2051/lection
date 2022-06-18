package Regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) throws IOException {

        String subject = null;
        String date = null;
        String reply_to = null;
        String reply_address = null;
        String from_name = null;
        String my_address = null;
        String my_name = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));

        while (fileReader.ready()) {
            String line = fileReader.readLine();

            Matcher matcher = Pattern.compile("^\\.*$").matcher(line);
            if (matcher.find()) break;

            Matcher matcher1 = Pattern.compile("^Subject: (.*)").matcher(line);
            if (matcher1.find()) {
                subject = matcher1.group(1);
            }

            Matcher matcher2 = Pattern.compile("^Date: (.*)").matcher(line);
            if (matcher2.find()) {
                date = matcher2.group(1);
            }

            Matcher matcher3 = Pattern.compile("^Reply-To: (.*)").matcher(line);
            if (matcher3.find()) {
                reply_to = matcher3.group(1);
            }

            Matcher matcher4 = Pattern.compile("^From: (\\S+) \\(([^()]*)\\)").matcher(line);
            if (matcher4.find()) {
                reply_address = matcher4.group(1);
                from_name = matcher4.group(2);
            }

            Matcher matcher5 = Pattern.compile("^From: (\\S+) \\(([^()]*)\\)").matcher(line);
            if (matcher5. find()) {
                my_address = matcher5.group(1);
                my_name = matcher5.group(2);
            }
        }

        fileWriter.write("To: " + reply_address + " " + "(" + from_name + ") \\n");
        fileWriter.write("From: " + my_address + " " + "(" + my_name + ")");
        fileWriter.write("Subject: " + subject);
        fileWriter.write("");
        fileWriter.write("On " + date + " " + from_name + " wrote:");
        fileReader.close();
        fileWriter.close();
    }
}