import java.util.Scanner;

public class reversestr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        char[] arr = name.toCharArray();

        for (int i = 0; i < name.length() / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
        for (char c : arr) {
            System.out.print(c);
        }
        sc.close();
    }
}
