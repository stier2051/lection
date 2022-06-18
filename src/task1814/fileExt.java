package task1814;

public class fileExt {
    public static void main(String[] args) {
        String fileName = "C:\\tmp\\my.hello.txt";
        String ext;
        int lastIndexOf = fileName.lastIndexOf(".");
        System.out.println(lastIndexOf);
        if (lastIndexOf == -1) {
            ext = "NO";
        } else {
            ext = fileName.substring(lastIndexOf+1);
            System.out.println(ext);
        }
    }



}
