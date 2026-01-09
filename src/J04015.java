import java.util.Scanner;

class Giaovien {
    String ma;
    String hoten;
    long coban;

    public Giaovien() {
        this.ma = "";
        this.hoten = "";
        this.coban = 0;
    }

    long tinhbacluong() {
        return Long.parseLong(ma.substring(2));
    }

    long phucap() {
        String k = ma.substring(0, 2);
        if (k.equals("HT")) return 2000000;
        if (k.equals("HP")) return 900000;
        return 500000;
    }

    long thunhap() {
        return coban * tinhbacluong() + phucap();
    }

    void in() {
        System.out.printf(
                "%s %s %d %d %d",
                ma,
                hoten,
                tinhbacluong(),
                phucap(),
                thunhap()
        );
    }
}

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Giaovien gv = new Giaovien();
        gv.ma = sc.nextLine();
        gv.hoten = sc.nextLine();
        gv.coban = sc.nextLong();

        gv.in();
    }
}
