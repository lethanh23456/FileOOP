import java.util.Scanner;

class SV {
    String masv;
    String ten;
    String lop;
    String ngaysinh;
    float gpa;


    public SV() {
        this.masv = "B20DCCN001";
        this.ten = "";
        this.lop = "";
        this.ngaysinh = "";
        this.gpa = 0;
    }


    String chuanHoa(String s) {
        String[] a = s.split("/");
        while (a[0].length() < 2) a[0] = "0" + a[0];
        while (a[1].length() < 2) a[1] = "0" + a[1];
        return a[0] + "/" + a[1] + "/" + a[2];
    }


    void in() {
        System.out.printf(
                "%s %s %s %s %.2f",
                masv,
                ten,
                lop,
                chuanHoa(ngaysinh),
                gpa
        );
    }
}

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SV sv = new SV();
        sv.ten = sc.nextLine();
        sv.lop = sc.nextLine();
        sv.ngaysinh = sc.nextLine();
        sv.gpa = sc.nextFloat();

        sv.in();
    }
}
