import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mac on 2018/3/13.
 */
public class ArmyStrengthEZ {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            Integer size = Integer.parseInt(in.next());
            for(int con = 0; con < size; con++){
                int gSize = Integer.parseInt(in.next());
                int mSize = Integer.parseInt(in.next());
                int[] MG = new int[gSize];
                int[] MM = new int[mSize];

                for(int i = 0; i < gSize; i++){
                    MG[i] = Integer.parseInt(in.next());
                }

                for(int j = 0; j < mSize; j++){
                    MM[j] = Integer.parseInt(in.next());
                }

                Arrays.sort(MG);
                Arrays.sort(MM);

                int Gmax = MG[gSize-1];
                int Mmax = MM[mSize-1];

                if (Gmax >= Mmax) {
                    System.out.println("Godzilla");
                }else{
                    System.out.println("MechaGodzilla");
                }



            }
        }
    }
}
