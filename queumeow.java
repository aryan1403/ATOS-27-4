import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class queumeow {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        
        q.offer(10); 
        q.offer(15); 
        q.offer(5);
        q.offer(50); 
        // 50 15 10 5

        /* int counter = 0;
        int element = 0; */
        /* while(counter <= 2) {
            element = q.poll();
            counter++;
        } */
        System.out.println(q.stream().collect(Collectors.toList()).get(3));

        // System.out.println(element);

        /* for (int i = 0; i < q.size() ; i++) {
            for (int j = 0; j < q.size(); j++) {
                List<Integer> list = q.stream().collect(Collectors.toList());
                if(list.get(i) > list.get(j)) {
                    int val = list.get(i); 
                    int val2 = list.get(j);

                    int index1 = i;
                    int index2 = j;
                    list.remove(index1); 
                    list.add(index1, val2);
                    list.remove(index2); 
                    list.add(index2, val);

                    q.clear();

                    q.addAll(list);
                }
            }
        } */

        // q.forEach(System.out::println);
    }
}
