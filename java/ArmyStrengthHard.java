import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by Mac on 2018/3/13.
 */
public class ArmyStrengthHard {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            Integer size = Integer.parseInt(in.next());
            for(int con = 0; con < size; con++){
                int gSize = Integer.parseInt(in.next());
                int mSize = Integer.parseInt(in.next());
                long [] MG = new long [gSize];
                long [] MM = new long [mSize];

                for(int i = 0; i < gSize; i++){
                    MG[i] = Integer.parseInt(in.next());
                }

                for(int j = 0; j < mSize; j++){
                    MM[j] = Integer.parseInt(in.next());
                }

                Arrays.sort(MG);
                Arrays.sort(MM);

                long  Gmax = MG[gSize-1];
                long  Mmax = MM[mSize-1];

                if (Gmax >= Mmax) {
                    System.out.println("Godzilla");
                }else{
                    System.out.println("MechaGodzilla");
                }



            }
        }
    }
}