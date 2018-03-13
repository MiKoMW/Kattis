import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Mac on 2018/3/12.
 */
public class ABC {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            Integer a = Integer.parseInt(in.next());
            Integer b = Integer.parseInt(in.next());
            Integer c = Integer.parseInt(in.next());
            String st = in.next();
            int[] ans = new int[3];
            ans[0] = a;
            ans[1] = b;
            ans[2] = c;
            Arrays.sort(ans);
            HashMap<Character,Integer> temp = new HashMap<>();
            temp.put('A',ans[0]);
            temp.put('B',ans[1]);
            temp.put('C',ans[2]);

            System.out.print(temp.get(st.charAt(0)) + " ");
            System.out.print(temp.get(st.charAt(1))+ " ");
            System.out.print(temp.get(st.charAt(2)));

        }
    }
}
