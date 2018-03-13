import java.util.Scanner;

/**
 * Created by Mac on 2018/3/12.
 */
public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String temp = in.next();
            char lastchar = temp.charAt(0);
            String ans = new String();
            ans = ans + lastchar;
            for(char ch : temp.toCharArray()){
                if(ch!= lastchar){
                    ans += ch;
                }
                lastchar = ch;

            }
            System.out.println(ans);
        }

    }
}
