import java.util.Scanner;

/**
 * Created by Mac on 2018/3/14.
 */
public class quadrant {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());

            if(a > 0 && b > 0){
                System.out.println(1);
            }
            else if(a < 0 && b > 0){
                System.out.println(2);
            }
            else if(a > 0 && b < 0){
                System.out.println(4);
            }else{
                System.out.println(3);
            }

        }


    }
}
