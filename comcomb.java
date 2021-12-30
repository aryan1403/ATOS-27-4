import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class comcomb {
    public static boolean isPrime(int num) {
        boolean prime = true;
        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static boolean isPalindrome(int num) {
        String s = num + "";
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        if (s.equals(r)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(11);
        list.add(2);
        list.add(111);

        list.stream().filter(e -> (isPrime(e) && isPalindrome(e)))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
