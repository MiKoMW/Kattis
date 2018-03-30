import java.util.Scanner;

/**
 * Created by Mac on 2018/3/29.
 */
public class pet {
    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        while ((in.hasNext())){
            int[] score = new int[5];
            for(int con = 0; con <20; con++){
                score[con/4] += in.nextInt();
            }

            int max = 0;
            int maxcon = 0;
            for(int con = 0 ; con <5;con++){
                if(score[con] > max){
                    maxcon = con;
                    max = score[con];
                }
            }
            maxcon++;
            System.out.println(maxcon + " "  + max);



        }


    }
}
