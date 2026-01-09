import java.util.Scanner;

class NhanVien {
    String manhanvien ;
    String hoten;
    String gioitinh ;
    String ngay ;
    String diachi ;
    String masothue ;
    String ngaykyhopdong ;
    public NhanVien (){
        this.manhanvien = "00001";
        this.hoten = "";
        this.gioitinh = "";
        this.ngay = "";
        this.diachi = "";
        this.masothue = "";
        this.ngaykyhopdong = "";
    }
    String chuanhoa (String s ) {
        String res [] = s.split("/");
        String day = res[0];
        String moth = res[1];
        String year = res[2];
        while (day.length() < 2 ) day = "0" + day ;
        while (moth.length() < 2) moth = "0" + moth;
        return  day + "/" + moth + "/" + year;
    }
    void in() {
        System.out.printf("%s %s %s %s %s %s %s",
                manhanvien,
                hoten,
                gioitinh,
                chuanhoa(ngay),
                diachi , masothue , chuanhoa(ngaykyhopdong));
    }

}
public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien();
        nv.hoten = sc.nextLine();
        nv.gioitinh = sc.nextLine();
        nv.ngay = sc.nextLine();
        nv.diachi = sc.nextLine();
        nv.masothue = sc.nextLine();
        nv.ngaykyhopdong = sc.nextLine();
        nv.in();
    }
}
