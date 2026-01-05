import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) {
        File x1 = new File("NHIPHAN.in");
        File x2 = new File("VANBAN.in");
        try {
            Scanner sc = new Scanner(x2);
            ObjectInputStream ios = new ObjectInputStream(new FileInputStream(x1));
            Set<String> se = new HashSet<>();
            HashMap<String,Integer> mp = new HashMap<>();
            List<String> l = (List<String>) ios.readObject();
            List<String> res = new ArrayList<>();
            for (String k : l){
                String[] words = k.toLowerCase().trim().split("\\s+");
                for(String word : words){
                    if(mp.get(word) == null){
                        mp.put(word,1);
                    }
                    else {
                        mp.put(word,mp.get(word)+1);
                    }
                }
            }
            while (sc.hasNext()){
                String k = sc.next().toLowerCase();
                if(mp.containsKey(k) && !se.contains(k)){
                    System.out.println(k);
                    se.add(k);
                }

            }


        } catch (FileNotFoundException e){

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
        }
    }
}
