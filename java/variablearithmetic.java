import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by Mac on 2018/6/2.
 */
public class variablearithmetic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(new variablearithmetic().solve(in));
    }



    public String solve(Scanner in) {
        List<String> results = new ArrayList<>();
        HashMap<String, Integer> variables = new HashMap<>();
        String line = in.nextLine();

        for ( ; ; ) {
            if ("0".equals(line)) {
                break;
            }

            if (line.contains(" = ")) {
                final String[] split = line.split(" = ");
                variables.put(split[0], Integer.valueOf(split[1]));
            } else {
                results.add(enval(line, variables));
            }

            line = in.nextLine();
        }

        return results.stream().collect(Collectors.joining("\n"));
    }




    public static String enval(String st, HashMap<String,Integer> var){

        StringTokenizer tok = new StringTokenizer(st);

        StringBuilder undefined =new StringBuilder();

        int num = 0;

        while(tok.hasMoreTokens()){
            String temp = tok.nextToken();

            if(temp.equals("+")){
                continue;
            }

            if(isNumeric(temp)){
                num+=Integer.parseInt(temp);
                continue;
            }

            int val = var.getOrDefault(temp,-1);

            if(val == -1){
                undefined.append(" + ").append(temp);
            }else{
                num += val;
            }

        }
        return resultParts.stream().collect(Collectors.joining(" + "));

        if(num == 0){
            return undefined.toString().substring(3);
        }

        return num + undefined.toString();
    }

    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }





}
