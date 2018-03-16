import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Mac on 2018/3/16.
 */
public class everywhere {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        while(in.hasNext()){

            int size = in.nextInt();
            for(int con = 0; con < size; con++){

                HashSet<String> place = new HashSet<String>();

                int a = in.nextInt();
                for(int i = 0; i < a; i++){
                    place.add(in.next());
                }
                System.out.println(place.size());

            }
        }
        in.close();

    }
}
