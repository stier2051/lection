package json;

public class Blog {
    private long id;
    private String name;
    private String text;

    public Blog() {

    }

    public Blog(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public Blog(long id, String name, String text) {
        this.id = id;
        this.name = name;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
