import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Mathang implements Comparable<Mathang> {
    public static  int id = 1;
    String ma ;
    String ten ;
    String donvi;
    int giamua ;
    int giaban ;
    public Mathang () {
        this.ma = "MH" + String.format("%03d",id++);
    }
    public int loinhuan () {
        return this.giaban - this.giamua;
    }
    @Override
    public int compareTo(Mathang m) {
        if (this.loinhuan() != m.loinhuan()){
            return -(this.loinhuan() - m.loinhuan());
        }
        return this.ma.compareTo(m.ma);
    }

    @Override
    public  String toString() {
        return ma + " " + ten + " " + donvi + " " + giamua + " " + giaban + " " + loinhuan();
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Mathang> l = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            Mathang mh = new Mathang();
            mh.ten = sc.nextLine();
            mh.donvi = sc.nextLine();
            mh.giamua = Integer.parseInt(sc.nextLine());
            mh.giaban = Integer.parseInt(sc.nextLine());
            l.add(mh);
        }
        Collections.sort(l);
        for (Mathang k : l) {
            System.out.println(k);
        }
    }
}
