import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class LoaiPhong implements Comparable<LoaiPhong> {
    String KyHieu;
    String Ten;
    int DonGia;
    double Phi;

    public LoaiPhong(String s) {
        String[] a = s.split("\\s+");
        KyHieu = a[0];
        Ten = a[1];
        DonGia = Integer.parseInt(a[2]);
        Phi = Double.parseDouble(a[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.Ten.compareTo(o.Ten);
    }

    @Override
    public String toString() {
        return KyHieu + " " + Ten + " " + DonGia + " " + String.format("%.2f", Phi);
    }
}



class SapXepPhong implements Comparator<LoaiPhong> {
    @Override
    public int compare(LoaiPhong a , LoaiPhong b){
        return a.Ten.compareTo(b.Ten);
    }
}
public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
