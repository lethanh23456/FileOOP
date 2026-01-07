import java.util.Scanner;

//class ThiSinh {
//    String ten ;
//
//}


public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ngay = sc.nextLine();
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();
        Double tong = (double) (d1 + d2 + d3);
        String[] a = ngay.split("/");

        String day = a[0];
        String month = a[1];
        String year = a[2];

        while (day.length() < 2) day = "0" + day;
        while (month.length() < 2) month = "0" + month;

        String res = day + "/" + month + "/" + year;

        System.out.printf("%s %s %.1f" , ten, res , tong);

    }
}
