import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07010 {
    static String toD(String s){
        String [] d = s.split("/");
        for (int i = 0 ; i <= 1 ; i++){
            while(d[i].length() < 2) d[i] = "0" + d[i];
        }
        return d[0] +"/" + d[1] +"/"+d[2];
    }
    static String msv(int i ){
        String str = Integer.toString(i);
        while (str.length() < 3) str = "0" + str ;
        return "B20DCCN" + str ;
    }
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try {
            Scanner sc = new Scanner(x);
            int t = sc.nextInt();
            for (int i = 1 ; i <= t ; i++){
                sc.nextLine();
                System.out.printf("%s %s %s %s %.2f\n",
                        msv(i),
                        sc.nextLine(),
                        sc.nextLine(),
                        toD(sc.next()),
                        sc.nextFloat());
            }
        } catch (FileNotFoundException e) {

        }
    }
}
