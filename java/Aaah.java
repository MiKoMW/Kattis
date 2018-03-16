import java.util.Scanner;

/**
 * Created by Mac on 2018/3/12.
 */
public class Aaah {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String can = in.next();
            String require = in.next();
            if(can.length() >= require.length()){
                System.out.println("go");
            }else{
                System.out.println("no");
            }
        }

    }

}
