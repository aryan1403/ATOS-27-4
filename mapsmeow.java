import java.util.HashMap;
import java.util.Map;

public class mapsmeow {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "Aaryan");
        map.put("name2", "Naveen");

        map.forEach((a, b) -> System.out.println(a + " : " + b));
    }
}
