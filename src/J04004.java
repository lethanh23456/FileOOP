import java.util.Scanner;

class PhanSo {
    long tu, mau;

    PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    void rutGon() {
        long u = gcd(tu, mau);
        tu /= u;
        mau /= u;
    }

    PhanSo cong(PhanSo other) {
        long newTu = this.tu * other.mau + other.tu * this.mau;
        long newMau = this.mau * other.mau;
        PhanSo res = new PhanSo(newTu, newMau);
        res.rutGon();
        return res;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        PhanSo p = new PhanSo(a, b);
        PhanSo q = new PhanSo(c, d);

        PhanSo tong = p.cong(q);
        System.out.println(tong);
    }
}
