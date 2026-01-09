import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Sanpham2 implements Comparable<Sanpham2>{
    String masp ;
    String tensp ;
    int giaban;
    int thoihan;
    public Sanpham2(){

    }
    @Override
    public int compareTo(Sanpham2 o) {
        if(this.giaban != o.giaban){
            return -(this.giaban - o.giaban);
        }
        return this.masp.compareTo(o.masp);
    }
    @Override
    public String toString (){
        return masp + " " + tensp + " " + giaban + " " + thoihan;
    }

}
public class J07048 {
    public static void main(String[] args) {
        File x = new File("SANPHAM.in");
        try {
            Scanner sc = new Scanner(x);
            int n = Integer.parseInt(sc.nextLine());
            List<Sanpham2> l = new ArrayList<>();
            for (int i = 0 ; i < n ; i++){
                Sanpham2 sp = new Sanpham2();
                sp.masp = sc.nextLine();
                sp.tensp = sc.nextLine();
                sp.giaban = Integer.parseInt(sc.nextLine());
                sp.thoihan = Integer.parseInt(sc.nextLine());
                l.add(sp);
            }
            Collections.sort(l);
            for (Sanpham2 k : l){
                System.out.println(k);
            }
        } catch (FileNotFoundException e){

        }
    }
}
