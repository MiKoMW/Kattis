import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Mac on 2018/3/20.
 */
public class acm {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> score = new HashMap<>();
        int ans = 0;
        int right= 0;
        while(in.hasNext()){
            int temp = in.nextInt();
            if(temp == -1){
                break;
            }
            String st = in.next();
            String re = in.next();
            if(re.equals("right")){
                ans += score.getOrDefault(st,0) * 20 + temp;
                right++;
            }else {
                score.put(st,score.getOrDefault(st,0)+1);

            }
        }
        System.out.print(right + " " + ans);

    }

}
