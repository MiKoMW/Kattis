import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mac on 2018/3/12.
 */
public class AboveAverage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            Integer size = Integer.parseInt(in.next());
            for(int con = 0; con < size; con++ ){
                Integer s = Integer.parseInt(in.next());
                int[] temp = new int[s];
                int sum = 0;
                for(int sub = 0; sub < s;sub++){
                    temp[sub] = Integer.parseInt(in.next());
                    sum += temp[sub];
                }
                double ave = (double) sum / s;
                Arrays.sort(temp);
                int b = 0;
                for(int a : temp){
                    if(a<= ave){
                        b++;
                    }
                }
                double ans = (double) (s-b)/s;
                ans = ans * 100;
                System.out.printf("%2.3f%%\n",ans);


            }
        }
    }
}
