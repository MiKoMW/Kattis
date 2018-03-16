import java.util.Scanner;

/**
 * Created by Mac on 2018/3/13.
 */
public class AandB {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int size = Integer.parseInt(in.next());

            int[] input = new int[100001];
            for(int con = 0; con< size;con++){
                input[Integer.parseInt(in.next())+50000]++;
            }

            long ans = 0;

            for(int con =0; con < 100001; con++ ){
                for(int subcon = 50000 - con; subcon < 100001;subcon++){
                    ans += input[con] * input[subcon] * input[con+subcon] * 2;
                }

                if(input[con] >= 2 && con >=25000 && con <= 75000){
                    ans += input[con]*(input[con]-1)*input[con*2];
                }
            }




        }


    }
}
