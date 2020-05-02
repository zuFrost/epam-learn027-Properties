import java.io.FileWriter;
import java.util.Properties;

public class PropertyMain {
    public static void main(String[] args) throws Exception{
        PropertyLoader loader = new PropertyLoader();
        Properties properties = loader.loadFile("datares/messages.properties");
        properties.list(System.out);
        String label = properties.getProperty("label");
        String value = properties.getProperty("abc");
        properties.put("button", "Button_B");
        String valueDefault = properties.getProperty("xyz", "Y-");
//        System.out.println(label + " " + value + " " + valueDefault);
        properties.store(new FileWriter("data/messages2.properties"), "Comment Prop");

    }
}
