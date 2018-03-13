import java.util.Scanner;

/**
 * Created by Mac on 2018/3/12.
 */
public class SIATL {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a = Integer.parseInt(in.next());
            for(int con = 1; con<= a ; con++){
                System.out.println(con + " " + "Abracadabra");
            }

        }
    }
}
