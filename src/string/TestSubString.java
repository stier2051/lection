package string;

public class TestSubString {
    public static void main(String[] args) {
        String str = "123456******9876";
        String like = str.substring(0,6) + '%' + str.substring(12,16);
        System.out.println(like);

        String name = "DAUREN SADYKOV"; //Dauren S.
        String user[] = name.split(" ");
        String nameFormat = user[0].substring(0,1) + user[0].substring(1).toLowerCase() + " " + user[1].substring(0,1) + ".";
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(nameFormat);
    }
}
