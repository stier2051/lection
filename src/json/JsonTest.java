package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonTest {
    public static void main(String[] args) {
        Blog blog = new Blog();
        blog.setName("first blog");
        blog.setText("lorem ipsum");

        Gson gson = new Gson();
        String response = gson.toJson(blog);
        System.out.println(response);

//        ObjectMapper objectMapper = new ObjectMapper();
//        String str = objectMapper.writeValueAsString(blog);
//        System.out.println(str);
    }
}
