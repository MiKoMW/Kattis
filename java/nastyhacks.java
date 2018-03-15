import java.util.Scanner;

/**
 * Created by Mac on 2018/3/14.
 */
public class nastyhacks {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        while(in.hasNext()){

            Integer size = Integer.parseInt(in.next());
            for(int con = 0; con < size ; con++){

                int a = Integer.parseInt(in.next());
                int b = Integer.parseInt(in.next());
                int c = Integer.parseInt(in.next());
                if(b > a+c){
                    System.out.println("advertise");
                }else if(b == a + c){
                    System.out.println("does not matter");
                }else {
                    System.out.println("do not advertise");
                }
            }

        }

        in.close();
    }
}
