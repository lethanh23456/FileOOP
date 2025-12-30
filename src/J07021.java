import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) {
        File x = new File("DATA.in");
        try{
            Scanner sc = new Scanner(x);
            while (true){
                String s = sc.nextLine();
                List<String> l = new ArrayList<>();
                if ( s.equals("END")){
                    break;
                }
                s += " ";
                s = s.toLowerCase();
                String tmp = "";
                for (int i = 0 ; i < s.length() ; i++){
                    if(s.charAt(i) == ' '){
                        if (tmp != "") {
                            l.add(tmp);
                            tmp = "";
                        }
                    }
                    else {
                        tmp += s.charAt(i);
                    }
                }
                l.forEach(k -> {
                    System.out.printf(Character.toUpperCase(k.charAt(0)) + k.substring(1) + " ");
                });
                System.out.println();
            }
        } catch (FileNotFoundException e) {

        }

    }
}
