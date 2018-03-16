import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mac on 2018/3/12.
 */
public class Sibice {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int size = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next());
            int y= Integer.parseInt(in.next());
            ArrayList<Integer> input = new ArrayList<>();
            for (int con = 0;  con < size; con++ ){
                input.add(Integer.parseInt(in.next()));
            }

            float max = x*x + y*y;

            for (Integer a : input){
                if(a*a > max){
                    System.out.println("NE");
                }else{
                    System.out.println("DA");
                }
            }

        }

    }
}
