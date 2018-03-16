import java.util.Scanner;

/**
 * Created by Mac on 2018/3/14.
 */
public class pot {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){

            int size =Integer.parseInt(in.next());

            long ans = 0;

            for(int con = 0; con < size; con++){
                int temp = Integer.parseInt(in.next());

                int a = temp/10;
                int b = temp%10;
                ans += Math.pow(a,b);
            }

            System.out.println(ans);






        }

    }
}
