import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) {
        File x = new File("VANBAN.in");
        try {
            Scanner sc = new Scanner(x);
            TreeSet<String> se = new TreeSet<>();
            while (sc.hasNext()){
                String s = sc.next();
                se.add(s.toLowerCase());
            }
            se.forEach(k -> {
                System.out.println(k);
            });
        } catch (FileNotFoundException e){

        }
    }
}
