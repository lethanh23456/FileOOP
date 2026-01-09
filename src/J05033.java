import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Thoigian implements Comparable<Thoigian> {
    int gio ;
    int phut ;
    int giay ;
    public Thoigian (){

    }
    @Override
    public int compareTo(Thoigian o){
        if (this.gio != o.gio){
            return this.gio - o.gio;
        }
        if (this.phut != o.phut){
            return  this.phut - o.phut;
        }
        return this.giay - o.giay ;
    }
    public String toString (){
        return gio + " " + phut + " " + giay ;
    }

}
public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Thoigian> l = new ArrayList<>();
        for( int i = 0 ; i < n ; i++ ){
            Thoigian tg = new Thoigian();
            tg.gio = sc.nextInt();
            tg.phut = sc.nextInt();
            tg.giay = sc.nextInt();
            l.add(tg);
        }
        Collections.sort(l);
        for (Thoigian k : l) {
            System.out.println(k);
        }
    }
}
