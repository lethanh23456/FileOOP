import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class MonHoc {
    String maMon;
    String tenMon;
    int soTinChi;

    void input(Scanner sc){
        maMon = sc.nextLine();
        tenMon = sc.nextLine();
        soTinChi = Integer.parseInt(sc.nextLine());
    }

    void output(){
        System.out.printf("%s %s %d\n", maMon, tenMon, soTinChi);
    }
}

class SapXepTenMon implements Comparator<MonHoc>{
    @Override
    public int compare(MonHoc a, MonHoc b){
        return a.tenMon.compareTo(b.tenMon);
    }
}

public class J07034 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            int n = Integer.parseInt(sc.nextLine());

            List<MonHoc> ds = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                MonHoc mh = new MonHoc();
                mh.input(sc);
                ds.add(mh);
            }

            Collections.sort(ds, new SapXepTenMon());

            for (MonHoc mh : ds) {
                mh.output();
            }
        } catch (FileNotFoundException e) {
        }
    }
}
