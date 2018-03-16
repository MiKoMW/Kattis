import java.util.Scanner;

/**
 * Created by Mac on 2018/3/14.
 */
public class Game2048 {
    static int[][] game = new int[4][4];

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            for(int con = 0; con<16;con++){
                game[con%4][con/4] = Integer.parseInt(in.next());
            }
            int dir = Integer.parseInt(in.next());

            for(int con = 0;con < (dir+3)%4; con++){
                rotate();
            }


            if(dir>=2)
            flip();

            reduce();

            if(dir>=2)
            flip();

            for(int con = 0;con < (dir+1)%4; con++){
                rotate();
            }

            for(int con = 0; con<16;con++){
                System.out.print(game[con%4][con/4]);
                if(con%4 == 3){
                    System.out.print("\n");
                }else{
                    System.out.print(" ");
                }

            }





        }

    }

    public static void rotate(){

        int[][] temp = new int[4][4];
        for(int con = 0;con<4;con++){
            temp[con][0] = game[0][con];
            temp[con][1] = game[1][con];
            temp[con][2] = game[2][con];
            temp[con][3] = game[3][con];
        }
        game = temp;
    }

    public static void flip(){
        int[][] temp = new int[4][4];
        for(int con = 0;con<4;con++){
            temp[con][0] = game[con][3];
            temp[con][1] = game[con][2];
            temp[con][2] = game[con][1];
            temp[con][3] = game[con][0];
        }
        game = temp;
    }

    public static void reduce(){

        for(int con = 0; con < 4 ;con++){
            for(int a = 0 ; a<=4;a++){
            if(game[con][0] == 0){
                game[con][0] = game[con][1];
                game[con][1] = game[con][2];
                game[con][2] = game[con][3];
                game[con][2] = 0;
            }
            if(game[con][1] == 0){
                game[con][1] = game[con][2];
                game[con][2] = game[con][3];
                game[con][3] = 0;
            }
            if(game[con][2] == 0){
                game[con][2] = game[con][3];
                game[con][3] = 0;
            }
            }
            if(game[con][0] == game[con][1]){
                game[con][0] = 2*game[con][0];
                game[con][1] = game[con][2];
                game[con][2] = game[con][3];
                game[con][3] = 0;
            }
            if(game[con][1] == game[con][2]){
                game[con][1] = 2*game[con][1];
                game[con][2] = game[con][3];
                game[con][3] = 0;
            }
            if(game[con][2] == game[con][3]){
                game[con][2] = 2*game[con][2];
                game[con][3] = 0;
            }
            for(int a = 0 ; a<=4;a++){
                if(game[con][0] == 0){
                    game[con][0] = game[con][1];
                    game[con][1] = game[con][2];
                    game[con][2] = game[con][3];
                    game[con][2] = 0;
                }
                if(game[con][1] == 0){
                    game[con][1] = game[con][2];
                    game[con][2] = game[con][3];
                    game[con][3] = 0;
                }
                if(game[con][2] == 0){
                    game[con][2] = game[con][3];
                    game[con][3] = 0;
                }
            }

        }

    }

}
