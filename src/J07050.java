import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Mathang7050 implements Comparable<Mathang7050>{
    public  static  int id = 1 ;
    String mahang;
    String tenhang ;
    String nhomhang;
    float giamua ;
    float giaban ;
    public  Mathang7050() {
        this.mahang = "MH" + String.format("%02d",id++);
    }
    float loinhuan() {
        return this.giaban - this.giamua;
    }
    @Override
    public int compareTo(Mathang7050 o){
        return Float.compare(o.loinhuan(), this.loinhuan());
    }

    @Override
    public String toString() {
        return mahang + " " + tenhang + " " + nhomhang + " " + String.format("%.2f",loinhuan());
    }


}
public class J07050 {
    public static void main(String[] args) {
        File x = new File("MATHANG.in");
        try {
            Scanner sc = new Scanner(x) ;
            List <Mathang7050> l = new ArrayList<>();
            int n = Integer.parseInt(sc.nextLine());
            for (int i = 0 ; i < n ;i++) {
                Mathang7050 mh = new Mathang7050();
                mh.tenhang = sc.nextLine();
                mh.nhomhang = sc.nextLine();
                mh.giamua = Float.parseFloat(sc.nextLine());
                mh.giaban = Float.parseFloat(sc.nextLine());
                l.add(mh);
            }
            Collections.sort(l);
            for (Mathang7050 k : l) {
                System.out.println(k);
            }

        } catch (FileNotFoundException e){

        }
    }
}
