import java.util.ArrayList;
import java.util.List;

public class comcomb {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2000);
        list.add(123);
        list.add(0);
        list.add(12);
        list.add(-10);

        list.sort((a, b) -> {
            if(a < b) {
                return -1;
            }
            return 0;
        });

        list.forEach(System.out::println);
    }
}
