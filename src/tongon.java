import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class tongon {
    static boolean snt(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2 ; i * i <= n ; i++){
            if(n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        File x1 = new File("DATA1.in");
        File x2 = new File("DATA2.in");
        try {
            ObjectInputStream ios1 = new ObjectInputStream(new FileInputStream(x1));
            ObjectInputStream ios2 = new ObjectInputStream(new FileInputStream(x2));
            List<Integer> l1 = (List<Integer>) ios1.readObject();
            List<Integer> l2 = (List<Integer>) ios2.readObject();
            TreeSet<Integer> se = new TreeSet<>();
            HashMap<Integer,Integer>mp = new HashMap<>();
            for(int k1 : l1) {
                se.add(k1);
            }
            for (int k : l2) {
                if (mp.get(k) == null){
                    mp.put(k,1);
                }
                else {
                    mp.put(k,mp.get(k) +1);
                }
            }
            for (int i : se) {
                int p = 1000000 - i;
                if(i < p && se.contains(p)){
                    if(snt(i) && snt(p)){
                        if(!mp.containsKey(i) && !mp.containsKey(p)){
                            System.out.println(i + " " + p);
                        }
                    }
                }
            }

        } catch (FileNotFoundException e) {

        } catch (ClassNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
