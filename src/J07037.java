import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class DoanhNghiep {
    String maDoanhNghiep;
    String tenDoanhNghiep;
    int soSinhVien;
    void input(Scanner sc){
        maDoanhNghiep = sc.nextLine();
        tenDoanhNghiep = sc.nextLine();
        soSinhVien = Integer.parseInt(sc.nextLine());
    }
    void ouput(){
        System.out.printf("%s %s %s \n" , maDoanhNghiep,tenDoanhNghiep,soSinhVien);
    }
}
class Sapxep implements Comparator<DoanhNghiep>{
    @Override
    public int compare(DoanhNghiep a , DoanhNghiep b){
        return a.maDoanhNghiep.compareTo(b.maDoanhNghiep);
    }
}
public class J07037 {
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try {
            Scanner sc = new Scanner(x);
            int n = Integer.parseInt(sc.nextLine());
            List<DoanhNghiep> l = new ArrayList<>();
            for( int i = 1 ; i <= n ; i++){
                DoanhNghiep dn = new DoanhNghiep();
                dn.input(sc);
                l.add(dn);
            }
            Collections.sort(l,new Sapxep());
            for (DoanhNghiep k : l){
                k.ouput();
            }
        } catch (FileNotFoundException e){

        }
    }
}
