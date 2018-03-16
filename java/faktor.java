import java.util.Scanner;

/**
 * Created by Mac on 2018/3/14.
 */
public class faktor {

    public static void main(String[] args){

        Scanner in  = new Scanner(System.in);
        while(in.hasNext()){
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int ans = a*(b-1) + 1;
            System.out.println(ans);
        }
        in.close();

    }

}
