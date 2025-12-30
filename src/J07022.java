import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try {
            Scanner sc = new Scanner(x);
            List<String> l = new ArrayList<>();
            while (sc.hasNext()){
                String str = sc.next();
                try {
                    Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    l.add(str);
                }
            }
            Collections.sort(l);
            l.forEach(k -> {
                System.out.printf(k + " ");
            });
        } catch (FileNotFoundException e) {

        }
    }
}
