import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class J07015 {
    static boolean snt (int n ) {
        if (n < 2) return false;
        for (int i = 2 ; i * i <= n ; i++){
            if (n % i == 0 ) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(x));
            List<Integer> l = (List<Integer>) ois.readObject();
            TreeMap<Integer,Integer> mp = new TreeMap<>();
            l.forEach(k -> {
                if (snt(k)) {
                    if (mp.get(k) == null) {
                        mp.put(k,1);
                    }
                    else {
                        mp.put(k,mp.get(k)+1);
                    }
                }
            });
            mp.forEach((k,v)-> {
                System.out.println(k +" " + v);
            });
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }
}
