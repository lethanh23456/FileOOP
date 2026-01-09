import java.util.Scanner;
import java.lang.Math;

class Point1 {
    double x;
    double y;

    void input(Scanner sc) {
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }

    double distance(Point1 p) {
        double x0 = this.x - p.x;
        double y0 = this.y - p.y;
        return Math.sqrt(x0 * x0 + y0 * y0);
    }

    double checkTriagle(Point1 a, Point1 b) {
        double A = this.distance(a);
        double B = this.distance(b);
        double C = a.distance(b);
        if (A + B > C && B + C > A && A + C > B)
            return A + B + C;
        return -1;
    }
}

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point1 A = new Point1();
            Point1 B = new Point1();
            Point1 C = new Point1();
            A.input(sc);
            B.input(sc);
            C.input(sc);
            double k = A.checkTriagle(B, C);
            if (k != -1)
                System.out.printf("%.3f\n", k);
            else
                System.out.println("INVALID");
        }
    }
}
