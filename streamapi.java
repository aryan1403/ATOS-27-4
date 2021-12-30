import java.util.ArrayList;
import java.util.List;

public class streamapi {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(-19);
        list.add(2);
        list.add(3);
        list.add(50);

        list.stream().filter(e -> (e % 2 != 0)).forEach(System.out::println);
    }
}
