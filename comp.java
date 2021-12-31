import java.util.*;

public class comp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(2);
        list.add(0);

        list.sort((a, b) -> {
            if(a < b) {
                return -1; // swap
            }
            return 0; //dont' swap
        });

        list.forEach(System.out::println);
    }
}
