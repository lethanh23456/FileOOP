import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SinhVien {
    String maSinhVien;
    String hoTen;
    String lop;
    String email;

    void input(Scanner sc){
        maSinhVien = sc.nextLine();
        hoTen = chuanHoa(sc.nextLine());
        lop = sc.nextLine();
        email = sc.nextLine();
    }
    String chuanHoa(String s) {
        List<String> l = new ArrayList<>();
        String x = "";
        s = s.toLowerCase() + " ";
        for ( int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == ' '){
                if(!x.isEmpty()){
                    l.add(x);
                    x = "";
                }
            }
            else {
                x  = x + s.charAt(i);
            }
        }
        x = "";
        for (int i = 0 ; i < l.size() ; i++ ){
            String k = l.get(i);
            x += k.substring(0,1).toUpperCase() + k.substring(1) + " ";
        }
        return x.substring(0,x.length()-1);
    }
    void output(){
        System.out.printf("%s %s %s %s\n", maSinhVien,hoTen,lop,email);
    }
}
class SapXepTheoMaSV implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien a, SinhVien b) {
        return a.maSinhVien.compareTo(b.maSinhVien);
    }
}
public class J07033 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            int n = Integer.parseInt(sc.nextLine());

            List<SinhVien> ds = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                SinhVien sv = new SinhVien();
                sv.input(sc);
                ds.add(sv);
            }
            Collections.sort(ds, new SapXepTheoMaSV());
            for (SinhVien sv : ds) {
                sv.output();
            }
        } catch (FileNotFoundException e) {
        }
    }
}
