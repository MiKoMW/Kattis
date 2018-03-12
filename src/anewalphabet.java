import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Mac on 2018/3/12.
 */
public class anewalphabet {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        HashMap translations = new HashMap<Character, String>();
        translations.put('a', "@");
        translations.put('b', "8");
        translations.put('c', "(");
        translations.put('d', "|)");
        translations.put('e', "3");
        translations.put('f', "#");
        translations.put('g', "6");
        translations.put('h', "[-]");
        translations.put('i', "|");
        translations.put('j', "_|");
        translations.put('k', "|<");
        translations.put('l', "1");
        translations.put('m', "[]\\/[]");
        translations.put('n', "[]\\[]");
        translations.put('o', "0");
        translations.put('p', "|D");
        translations.put('q', "(,)");
        translations.put('r', "|Z");
        translations.put('s', "$");
        translations.put('t', "']['");
        translations.put('u', "|_|");
        translations.put('v', "\\/");
        translations.put('w', "\\/\\/");
        translations.put('x', "}{");
        translations.put('y', "`/");
        translations.put('z', "2");
        translations.put(' ', " ");
        while(in.hasNext()){
            String temp = in.nextLine();
            String ans  = "";
            for (char ch : temp.toCharArray() ){
                if(ch<='z' && ch>= 'a'){
                    ans += translations.get(ch);
                }
                else if(ch<='Z' && ch>= 'A'){
                    ans += translations.get(Character.toLowerCase(ch));
                }
                else{
                    ans += ch;
                }
            }
            System.out.println(ans);
        }

    }
}

