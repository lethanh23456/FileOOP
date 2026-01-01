import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class J07031 {
    static boolean snt(int n ){
        if ( n < 2) {
            return false;
        }
        for ( int i = 2 ; i * i <= n ; i ++){
            if (n % i == 0 ){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        File x1 = new File("DATA1.in");
        File x2 = new File("DATA2.in");
        try {
            ObjectInputStream ios1 = new ObjectInputStream(new FileInputStream(x1));
            ObjectInputStream ios2 = new ObjectInputStream(new FileInputStream(x2));
            List<Integer> l1 = (List<Integer>) ios1.readObject();
            List<Integer> l2 = (List<Integer>) ios2.readObject();
            TreeSet<Integer> se1 = new TreeSet<>();
            TreeSet<Integer> se2 = new TreeSet<>(Collections.reverseOrder());
            for (int k : l1 ){
                if (snt(k)){
                    se1.add(k);
                }
            }
            for (int k : l2){
                if (snt(k)){
                    se2.add(k);
                }
            }
            for ( int k : se1){
                int p = 1000000 - k ;
                if ( k < p ) {
                    if (!se2.contains(p) && !se2.contains(k)){
                        if(se1.contains(p)){
                            System.out.println(k + " " + p);
                        }
                    }
                }
            }



        } catch (FileNotFoundException e){

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }
}
