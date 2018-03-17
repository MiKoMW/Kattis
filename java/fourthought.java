import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Mac on 2018/3/17.
 */
public class fourthought {

    public static void main(String[] args){
        HashSet<String> qe = new HashSet<String>();
        HashMap<Integer,String> nums = new HashMap<>();
        char[] op = new char[4];
        op[0] = '+';
        op[1] = '-';
        op[2] = '*';
        op[3] = '/';

        for(int a =0 ; a < 4 ; a++){
            for(int b = 0; b < 4; b++){
                for(int c = 0; c < 4; c++){

                    qe.add("4 " + op[a] + " 4 " + op[b] + " 4 " + op[c] + " 4");
                }


            }


        }
        for (String st : qe){
            nums.put(eval(st),st);
        }

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int size= Integer.parseInt(in.next());
            for(int con = 0; con < size; con++){
                int a = Integer.parseInt(in.next());
                if(nums.keySet().contains(a)){
                    System.out.println(nums.get(a) + " = " + a);
                }else{
                    System.out.println("no solution");
                }
            }

        }
    }

    public static int eval(String st){
        if(!st.contains("*")&&!st.contains("/")&&!st.contains("+")&&!st.contains("-")){
            return Integer.parseInt(st);
        }
        String temp =st;

        if(st.contains("+")){
            return eval(temp.substring(0,temp.indexOf("+")-1)) + eval(temp.substring(temp.indexOf("+")+2,temp.length()));
        }
        if(st.contains("-")){
            return eval(temp.substring(0,temp.lastIndexOf("-")-1)) - eval(temp.substring(temp.lastIndexOf("-")+2,temp.length()));
        }
        if(st.contains("*")){
            return eval(temp.substring(0,temp.indexOf("*")-1)) * eval(temp.substring(temp.indexOf("*")+2,temp.length()));
        }
        if(st.contains("/")){
            return eval(temp.substring(0,temp.lastIndexOf("/")-1)) / eval(temp.substring(temp.lastIndexOf("/")+2,temp.length()));
        }

        return 1;
    }


}
