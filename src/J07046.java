import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Khach implements Comparable<Khach>{
    public static int id = 1 ;
    String MaKhachHang;
    String HoTen;
    String MaPhong;
    Long SoNgayLuuTru ;
    public Khach(String HoTen , String MaPhong , Long SoNgayLuuTru){
        this.MaKhachHang = "KH" + String.format("%02d",id++);
        this.HoTen = HoTen;
        this.MaPhong = MaPhong;
        this.SoNgayLuuTru = SoNgayLuuTru;
    }
    @Override
    public int compareTo(Khach o){
        return -this.SoNgayLuuTru.compareTo(o.SoNgayLuuTru);
    }
    @Override
    public String toString(){
        return MaKhachHang + " " + HoTen + " " + MaPhong + " " + SoNgayLuuTru;
    }

}

public class J07046 {
    public static void main(String[] args) {
        File x = new File("KHACH.in");
        try {
            Scanner sc = new Scanner(x);
            int n = Integer.parseInt(sc.nextLine());
            List<Khach> l = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            for(int i = 0 ; i < n ; i++){
                String HoTen = sc.nextLine();
                String MaPhong = sc.nextLine();
                Date Den = sdf.parse(sc.nextLine());
                Date Di = sdf.parse(sc.nextLine());
                Long SoNgayLuuTru = (Di.getTime()-Den.getTime())/(1000L * 60 * 60 * 24);
                l.add(new Khach(HoTen,MaPhong,SoNgayLuuTru));
            }
            Collections.sort(l);
            for (Khach k : l){
                System.out.println(k);
            }


        } catch (FileNotFoundException e) {

        } catch (ParseException e) {

        }
    }
}
