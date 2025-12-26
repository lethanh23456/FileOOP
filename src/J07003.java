import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;

public class J07003 {
    public static void main (String[] args){
        File x = new File("DATA.in");
        try {
            Scanner sc = new Scanner(x);
            BigInteger s = sc.nextBigInteger();
            while (s.toString().length() > 1){
                String str = s.toString();
                int mid = str.length()/2;
                BigInteger a = new BigInteger(str.substring(0,mid));
                BigInteger b = new BigInteger(str.substring(mid,str.length()));
                s = a.add(b);
                System.out.println(s);
            }
        } catch (FileNotFoundException e){

        }
    }
}
