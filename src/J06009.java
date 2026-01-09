import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Khachhang1 {
    static int id = 1;
    String makhachhang;
    String tenkhachhang;
    String gioitinh;
    String ngaysinh;
    String diachi;

    public Khachhang1() {
        this.makhachhang = "KH" + String.format("%03d", id++);
    }
}

class Mathang1 {
    static int id = 1;
    String mamathang;
    String tenmathang;
    String donvi;
    int giamua;
    int giaban;

    public Mathang1() {
        this.mamathang = "MH" + String.format("%03d", id++);
    }
}

class Hoadon1 {
    static int id = 1;
    String mahoadon;
    Khachhang1 kh;
    Mathang1 mh;
    int soluong;

    public Hoadon1() {
        this.mahoadon = "HD" + String.format("%03d", id++);
    }

    public long thanhtien() {
        return (long) soluong * mh.giaban;
    }

    @Override
    public String toString() {
        return mahoadon + " "
                + kh.tenkhachhang + " "
                + kh.diachi + " "
                + mh.tenmathang + " "
                + mh.donvi + " "
                + mh.giamua + " "
                + mh.giaban + " "
                + soluong + " "
                + thanhtien();
    }
}

public class J06009 {
    public static void main(String[] args) {
        try {
            Scanner scKH = new Scanner(new File("KH.in"));
            Scanner scMH = new Scanner(new File("MH.in"));
            Scanner scHD = new Scanner(new File("HD.in"));

            int n = Integer.parseInt(scKH.nextLine());
            Map<String, Khachhang1> mapKH = new HashMap<>();

            for (int i = 0; i < n; i++) {
                Khachhang1 kh = new Khachhang1();
                kh.tenkhachhang = scKH.nextLine();
                kh.gioitinh = scKH.nextLine();
                kh.ngaysinh = scKH.nextLine();
                kh.diachi = scKH.nextLine();
                mapKH.put(kh.makhachhang, kh);
            }


            int m = Integer.parseInt(scMH.nextLine());
            Map<String, Mathang1> mapMH = new HashMap<>();

            for (int i = 0; i < m; i++) {
                Mathang1 mh = new Mathang1();
                mh.tenmathang = scMH.nextLine();
                mh.donvi = scMH.nextLine();
                mh.giamua = Integer.parseInt(scMH.nextLine());
                mh.giaban = Integer.parseInt(scMH.nextLine());
                mapMH.put(mh.mamathang, mh);
            }


            int k = Integer.parseInt(scHD.nextLine());
            List<Hoadon1> listHD = new ArrayList<>();

            for (int i = 0; i < k; i++) {
                String[] s = scHD.nextLine().split("\\s+");

                Hoadon1 hd = new Hoadon1();
                hd.kh = mapKH.get(s[0]);
                hd.mh = mapMH.get(s[1]);
                hd.soluong = Integer.parseInt(s[2]);

                listHD.add(hd);
            }


            for (Hoadon1 hd : listHD) {
                System.out.println(hd);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
