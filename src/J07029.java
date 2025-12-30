import java.io.*;
import java.util.*;

public class J07029 {
    static boolean snt (int  n){
        if (n < 2) return false;
        for (int i = 2 ; i * i <= n ; i++){
            if ( n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try {
            ObjectInputStream ios  = new ObjectInputStream(new FileInputStream(x));
            List<Integer> l = (List<Integer>) ios.readObject();
            HashMap<Integer,Integer> mp = new HashMap<>();
            TreeSet<Integer>se = new TreeSet<>(Collections.reverseOrder());
            l.forEach(k -> {
                if(snt(k)) {
                    se.add(k);
                    if (mp.get(k) == null ){
                        mp.put(k,1);
                    }
                    else {
                        mp.put(k,mp.get(k)+1);
                    }
                }
            });
            int cnt = 0 ;
            for ( int k : se){
                System.out.println(k + " " + mp.get(k));
                cnt += 1 ;
                if ( cnt == 10 ) {
                    break;
                }
            };
        } catch (FileNotFoundException e){

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
