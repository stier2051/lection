package Example1;

import org.w3c.dom.ls.LSOutput;

public class HashTest {
    private int id;
    private String name ="";
    private int yearOFStudy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashTest hashTest = (HashTest) o;

        if (id != hashTest.id) return false;
        if (yearOFStudy != hashTest.yearOFStudy) return false;
        return name != null ? name.equals(hashTest.name) : hashTest.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + yearOFStudy;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new String("null"));
    }
}
