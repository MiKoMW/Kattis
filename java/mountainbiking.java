import java.util.Scanner;

/**
 * Created by Mac on 2018/3/19.
 */
public class mountainbiking {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){

            int size= in.nextInt();
            double g = in.nextDouble();
            long[][] data = new long[size][2];
            for(int con = 0; con < size; con++){
                data[con][0] = in.nextInt();
                data[con][1] = in.nextInt();
            }

            //Emmm，能量守恒？

            double[] ans = new double[size];
            double temp = 0.0;

            for(int con = 0;con<size;con++){
                temp = Math.sqrt(temp*temp + (2 * g * Math.cos(data[size-1-con][1]*2*Math.PI/360) * data[size-1-con][0]));
                ans[con] = temp;
            }




            for(int con = 0;con<size;con++){
                temp = Math.sqrt(temp*temp + (2 * g * Math.cos(data[size-1-con][1]*2*Math.PI/360) * data[size-1-con][0]));
                System.out.println(ans[size-con-1]);
            }


        }


    }

}
