import java.util.Scanner;

/**
 * Created by Mac on 2018/3/29.
 */
public class dicecup {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        while(in.hasNext()){

            int a = in.nextInt();
            int b = in.nextInt();

            if(a>b){
                int temp = a;
                a = b;
                b = temp;
            }

            for(int con = a+1; con <= b+1;con++ ){
                System.out.println(con);
            }


        }



    }
}
