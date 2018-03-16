import java.util.Scanner;

/**
 * Created by Mac on 2018/3/12.
 */
public class ThreeDPS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            Integer a = Integer.parseInt(in.next());
            double temp = Math.log(a)/Math.log(2);
            int ans = (int) Math.ceil(temp) + 1;
            System.out.println(ans);
        }
    }
}
