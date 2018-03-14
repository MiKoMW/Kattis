import java.util.Scanner;

/**
 * Created by Mac on 2018/3/14.
 */
public class oddities {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            Integer size = Integer.parseInt(in.next());
            for(int con = 0; con < size; con++){
                int temp = Integer.parseInt(in.next());
                if(temp%2==0){
                    System.out.println(temp + " is even");
                }else {
                    System.out.println(temp + " is odd");
                }


            }
        }

    }

}
