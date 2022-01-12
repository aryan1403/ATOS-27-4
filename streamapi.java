import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamapi {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(-19);
        list.add(2);
        list.add(3);
        list.add(50);

        /* long count = list.stream().filter(e -> (e%2==0)).count();
        System.out.println("There are " + count + " Even numbers inside the List."); */

        list.stream().filter(e -> (e%2!=0)).map(e -> (e+1)).collect(Collectors.toList());
    }
}
