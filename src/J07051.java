import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class KhachHang implements Comparable<KhachHang>{
    public static  int id = 1 ;
    String ma;
    String ten ;
    String sophong ;
    long songay ;
    int dichvu;
    public KhachHang (){
        this.ma = "KH" + String.format("%02d",id++);
    }
    long tinhtien(){
        int k = Integer.parseInt(this.sophong.substring(0,1));
        if(k == 1 ) return this.songay * 25 + this.dichvu;
        if(k == 2 ) return this.songay * 34 + this.dichvu;
        if(k == 3 ) return this.songay * 50 + this.dichvu;
        return this.songay * 80 + this.dichvu;
    }
    String chuanhoa(){
        String s = this.ten.trim().toLowerCase();
        String[] res = s.split("\\s+");
        String ans = "";
        for (String k : res){
            ans += k.substring(0,1).toUpperCase() + k.substring(1) + " ";

        }
        return ans.trim();
    }
    @Override
    public int compareTo(KhachHang o) {
        return -(Long.compare(this.tinhtien(), o.tinhtien()));
    }
    @Override
    public String toString (){
        return this.ma + " " + chuanhoa() + " " + this.sophong + " " + this.songay + " " + tinhtien();
    }

}
public class J07051 {
    public static void main(String[] args)  {
        File x = new File("KHACHHANG.in");
        try {
            Scanner sc = new Scanner(x);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            int n = Integer.parseInt(sc.nextLine());
            List<KhachHang> l = new ArrayList<>();
            for ( int i = 0 ; i < n ; i++){
                KhachHang kh = new KhachHang();
                kh.ten = sc.nextLine();
                kh.sophong = sc.nextLine();
                Date d1 = sdf.parse(sc.nextLine().trim());
                Date d2 = sdf.parse(sc.nextLine().trim());
                kh.dichvu = Integer.parseInt(sc.nextLine().trim());
                long songay = (d2.getTime() - d1.getTime()) / (1000L * 60 * 60 * 24) + 1;
                kh.songay = songay ;
                l.add(kh);
            }
            Collections.sort(l);

            for (KhachHang k : l) {
                System.out.println(k);
            }

        } catch (FileNotFoundException e){

        } catch (ParseException e) {

        }
    }
}
