import java.util.Scanner;

/**
 * Created by Mac on 2018/3/12.
 */
public class R2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int ans = 2 * b - a;
            System.out.println(ans);

        }

    }

}
