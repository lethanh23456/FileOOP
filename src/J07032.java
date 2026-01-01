import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.*;

public class J07032 {
    static boolean checkcs(int n) {
        String str = String.valueOf(n);
        if (str.length() <= 1 || str.length() % 2 == 0) return false;
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i) - '0';
            if (x % 2 == 0) return false;
        }
        return true;
    }

    static  boolean tn (int n){
        String str = String.valueOf(n);
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        File x1 = new File("DATA1.in");
        File x2 = new File("DATA2.in");
        try{
            ObjectInputStream ios1 = new ObjectInputStream(new FileInputStream(x1));
            ObjectInputStream ios2 = new ObjectInputStream(new FileInputStream(x2));
            List<Integer> l1 = (List<Integer>) ios1.readObject();
            List<Integer> l2 = (List<Integer>) ios2.readObject();
            TreeMap<Integer,Integer> mp1 = new TreeMap<>();
            TreeMap<Integer,Integer> mp2 = new TreeMap<>();
            for (int k : l1) {
                if (tn(k) && checkcs(k)){
                    if (mp1.get(k) == null) {
                        mp1.put(k,1);
                    }
                    else {
                        mp1.put(k,mp1.get(k) +1);
                    }
                }
            }
            for (int k : l2) {
                if (tn(k) && checkcs(k)){
                    if (mp2.get(k) == null) {
                        mp2.put(k,1);
                    }
                    else {
                        mp2.put(k,mp2.get(k) +1);
                    }
                }
            }
            int cnt = 0;
            for (Integer key : mp1.keySet()) {
                if (mp2.containsKey(key)){
                    int k = mp1.get(key) + mp2.get(key);
                    System.out.println(key + " " + k);
                    cnt ++ ;
                }
                if(cnt == 10 ){
                    break;
                }
            }



        } catch (FileNotFoundException e ){

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
    }
}
