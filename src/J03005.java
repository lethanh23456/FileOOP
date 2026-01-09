import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String k = sc.nextLine();
            k = k + " ";

            String x = "";
            List<String> l = new ArrayList<>();

            for (int i = 0; i < k.length(); i++) {
                char c = k.charAt(i);

                if (c == ' ') {
                    if (x.length() > 0) {
                        l.add(x);
                        x = "";
                    }
                } else {
                    x += c;
                }
            }


            for (int i = 1; i < l.size(); i++) {
                String word = l.get(i).toLowerCase();
                String chuan =
                        Character.toUpperCase(word.charAt(0)) +
                                word.substring(1);
                System.out.print(chuan);

                if (i < l.size() - 1) System.out.print(" ");
            }
            System.out.println(", " + l.get(0).toUpperCase());
        }
    }
}
