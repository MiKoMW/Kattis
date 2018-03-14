import java.util.Scanner;

/**
 * Created by Mac on 2018/3/13.
 */
public class takeTwoStone {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            Integer a = Integer.parseInt(in.next());
            if(a%2 == 0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
        }


    }
}
