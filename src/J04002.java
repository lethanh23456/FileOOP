import java.util.Scanner;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double cd = sc.nextDouble();
        Double cr = sc.nextDouble();
        String mau = sc.next();
        Double cv = (cd + cr ) * 2;
        Double dt =  cd * cr;
        if (cd <= 0 || cr <= 0) {
            System.out.printf("INVALID");
            return;
        }
        String res = mau.substring(0,1).toUpperCase() + mau.substring(1).toLowerCase();
        System.out.printf("%d %d %s", cv.intValue(), dt.intValue(), res);

    }
}
