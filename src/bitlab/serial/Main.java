package bitlab.serial;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        File file = new File("input.txt");
        if (file.exists()) {
            users = readUsers();
        }

        while (true) {
            System.out.println("[1] ADD USER");
            System.out.println("[2] LIST USERS");
            System.out.println("[3] DELETE USER");
            System.out.println("[0] EXIT");
            int choice = in.nextInt();
            if(choice == 1) {
                System.out.println("Insert id");
                int id = in.nextInt();
                System.out.println("Insert name");
                String name = in.next();
                User u = new User(id, name);
                users.add(u);
                writeUsers(users);
            } else if (choice == 2) {
                users = readUsers();
                for(User u : users) {
                    System.out.println(u);
                }
            } else if (choice == 3) {
                System.out.println("Insert index");
                int index = in.nextInt();
                if (index >= 0 && index < users.size()) {
                    users.remove(index);
                    writeUsers(users);
                }
            }
        }
    }

    public static void writeUsers(ArrayList<User> users) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("input.txt"));
            outputStream.writeObject(users);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static  ArrayList<User> readUsers() {
        ArrayList<User> users = new ArrayList<>();
        try{
            File file = new File("input.txt");
            if (file.exists()) {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("input.txt"));
                users = (ArrayList<User>) inputStream.readObject();
            } else {
                System.out.println("No such file");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
