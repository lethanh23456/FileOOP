import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class J07004 {
    public static void main (String[] args){
        File x = new File("DATA.in");
        try {
            Scanner sc = new Scanner(x);
            HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
            while (sc.hasNext()){
                int n = sc.nextInt();
                if (mp.get(n) == null) {
                    mp.put(n,1);
                }
                else {
                    mp.put(n, mp.get(n) + 1);
                }
            }
            mp.forEach((k,v) -> {
                System.out.println(k + " " + v);
            });

        } catch (FileNotFoundException e){

        }
    }
}
