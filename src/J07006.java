import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream("DATA.in"));
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        ArrayList<Integer> l = (ArrayList<Integer>) is.readObject();
        for (int i = 0 ; i < l.size() ; i++ ){
            if (mp.get(l.get(i)) == null) {
                mp.put(l.get(i),1 );
            }
            else {
                mp.put(l.get(i), mp.get(l.get(i)) +1 );
            }
        }
        mp.forEach((k,v) -> {
            System.out.println(k+" "+v);
        });
    }
}
