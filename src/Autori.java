import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Mac on 2018/3/12.
 */
public class Autori {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String temp = in.next();
            StringTokenizer tok = new StringTokenizer(temp,"-");
            String ans = new String();
            while(tok.hasMoreTokens()){
                ans += tok.nextToken().charAt(0);
            }
            System.out.println(ans);

        }


    }
}
