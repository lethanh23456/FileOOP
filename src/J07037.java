import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class DoanhNghiep {
    String maDoanhNghiep;
    String tenDoanhNghiep;
    int soSinhVien;

    public DoanhNghiep(String ma, String ten, int soSV) {
        this.maDoanhNghiep = ma;
        this.tenDoanhNghiep = ten;
        this.soSinhVien = soSV;
    }

    public void output() {
        System.out.printf("%s %s %d\n",
                maDoanhNghiep, tenDoanhNghiep, soSinhVien);
    }
}

class Sapxep implements Comparator<DoanhNghiep> {
    @Override
    public int compare(DoanhNghiep a, DoanhNghiep b) {
        return a.maDoanhNghiep.compareTo(b.maDoanhNghiep);
    }
}

public class J07037 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DN.in"));
            int n = Integer.parseInt(sc.nextLine());

            List<DoanhNghiep> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                int soSV = Integer.parseInt(sc.nextLine());

                list.add(new DoanhNghiep(ma, ten, soSV));
            }

            Collections.sort(list, new Sapxep());

            for (DoanhNghiep dn : list) {
                dn.output();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}